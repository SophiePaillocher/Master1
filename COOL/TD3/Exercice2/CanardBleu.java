package Exercice2;

public class CanardBleu extends Canard
{
	public CanardBleu(StrategieVole vole, StrategieCancane cancane) {
		super(vole,cancane);
	}

	public void affiche() {
		System.out.print("canard bleu");
	}
}