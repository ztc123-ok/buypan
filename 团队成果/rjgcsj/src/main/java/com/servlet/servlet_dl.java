package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.impl.SellerImpl;
import com.dao.impl.WaresImpl;
import com.vo.Seller;
import com.vo.Wares;

/**
 * Servlet implementation class servlet_dl
 */
@WebServlet("/servlet_dl")
public class servlet_dl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_dl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		System.out.println(id);
		System.out.println(pwd);
		SellerImpl sel =new SellerImpl();
		
		List<Seller> asd =new ArrayList<Seller>();
		try {
			asd=sel.selectsellerpw();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Iterator<Seller> it=asd.iterator();
		Seller qwe=null;
		while(it.hasNext()){
			qwe=new Seller();
			qwe=(Seller)it.next();
			String dd=String.valueOf(qwe.getSellerid());
			if(dd.equals(id)) {
				if(qwe.getSellerpw().equals(pwd)) {
					request.getRequestDispatcher("admin_function.jsp").forward(request, response);
				}
			}
			
		}
		request.getRequestDispatcher("dlsb.jsp").forward(request, response);	
	}

}
