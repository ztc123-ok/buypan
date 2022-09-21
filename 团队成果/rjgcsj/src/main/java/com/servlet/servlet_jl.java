package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.impl.OrderImpl;
import com.vo.Order;
import com.vo.Wares;


/**
 * Servlet implementation class servlet_jl
 */
@WebServlet("/servlet_jl")
public class servlet_jl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_jl() {
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
		
		OrderImpl ord=new OrderImpl();
		
		List<Order> asd =new ArrayList<Order>();
		HttpSession session =request.getSession();
		try {
			asd=ord.selectorder();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		session.setAttribute("zcxx",asd);
		request.getRequestDispatcher("lishishop.jsp").forward(request, response);
	}

}
