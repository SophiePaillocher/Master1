import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OD3impl extends UnicastRemoteObject implements OD3I{
    private boolean doneE;
    private boolean doneF;

    public OD3impl() throws RemoteException{
        doneE=false;
        doneF=false;
    }

    
    public synchronized void E() throws RemoteException{
        System.out.println("E()");
        doneE=true;
        notifyAll();
    }

    
    public synchronized void isDoneE() throws RemoteException{
        while (!doneE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
    public synchronized void F() throws RemoteException{
        System.out.print("F()");
        doneF=true;
        notifyAll();
    }

    public synchronized void isDoneF() throws RemoteException{
        while (!doneF) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
