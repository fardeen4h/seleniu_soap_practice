package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class Demo1 {

	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am Debugging");
		
		
			log.debug("obj is present");
		
		log.info("onj present");
		log.fatal("no obj found");
		
			log.error("no obj found");
		

	}

}