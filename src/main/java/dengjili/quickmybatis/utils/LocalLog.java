package dengjili.quickmybatis.utils;

import org.apache.log4j.Logger;

public class LocalLog {
	
	private final static Logger log = Logger.getLogger(LocalLog.class);

	public static void print(String info) {
		log.error("==>      " + info);
	}
	
}
