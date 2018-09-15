package com.pkb.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pkb.board.model.service.BoardService;
import com.pkb.board.model.vo.Board;

/**
 * Servlet implementation class InsertOnebyOneQnaServlet
 */
@WebServlet("/insertQna.bo")
public class InsertOnebyOneQnaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertOnebyOneQnaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("onetitle");
		String content = request.getParameter("onecontent");
		
		System.out.println(title);
		System.out.println(content);
	
		
		Board b = new Board ();
		
		b.setArticle_title(title);
		b.setArticle_contents(content);
		
		int result = new BoardService().insertOnebyOneQna(b);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
