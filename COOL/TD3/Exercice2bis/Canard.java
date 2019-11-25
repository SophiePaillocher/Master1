package Exercice2bis;

public class Canard {
	private StrategieVole vole;
	private StrategieCancane cancane;
	private String nom;

	public Canard(StrategieVole vole, StrategieCancane cancane,String nom) {
		this.vole = vole;
		this.cancane = cancane;
		this.nom = nom;
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
	
	public void affiche() {
		System.out.print("Canard "+nom);
	}
	
	public void cancane() {
		this.cancane.cancane();
	}
	
	public void vole() {
		this.vole.vole();
	}
}
