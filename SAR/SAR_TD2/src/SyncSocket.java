import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;

public class SyncSocket extends Socket {
	
	private Socket s ;
	private BufferedReader in ;
	private PrintWriter out ;

	public SyncSocket ( Socket s ) throws IOException {
		this.s = s;
		in = new BufferedReader ( new InputStreamReader ( s.getInputStream()));
		out = new PrintWriter ( s.getOutputStream());
	}

	public synchronized void send ( String msg ) throws IOException {
		out.println(msg);
		out.flush();
	}

	public synchronized String receive ( String msg ) throws IOException {
		while (!(in.readLine()).equals(msg));
		out.println("recu");
		return msg;
	}

	public synchronized String receive ( Collection < String > msgs ) throws IOException {
		String recu = null;
		do{
			recu = in.readLine();
		} while (!msgs.contains(recu));
		out.println("recu");
		return recu;
	}
}