public class JobController {
    boolean done = false;
    boolean allow = true;



    public synchronized void isJobDone(){
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

    public synchronized boolean isAllow(){
        return allow;
    }

    public synchronized void setAllow(boolean a){
        allow = a;
    }

}
