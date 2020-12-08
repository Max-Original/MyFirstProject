package com.nerdysoft;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nerdy.service.CoordinatsService;
import com.nerdy.service.impl.CoordinatsServiceImpl;

@WebServlet("/drawDBCoordinats")
public class CoordinatsDB extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private CoordinatsService coordinatsService = CoordinatsServiceImpl.getCoordinatsService();

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int coordinatsId = Integer.parseInt(request.getParameter("savedCoordinates"));

		Coordinats coordinats = coordinatsService.readById(coordinatsId);
		
		Integer firstA = coordinats.getFirstA();
		Integer firstB = coordinats.getFirstB();
		
		Integer secondA = coordinats.getSecondA();
		Integer secondB = coordinats.getSecondB();
		
		Integer thirdA = coordinats.getThirdA();
		Integer thirdB = coordinats.getThirdB();
		
		Integer fourthA = coordinats.getFourthA();
		Integer fourthB = coordinats.getFourthB();
		
		request.setAttribute("firstA", firstA);
		request.setAttribute("firstB", firstB);
		request.setAttribute("secondA", secondA);
		request.setAttribute("secondB", secondB);
		request.setAttribute("thirdA", thirdA);
		request.setAttribute("thirdB", thirdB);
		request.setAttribute("fourthA", fourthA);
		request.setAttribute("fourthB", fourthB);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
