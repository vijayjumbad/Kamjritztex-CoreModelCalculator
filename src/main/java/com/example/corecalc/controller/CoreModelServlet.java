package com.example.corecalc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.corecalc.model.CalculationResult;
import com.example.corecalc.service.CoreModelService;


import java.io.IOException;

@WebServlet("/calculate")
public class CoreModelServlet extends HttpServlet {
	 private CoreModelService coreModelService = new CoreModelService();

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        request.setCharacterEncoding("UTF-8");

	        // Read form parameter
	        String coreModel = request.getParameter("coreModel");

	        if (coreModel == null || coreModel.isEmpty()) {
	            request.setAttribute("error", "Core model parameter is missing");
	            request.getRequestDispatcher("/error.jsp").forward(request, response);
	            return;
	        }

	        // Process the request
	        CalculationResult result = coreModelService.calculate(coreModel);

	        // Set attributes for the result
	        request.setAttribute("result", result);

	        // Forward to the result JSP page
	        request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
}
