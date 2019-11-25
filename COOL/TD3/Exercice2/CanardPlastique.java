package Exercice2;

public class CanardPlastique extends Canard
{
	public CanardPlastique(StrategieVole vole, StrategieCancane cancane) {
		super(vole,cancane);
	}
	
	public void affiche()
	{
		System.out.print("canard plastique");
	}
}