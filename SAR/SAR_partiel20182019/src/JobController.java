public class JobController {
    boolean done = false;

    public synchronized void isJobeDone(){
        if (!done) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void jobDone(){
        done = true;
        this.notifyAll();
    }

}
