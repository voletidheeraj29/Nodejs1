package log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
	static Logger logger = Logger.getLogger(Log.class.getName());
	public static void main(String[] args) {
		try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
		} catch (SecurityException | IOException e1) {
			e1.printStackTrace();
		}
		logger.setLevel(Level.FINE);
		logger.addHandler(new ConsoleHandler());
		try {
			for (int i=0; i < 1000; i++) {
			int	msg =0+i;
				// logging messages
				logger.log(Level.INFO, "127.0.0."+msg);
			}
			logger.log(Level.CONFIG, "Config data");
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}