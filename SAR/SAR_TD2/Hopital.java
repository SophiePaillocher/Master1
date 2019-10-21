
public class Hopital {
	private SyncSocket CH, CA;
	
	public Hopital(SyncSocket a, SyncSocket b){
		CH = a;
		CA = b;
	}
	
	public void run(){
		CH.receive("demandeRdzVs");
		CH.send("code");
	}
}
