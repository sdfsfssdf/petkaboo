package com.pkb.petsitterService.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pkb.petsitterService.model.service.PetsitterServeDetailRegService;
import com.pkb.petsitterService.model.service.PetsitterServeRegService;
import com.pkb.petsitterService.model.vo.PetsitterServiceData;
import com.pkb.petsitterService.model.vo.PetsitterServiceDataDetail;

/**
 * Servlet implementation class InsertPetsitterService
 */
@WebServlet("/insertPetService.do")
public class InsertPetsitterService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPetsitterService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 펫시터 서비스 값 꺼내오기
		String pet_category = request.getParameter("pet_category");
		String contract_type = request.getParameter("contract_type");
		String contract_days = request.getParameter("contract_days");
		
		// String 으로 꺼내온 후 Date로 변형해야 함
		String contract_start = request.getParameter("contract_start");
		String contract_end = request.getParameter("contract_end");
		
		// 서비스 디테일 값 꺼내오기
		String service_charge = request.getParameter("service_charge");
		String pet_count = request.getParameter("pet_count");
		String service_detail = request.getParameter("service_detail");
		String service_restrict = request.getParameter("service_restrict");
		
		// 로그인 유저 세션에서 유저 no를 가져오는 코드를 여기에 삽입
		// to do something...
		
		// 서비스와 서비스 디테일을 분리해서 서비스로 넘겨야 한다
		
		// 펫시터 서비스 vo 객체 생성 및 값 넣기
		PetsitterServiceData psd = new PetsitterServiceData();
		// psd.setUser_no(user_no);	// 로그인 세션에서 가져온 유저 no 세팅
		psd.setContract_days(contract_days);
		psd.setContract_type(contract_type);
		// contract_start와 contract_end는 Date로 형변환 후 집어넣어야 한다
		// psd.setContract_start((Date)(contract_start)); // 가짜코드
		// psd.setContract_end((Date)(contract_end)); // 가짜코드
		// 테스트용 코드
		System.out.println("psd 객체의 정보는: " + psd);

		// 펫시터 서비스 상세 vo 객체 생성 및 값 넣기
		PetsitterServiceDataDetail psdDetail = new PetsitterServiceDataDetail();
		psdDetail.setPet_category(Integer.parseInt(pet_category));
		psdDetail.setPet_count(Integer.parseInt(pet_count));
		psdDetail.setService_detail(service_detail);
		psdDetail.setService_restrict(service_restrict);
		// 테스트용 코드
		System.out.println("psdDetail 객체의 정보는: " + psdDetail);
		
		// 펫시터 등록 서비스로 객체 넘기기
		int result = new PetsitterServeRegService().insertPetsitterService(psd);
		
		// 펫시터 상세 정보 등록 서비스로 객체 넘기기
		int result2 = new PetsitterServeDetailRegService().insertPetsitterServiceDetail(psdDetail);
		
		// 넘겨줄 페이지 초기화
		String page = "";
		
		// 둘 다 성공시에만 성공처리
		if(result > 0 && result2 > 0){
			// selectList.bo를 펫시터 목록 조회 서블릿으로 대체
			response.sendRedirect(request.getContextPath() + "/selectList.bo");
		}else{
			request.setAttribute("msg", "펫시터 등록 실패!");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		}

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}