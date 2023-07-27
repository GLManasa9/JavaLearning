package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log {

    static Logger LOGGER = LogManager.getLogger(String.valueOf(Log.class));

    public static void logInfo(String message) {
        LOGGER.info(message);
    }

    static void logError(String message){
        LOGGER.error(message);
    }
}
