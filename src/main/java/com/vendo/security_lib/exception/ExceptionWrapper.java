package com.vendo.security_lib.exception;

public interface ExceptionWrapper<T> {

    T getResponse(Exception e);

    Class<? extends Exception> getException();

}
