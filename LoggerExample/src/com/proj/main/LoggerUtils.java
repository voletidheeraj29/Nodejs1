package com.proj.main;

import org.apache.commons.logging.Log;

public class LoggerUtils {
	/**
	 * This method logs the info messages.
	 *
	 * @param logger
	 *            object Log
	 * @param strLogMsg
	 *            message to be logged String
	 */
	public static void info(Log logger, String strLogMsg) {
		if (logger.isInfoEnabled()) {
			logger.info(strLogMsg);
		}
	}

	
	 /**
	 * This method logs the debug messages.
	 *
	 * @param logger
	 * object Log
	 * @param strLogMsg
	 * message to be logged String
	 */
	public static void debug(Log logger, String strLogMsg) {
		if (logger.isDebugEnabled()) {
			logger.debug(strLogMsg);
		}
	}

	/**
	 * This method logs the warning messages.
	 *
	 * @param logger
	 *            object Log
	 * @param strLogMsg
	 *            message to be logged String
	 */
	public static void warn(Log logger, String strLogMsg) {
		if (logger.isWarnEnabled()) {
			logger.warn(strLogMsg);
		}
	}

	/**
	 * This method logs the error messages.
	 *
	 * @param logger
	 *            object Log
	 * @param strLogMsg
	 *            message to be logged String
	 */
	public static void error(Log logger, String strLogMsg) {
		if (logger.isErrorEnabled()) {
			logger.error(strLogMsg);
		}
	}

	/**
	 * This method logs the fatal messages.
	 *
	 * @param logger
	 *            object Log
	 * @param strLogMsg
	 *            message to be logged String
	 */
	public static void fatal(Log logger, String strLogMsg) {
		if (logger.isFatalEnabled()) {
			logger.fatal(strLogMsg);
		}
	}

}
