package com.practice.javabean;

import java.util.logging.Logger;

import static java.util.logging.Level.*;

public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Application.class.getName());

        logger.log(INFO, "Hello World!");
    }
}
