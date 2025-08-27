package com.aig.gi.talbot.merged.model.domain.dashboard.web;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public class VcapsInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	  public void init(ServletConfig servletConfig) throws ServletException {

	    System.out.println("VcapsInitServlet - AvailableProcessors: {}" +  Runtime.getRuntime().availableProcessors());
	  }
}
