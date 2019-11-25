import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OD1impl extends UnicastRemoteObject implements OD1I {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean doneA;
    private boolean doneB;
    private boolean doneC;

    public OD1impl() throws RemoteException{
        doneA=false;
        doneB=false;
        doneC=false;
    }

    public synchronized void A() throws RemoteException{
        System.out.println("A()");
        doneA = true;
        notifyAll();
    }

    public synchronized void isDoneA() throws RemoteException{
        while (!doneA) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void B() throws RemoteException{
        System.out.println("B()");
        doneB = true;
        notifyAll();
    }

    public synchronized void isDoneB() throws RemoteException{
        while (!doneB) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void C() throws RemoteException{
        System.out.println("C()");
        doneC = true;
        notifyAll();
    }

    public synchronized void isDoneC() throws RemoteException{
        while (!doneC) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
