import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OD1I extends Remote{
    void A() throws RemoteException;
    void isDoneA() throws RemoteException;
    void B() throws RemoteException;
    void isDoneB() throws RemoteException;
    void C() throws RemoteException;
    void isDoneC() throws RemoteException;
}
