package com.pkb.commiAndAccount.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pkb.commiAndAccount.model.service.CommiAndAccountService;
import com.pkb.commiAndAccount.model.vo.CommissionAndAccountList;

/**
 * Servlet implementation class SelectListCAAListServlet
 */
@WebServlet("/caaList.caa")
public class SelectListCAAListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectListCAAListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CommissionAndAccountList caa = new CommiAndAccountService().selectCAAList(); 
		
		String page="" ;
		if(caa != null){
			page="views/admin/defaultSet/commissionAndAccountMain.jsp";
			request.setAttribute("caa", caa);
		} else {
			page="views/common/errorPage.jsp";
			request.setAttribute("msg", "(관리자 페이지)수수료, 계좌 설정 페이지 조회 실패");
		}
		
		RequestDispatcher view = request.getRequestDispatcher(page);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
