import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OD2I extends Remote{
    void G() throws RemoteException;
    void isDoneG() throws RemoteException;
}
