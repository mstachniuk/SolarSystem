package com.blogspot.mstachniuk.solarsystem.task06;

public class ThrowableCaptor {

    public static Throwable captureThrowable(ExceptionThrower thrower) {
        try {
            thrower.throwException();
            return null;
        } catch (Throwable throwable) {
            return throwable;
        }
    }
}
