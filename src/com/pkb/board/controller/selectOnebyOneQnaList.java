package com.pkb.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pkb.board.model.service.BoardService;
import com.pkb.board.model.vo.Board;
import com.pkb.common.Paging;

/**
 * Servlet implementation class selectOnebyOneQnaList
 */

/*1:1문의 조회*/
@WebServlet("/selectOnebyOneList.bo")
public class selectOnebyOneQnaList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectOnebyOneQnaList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage;
		int limit;
		int maxPage;
		int startPage;
		int endPage;
		
		
		currentPage = 1;
		
		limit = 10;
		
		if(request.getParameter("currentPage") != null){
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
			
		}
		
		
		int listCount = new BoardService().getOnebyOneListCount(); 
		
		maxPage = (int)((double)listCount / limit + 0.9);
		
		startPage = (((int)((double)currentPage / limit + 0.9))-1) * limit + 1;
		
		endPage = startPage + limit - 1;
		
		if(maxPage < endPage){
			endPage = maxPage;
		}
		
		Paging p = new Paging(currentPage, listCount, limit, maxPage, startPage, endPage);
			
		ArrayList<Board> list = new BoardService().selectOnebyOneList(currentPage, limit);
		String page = "";
		
		
		if(list != null) {
			page = "views/myPage/onebyoneList.jsp";
			request.setAttribute("list", list);
			request.setAttribute("p", p);
			
			
		}else{
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "게시판 조회 실패");
			
			
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
