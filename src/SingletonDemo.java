// SingletonDemo.java
import java.time.LocalDateTime;

    class Logger {
        private static Logger instance;

        private Logger() { } // Private constructor

        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        public void log(String message) {
            System.out.println(LocalDateTime.now() + " - " + message);
        }
    }

    public class SingletonDemo {
        public static void main(String[] args) {
            Logger logger1 = Logger.getInstance();
            Logger logger2 = Logger.getInstance();

            logger1.log("First log message");
            logger2.log("Second log message");

            System.out.println(logger1 == logger2); // true → same instance
        }
    }




