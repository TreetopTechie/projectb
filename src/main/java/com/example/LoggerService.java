package com.example.ProjectB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerService {
    private static final Logger logger = LogManager.getLogger(LoggerService.class);

    public void logMessage(String message) {
        logger.info(message);
    }
}
