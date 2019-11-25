package Exercice2bis;


class Simulateur
{
	public static void main(String[] args)
	{
		Canard[] canards = new Canard[4];
		canards[0] = new Canard(new VoleBien(), new CancaneCoin(),"Colvert");
		canards[1] = new Canard(new VoleBien(), new CancaneCouic(),"Bleu");
		canards[2] = new Canard(new VoleBien(), new CancaneCoin(),"Brun");
		canards[3] = new Canard(new VoleMal(), new CancaneBip(),"Plastique");

		for (Canard canard : canards)
			simule(canard);
		
		canards[1].setVole(new VoleMal());
		
		System.out.println("-----------------------");
		
		for (Canard canard : canards)
			simule(canard);
	}

	private static void simule(Canard c)
	{
		System.out.print("Le ");
		c.affiche();
		System.out.print(" ");
		c.nage();
		System.out.print(", ");
		c.vole();
		System.out.print(" et fait '");
		c.cancane();
		System.out.println("'.");
	}
}