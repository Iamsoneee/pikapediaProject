package com.pikapedia.detail;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DetailC")
public class DetailC extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("input.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DetailDAO.searchPoketmon(request);
		DetailDAO.typePoketmon(request);
		request.setCharacterEncoding("utf-8");
		request.getRequestDispatcher("jsp/pokemonDetail.jsp").forward(request, response);
	}

}
