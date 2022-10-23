package S1T5N1E5;

import java.io.Serializable; //marca l'objecte com serialitzable

public class Alumnes implements Serializable{
	
	//atributs
	private static final long serialVersionUID = 1L;
	private String nom = "";
	private String cognom = "";
	private int edad = 0;
	
	//constructor
	public Alumnes(String nom, String cognom, int edad) {
		this.nom = nom;
		this.cognom = cognom;
		this.edad = edad;
	}

	//getters
	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public int getEdad() {
		return edad;
	}

	//setters
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumne: " + this.getNom() + " " + this.getCognom() + " té " + this.getEdad() + " anys.";
	}
	
	
	

}
