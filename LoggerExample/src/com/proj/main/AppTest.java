package com.proj.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.MDC;

/*
 * we need to add maven dependency log4j, commons.logging in 
 * */
public class AppTest {

	static Log LOGGER = LogFactory.getLog(AppTest.class);
	// static Logger logger = Logger.getLogger(AppTest.class);
	// static Logger logger = Logger.getLogger("MyLog");
	// static FileHandler fh;

	public static void main(String[] args) {
		MDC.put("IP", "127.0.0.1");
		  LoggerUtils.debug(LOGGER, "Hello this is a debug message");
		  LoggerUtils.info(LOGGER, "Hello this is an info message");

		  try {
		   throw new NullPointerException();
		  } catch (Exception e) {
		   LoggerUtils.error(LOGGER, "Error in: " + e.getMessage());

		  }
		  System.out.println("EOP");
	}
}
