package com.webreporter.utils;

import java.util.logging.Logger;

/**
 *
 * @author Chhotelal
 */
public class WebReportException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(WebReportException.class.getName());
    private String message;

    public WebReportException() {
        message = "Sorry, an error occured while processing your request.";
    }

    public WebReportException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
