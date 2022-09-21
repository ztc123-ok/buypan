package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.impl.SellerImpl;
import com.vo.Seller;

/**
 * Servlet implementation class servlet_xgsjmm
 */
@WebServlet("/servlet_xgsjmm")
public class servlet_xgsjmm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_xgsjmm() {
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
		
		String pwd1=request.getParameter("pwd1");
		String pwd2=request.getParameter("pwd2");
		String pwd3=request.getParameter("pwd3");
		
		if(pwd2.equals(pwd3)) {
			Seller se=new Seller();
			se.setSellerphone(pwd1);
			se.setSellerpw(pwd2);
			SellerImpl lj=new SellerImpl();
			try {
				lj.updatesellerpw(se);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.getRequestDispatcher("xiugairs.jsp").forward(request, response);
			
		}
		
		
	}

}
