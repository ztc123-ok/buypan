package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.impl.BuyerImpl;
import com.dao.impl.OrderImpl;
import com.vo.Buyer;
import com.vo.Order;

/**
 * Servlet implementation class servlet_scjl
 */
@WebServlet("/servlet_scjl")
public class servlet_scjl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_scjl() {
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
		
		String ordertime=request.getParameter("ordertime");
		String waresid=request.getParameter("waresid");
		String buyerid=request.getParameter("buyerid");
		String waresnumber=request.getParameter("waresnumber");
		String buyerphone=request.getParameter("buyerphone");
		String buyeraddress=request.getParameter("buyeraddress");
		
		Order or=new Order();
		OrderImpl lj1=new OrderImpl();
		//or.setOrdertime(ordertime);
		Date date = new Date();

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
		String str = format.format(date);
		or.setOrdertime(str);
		or.setWaresid(Integer.valueOf(waresid));
		or.setBuyerid(Integer.valueOf(buyerid));
		or.setWaresnumber(Integer.valueOf(waresnumber));
		try {
			lj1.insertorder(or);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Buyer bu =new Buyer();
		BuyerImpl lj2=new BuyerImpl();
		bu.setBuyerphone(buyerphone);
		bu.setBuyeraddress(buyeraddress);
		bu.setBuyerid(Integer.valueOf(buyerid));
		
		try {
			lj2.updatebuyer(bu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("cus_buyitrs.jsp").forward(request, response);
		/*<form action="tianxiers.jsp？ordertime=df.format(new java.util.Date())" >
		收货地址：<input type="text" name="buyeraddress"><br/>
		电话号码：<input type="text" name="buyerphone"><br/>
		订单id：<input type="text" name="orderid"><br/>
		商品id：<input type="text" name="waresid"><br/>
		客户id：<input type="text" name="buyerid"><br/>
		购买数量：<input type="text" name="waresnumber"><br/>*/
		
	}

}
