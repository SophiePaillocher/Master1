public class CommandeConversionMajuscule implements Commande{

	public String execute(String str){
		return str.toUpperCase();
	}
}

