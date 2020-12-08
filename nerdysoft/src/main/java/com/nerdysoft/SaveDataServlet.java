package com.nerdysoft;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nerdy.service.CoordinatsService;
import com.nerdy.service.impl.CoordinatsServiceImpl;

@WebServlet("/saving")
public class SaveDataServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private CoordinatsService coordinatsService = CoordinatsServiceImpl.getCoordinatsService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer firstA = Integer.parseInt(request.getParameter("firstA"));
		Integer firstB = Integer.parseInt(request.getParameter("firstB"));

		Integer secondA = Integer.parseInt(request.getParameter("secondA"));
		Integer secondB = Integer.parseInt(request.getParameter("secondB"));

		Integer thirdA = Integer.parseInt(request.getParameter("thirdA"));
		Integer thirdB = Integer.parseInt(request.getParameter("thirdB"));

		Integer fourthA = Integer.parseInt(request.getParameter("fourthA"));
		Integer fourthB = Integer.parseInt(request.getParameter("fourthB"));

		if (!(firstA == null) || !(secondA == null) || !(firstB == null) || !(secondB == null) || !(thirdA == null)
				|| !(thirdB == null) || !(fourthA == null) || !(fourthB == null)) {
			coordinatsService.creat(new Coordinats(firstA, firstB, secondA, secondB, thirdA, thirdB, fourthA, fourthB));
		}

		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
