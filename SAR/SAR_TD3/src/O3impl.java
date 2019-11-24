public class O3impl implements O3I
{
    private boolean doneE;
    private boolean doneF;

    public O3impl(){
        doneE=false;
        doneF=false;
    }

    @Override
    public synchronized void E() {
        System.out.println("E()");
        doneE=true;
        notifyAll();
    }

    @Override
    public synchronized void isDoneE() {
        while (!doneE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void F() {
        System.out.print("F()");
        doneF=true;
        notifyAll();
    }

    @Override
    public void isDoneF() {
        while (!doneF) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
