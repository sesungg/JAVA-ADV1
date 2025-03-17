package thread.start;

import thread.util.MyLogger;

import static thread.util.MyLogger.*;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }

}
