package com.proj.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.MDC;

/**
 * Servlet implementation class Logger
 */
@WebServlet("/Logger")
public class Logger extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Logger() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String ref1 = "http://www.example.com/start.html";

		Log LOGGER = LogFactory.getLog(Logger.class);
		for (int IP = 0; IP < 100; IP += 25) {
			MDC.put("IP", "127.0.0." + IP);
			LoggerUtils.debug(LOGGER, request.getHeader("User-Agent") + "  " + request.getHeader("Accept") + " " + ref1
					+ " " + request.getProtocol() + " " + request.getMethod());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}