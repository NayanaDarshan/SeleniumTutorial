package BasicWeb;

import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Logging {
 

	static Logger log = Logger.getLogger(Logging.class);
	 
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		
		Properties log4jprop = new Properties();
		log4jprop.setProperty("log4j.rootlogger", "DEBUG, CA");
		log4jprop.setProperty("log4j.appender.CA", "org.apache.log4j.ConsoleAppender");
		log4jprop.setProperty("log4j.appender.CA.Layout", "org.apache.log4j.PatternLayout");
		log4jprop.setProperty("log4j.appender.CA.Layout.ConversionPattern", "%{yyyy-MM-DD} --%-10p %c -%m%n");
		PropertyConfigurator.configure(log4jprop);
     
		log.info("This is the Infomessage");
		
		runmethod();
		
		log.debug("This is a debug messgae");
	

}
	
	
	public static void runmethod() {
		
		log.info("The Log is from runmethod");
	}
}
