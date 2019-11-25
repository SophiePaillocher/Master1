package Exercice2;

public class CanardBrun extends Canard
{
	public CanardBrun(StrategieVole vole, StrategieCancane cancane) {
		super(vole,cancane);
	}

	public void affiche() {
		System.out.print("canard brun");
	}
}