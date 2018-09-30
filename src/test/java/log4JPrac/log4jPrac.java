package log4JPrac;


import org.apache.logging.log4j.*;

public class log4jPrac {

    private static Logger Log = LogManager.getLogger(log4jPrac.class.getName());
    public static void main(String args[]){

        Log.debug("I am degugging");
        if ( 5>4)
            Log.info("object is present");
        Log.error("object is not present");

        Log.fatal("this is fatal");

    }
}
