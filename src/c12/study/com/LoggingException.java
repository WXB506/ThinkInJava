package c12.study.com;

import java.util.logging.*;
import java.io.*;

class LoggingExceptions extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public LoggingExceptions() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingException {
	public static void main(String[] args) {
		try {
			throw new LoggingExceptions();
		} catch (LoggingExceptions e) {
			System.err.println("Caught " + e);
		}
		
		try {
			throw new LoggingExceptions();
		} catch (LoggingExceptions e) {
			System.err.println("Caught " + e);
		}
	}
}
