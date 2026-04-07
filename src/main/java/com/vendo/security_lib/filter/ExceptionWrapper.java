package com.vendo.security_lib.filter;

public interface ExceptionWrapper<T> {

    T getResponse(Exception e);

    Class<? extends Exception> getException();

}
