package com.pkb.member.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pkb.common.MyFileRenamePolicy;
import com.pkb.member.model.service.FileService;
import com.pkb.member.model.service.UserService;
import com.pkb.member.model.vo.User;
import com.oreilly.servlet.MultipartRequest;
import javafx.application.Application;

/**
 * Servlet implementation class InsertNicknameServlet
 */
@WebServlet("/insert.tn")
public class InsertNicknameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertNicknameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String AbsolutePath = request.getSession().getServletContext().getRealPath("/");
		
		String finalPath = "images\\profileImagesUpload\\";
		
		MultipartRequest mr = new MultipartRequest(request, AbsolutePath + finalPath, 1024*768, "UTF-8", new MyFileRenamePolicy());
		
		String name = mr.getParameter("profile");
		String upload =  mr.getFilesystemName("profile");
		String original = mr.getOriginalFileName("profile");
		
		File file = mr.getFile("profile");
		
		com.pkb.member.model.vo.File f = new com.pkb.member.model.vo.File();
		
		f.setFile_name(upload);
		f.setFile_path(finalPath);
		f.setUser_no(Integer.valueOf(((User) (request.getSession().getAttribute("loginUser"))).getUser_no()));
		
		int profileResult = new FileService().InsertProfile(f);
		
		if(profileResult ==1){
			String nickname = mr.getParameter("nickname");
			String email = (String)request.getSession().getAttribute("email");
			String address= (String)request.getSession().getAttribute("address");
			int result = new UserService().changeNickname(nickname, email);
			
			if(result > 0){
				HttpSession session = request.getSession();
				User u = (User)session.getAttribute("loginUser");
				u.setNickname(nickname);
				// 키값은 중복이 안된다. 
				session.setAttribute("loginUser", u);
				response.sendRedirect("views/myPage/modifyMemberInfoMain.jsp");
			}else{
				System.out.println("실패");
			}
		}else{
			String nickname = mr.getParameter("nickname");
			String email = (String)request.getSession().getAttribute("email");
			String address= (String)request.getSession().getAttribute("address");
			int result = new UserService().changeNickname(nickname, email);
			
			if(result > 0){
				HttpSession session = request.getSession();
				User u = (User)session.getAttribute("loginUser");
				u.setNickname(nickname);
				// 키값은 중복이 안된다. 
				session.setAttribute("loginUser", u);
				response.sendRedirect("views/myPage/modifyMemberInfoMain.jsp");
			}else{
				System.out.println("실패");
			}
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
