package Exercice2;

public class CanardColvert extends Canard
{
	public CanardColvert(StrategieVole vole, StrategieCancane cancane) {
		super(vole,cancane);
	}
	
	public void affiche() {
		System.out.print("canard colvert");
	}
}