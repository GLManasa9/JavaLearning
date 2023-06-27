package org.example;


import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.lang.System;

import static java.lang.System.out;

interface Logging {

    void log();
    /**
     * log the message
     * @param message
     */
    void log(String message);

    default void log(String message, Date date) {
        out.println(date.toString() + ": " + message);
    }
}

public class DefaultInterfaceMethods implements Logging {

    private String message;

    @Override
    public void log() {
        out.println(message);
    }

    /**
     * log the message
     *
     * @param message
     */
    @Override
    public void log(String message) {
        out.println(message);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public DefaultInterfaceMethods() { }

    /**
     * by adding @notnull annotation make sure that msg is not null else below exception will be thrown if we send 'null' into constructor
     * Exception in thread "main" java.lang.IllegalArgumentException: Argument for @NotNull parameter 'msg' of org/example/DefaultInterfaceMethods.<init> must not be null
     * 	at org.example.DefaultInterfaceMethods.$$$reportNull$$$0(DefaultInterfaceMethods.java)
     * 	at org.example.DefaultInterfaceMethods.<init>(DefaultInterfaceMethods.java)
     * 	at org.example.DefaultInterfaceMethods.main(DefaultInterfaceMethods.java:59)
     * @param msg
     */
    public DefaultInterfaceMethods(@NotNull String msg) {
        this.message = msg;
    }

    public static void main(String[] args) {
        DefaultInterfaceMethods defaultInterfaceMethods = new DefaultInterfaceMethods();
        defaultInterfaceMethods.log("Hai");
        out.println(defaultInterfaceMethods);
        Logging logObj = new DefaultInterfaceMethods(null);
        logObj.log();
    }
}

