import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OD2impl extends UnicastRemoteObject implements OD2I {
    private boolean doneG;

    public OD2impl() throws RemoteException{
        doneG=false;
    }

    public synchronized void G() throws RemoteException{
        System.out.println("G()");
        doneG=true;
        notifyAll();
    }

    public synchronized void isDoneG() throws RemoteException{
        while (!doneG) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
