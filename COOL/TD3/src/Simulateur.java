package ex1;

class Simulateur
{
	public static void main(String[] args)
	{
		Canard[] canards = new Canard[4];
		canards[0] = new CanardColvert();
		canards[1] = new CanardBleu();
		canards[2] = new CanardBrun();
		canards[3] = new CanardPlastique();

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
