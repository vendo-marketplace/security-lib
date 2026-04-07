package com.vendo.security_lib.filter;

public interface ExceptionWriter<T> {

    void write(T body);

}
