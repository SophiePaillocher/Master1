public class CommandeConversionMajuscule implements Commande{

	public String prepareMsg(String str){
		return str.toUpperCase();
	}
}

