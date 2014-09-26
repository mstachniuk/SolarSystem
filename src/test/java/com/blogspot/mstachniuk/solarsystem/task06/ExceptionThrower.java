package com.blogspot.mstachniuk.solarsystem.task06;

@FunctionalInterface
public interface ExceptionThrower {
    void throwException() throws Throwable;
}
