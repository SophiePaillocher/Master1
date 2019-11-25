import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//main du site 1
public class Main {

    public static void main(String[] args) throws RemoteException, NotBoundException {
         
        OD1I o1 = new OD1impl(); // créer l'objet o1
        Registry reg = LocateRegistry.createRegistry(1099); //créer le serveur qui va enregistrer les noms
        // o1 = (OD1I) UnicastRemoteObject.exportObject(o1,0);
        reg.rebind("OD1I", o1); //publier o1 sur le registre
        
        //recherche de services distants
        Registry reg2 = LocateRegistry.getRegistry("@IP_host2", 1099);
        OD2I o2 = (OD2I) reg2.lookup("OD2I");
        //OD2I o2 = Naming.lookup("rmi://@IP:port/OD2I"); 
        
        Registry reg3 = LocateRegistry.getRegistry("@IP_host3", 1099);
        OD3I o3 = (OD3I) reg2.lookup("OD3I");

        P1Distant p1 = new P1Distant(o1,o2,o3);

        p1.go();        

    }
}
