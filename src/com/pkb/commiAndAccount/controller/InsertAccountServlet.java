package com.pkb.commiAndAccount.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pkb.commiAndAccount.model.service.CommiAndAccountService;
import com.pkb.commiAndAccount.model.vo.Account;

/**
 * Servlet implementation class InsertAccountServlet
 */
@WebServlet("/insertAccount.caa")
public class InsertAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bank = request.getParameter("bank");
		String accountNo = request.getParameter("accountNo");
		
		// 세션에서 받아오도록 변경해야함...
		int user_no = 21;
		
		Account ac = new Account();
		ac.setBankName(bank);
		ac.setAccountNo(accountNo);
		
		int result = new CommiAndAccountService().insertAccount(ac,user_no);
		
		
		String page = "";
		if (result > 0) {
			page = "views/admin/defaultSet/commissionAndAccountMain.jsp";
			request.setAttribute("caa", new CommiAndAccountService().selectCAAList());
		} else {
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "(관리자 페이지)무통장 입금용 계좌추가 실패");
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
