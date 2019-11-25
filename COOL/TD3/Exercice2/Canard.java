package Exercice2;

public abstract class Canard {
	protected StrategieVole vole;
	protected StrategieCancane cancane;
	
	public abstract void affiche();
	
	public Canard(StrategieVole vole, StrategieCancane cancane) {
		this.vole = vole;
		this.cancane = cancane;
	}
	
	public void setVole(StrategieVole newVole) {
		this.vole = newVole;
	}
	
	public void setCancane(StrategieCancane newCancane) {
		this.cancane = newCancane;
	}
	
	public void nage() {
		System.out.print("nage bien");
	}
}
