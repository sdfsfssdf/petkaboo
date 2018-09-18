package com.pkb.petsitterService.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search.do")
public class SearchPetsitter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchPetsitter() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchKeyword = request.getParameter("searchKeyword");
		
		// 테스트코드
		// System.out.println(searchKeyword);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
