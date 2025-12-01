package util;
public class BatchThirteen {
    final public static int WAIT_TIME = 30;
    public static final String PAGE_TITLE  = "Automation Exercise";

    public static void waitForDomStable(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
