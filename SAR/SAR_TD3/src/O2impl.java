public class O2impl implements O2I {
    private boolean doneG;

    public O2impl(){
        doneG=false;
    }

    @Override
    public synchronized void G() {
        System.out.println("G()");
        doneG=true;
        notifyAll();
    }

    @Override
    public synchronized void isDoneG() {
        while (!doneG) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
