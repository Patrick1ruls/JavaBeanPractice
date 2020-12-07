package com.practice.javabean;

import com.practice.javabean.model.Player;
import java.util.logging.Logger;
import static java.util.logging.Level.*;

public class Application {
    public static void main(String[] args) {
            runApp();
        }

        private static void runApp() {
            Logger logger = Logger.getLogger(Application.class.getName());
            logger.log(INFO, "Creating new player p1...");
            Player p1 = new Player("Steven");
            logger.log(INFO, "Player p1 name: {0}", p1.getName());
        }
}
