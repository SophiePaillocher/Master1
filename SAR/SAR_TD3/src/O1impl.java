public class O1impl implements O1I {
    private boolean doneA;
    private boolean doneB;
    private boolean doneC;

    public O1impl(){
        doneA=false;
        doneB=false;
        doneC=false;
    }

    @Override
    public synchronized void A() {
        System.out.println("A()");
        doneA = true;
        notifyAll();
    }

    @Override
    public synchronized void isDoneA() {
        while (!doneA) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public synchronized void B() {
        System.out.println("B()");
        doneB = true;
        notifyAll();
    }

    @Override
    public synchronized void isDoneB() {
        while (!doneB) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public synchronized void C() {
        System.out.println("C()");
        doneC = true;
        notifyAll();
    }

    @Override
    public synchronized void isDoneC() {
        while (!doneC) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
