package Exercice2;


class Simulateur
{
	public static void main(String[] args)
	{
		Canard[] canards = new Canard[4];
		canards[0] = new CanardColvert(new VoleBien(), new CancaneCoin());
		canards[1] = new CanardBleu(new VoleBien(), new CancaneCouic());
		canards[2] = new CanardBrun(new VoleBien(), new CancaneCoin());
		canards[3] = new CanardPlastique(new VoleMal(), new CancaneBip());

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
		c.vole.vole();
		System.out.print(" et fait '");
		c.cancane.cancane();
		System.out.println("'.");
	}
}