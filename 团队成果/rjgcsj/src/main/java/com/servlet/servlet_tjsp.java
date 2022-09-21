package com.servlet;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vo.Wares;

/**
 * Servlet implementation class servlet_tjsp
 */
@WebServlet("/servlet_tjsp")
public class servlet_tjsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_tjsp() {
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
		
		
		Wares wa=new Wares();
		String id=request.getParameter("waresid");
		int iid=Integer.valueOf(id);
		BigDecimal bd=new BigDecimal(request.getParameter("waresname"));
		
		wa.setWaresid(iid);
		wa.setWaresname(request.getParameter("waresname"));
		wa.setWaresprice(bd);
		wa.setWaresnumber(Integer.valueOf(request.getParameter("waresnumber")));
		wa.setShopid(Integer.valueOf(request.getParameter("shopid")));
		wa.setWaresstate(request.getParameter("waresstate"));
		wa.setWarespicture(request.getParameter("warespicture"));
		wa.setWaresclass(request.getParameter("waresclass"));
		wa.setMatkering(request.getParameter("matketing"));
		
		
		
	}

}
