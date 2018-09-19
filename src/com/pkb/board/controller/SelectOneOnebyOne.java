package com.pkb.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pkb.board.model.service.BoardService;
import com.pkb.board.model.vo.Board;

/**
 * Servlet implementation class SelectOneOnebyOne
 */

//목록중 하나를 클릭하여 상세 조회!
@WebServlet("/selectOneOnebyOne.bo")
public class SelectOneOnebyOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectOneOnebyOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		System.out.println(num);
		
		Board b = new BoardService().selectOneOnebyOne(num);
		
		
		
		String page = "";
		System.out.println("넘어왔나요?");
		
		if(b != null){
			System.out.println(b.getArticle_title());
			page = "views/myPage/onebyoneDetail.jsp";
			request.setAttribute("b", b);
			
			System.out.println("넘어왔나요????");
		}else{
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "1:1문의 내역 상세조회 실패!");
			
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
