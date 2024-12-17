package com.example.ldapauthentication.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Configuration class to handle exceptions globally for the application.
 * Uses @ControllerAdvice to handle exceptions across the entire application in a centralized way.
 */

@Configuration
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ModelAndView handle500(Exception ex) {
        ModelAndView modelAndView = new ModelAndView("Error");
        modelAndView.addObject("title", "Error Occurred");
        modelAndView.addObject("errorMessageTitle", "Internal Server Error");
        modelAndView.addObject("errorMessageBody", ex.getMessage());
        return modelAndView;
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView handle404(NoHandlerFoundException ex) {
        ModelAndView modelAndView = new ModelAndView("Error");
        modelAndView.addObject("title", "Page Not Found");
        modelAndView.addObject("errorMessageTitle", "404 Not Found");
        modelAndView.addObject("errorMessageBody", "We are sorry, but the page you requested was not found.");
        return modelAndView;
    }

    @ExceptionHandler(BadCredentialsException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ModelAndView handle401(BadCredentialsException ex) {
        ModelAndView modelAndView = new ModelAndView("Error");
        modelAndView.addObject("title", "Authentication Error");
        modelAndView.addObject("errorMessageTitle", "Bad Credentials");
        modelAndView.addObject("errorMessageBody", "The credentials you provided are incorrect.");
        return modelAndView;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ModelAndView handle400(MethodArgumentNotValidException ex) {
        ModelAndView modelAndView = new ModelAndView("Error");
        modelAndView.addObject("title", "Bad Request");
        modelAndView.addObject("errorMessageTitle", "400 Bad Request");
        modelAndView.addObject("errorMessageBody", "There was an issue with your request. Please check your input and try again.");
        return modelAndView;
    }
}