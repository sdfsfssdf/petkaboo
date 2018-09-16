package com.pkb.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pkb.board.model.service.BoardService;
import com.pkb.board.model.vo.Board;
import com.pkb.member.model.vo.User;

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
	
		HttpSession session = request.getSession();
		User loginUser = (User)session.getAttribute("loginUser");
		String writer = String.valueOf(loginUser.getUser_no());
		
		Board b = new Board ();
		
		b.setArticle_title(title);
		b.setArticle_contents(content);
		b.setUser_no(Integer.parseInt(writer));
		
		int result = new BoardService().insertOnebyOneQna(b);
		
		String page = "";
		if(result > 0){
			page = "views/myPage/onebyoneList.jsp";
			request.setAttribute("list", new BoardService().selectOnebyOneList());
			
		}else{
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "1:1문의 등록 실패!");
			
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
