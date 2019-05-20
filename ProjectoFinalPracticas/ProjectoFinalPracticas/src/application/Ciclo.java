package application;

public class Ciclo {

	int ClaveCiclo;
	String Nombre;
	int ClaveFP;
	String Tipo;
	
	int ClaveFP2;
	String FamiliaPro;
	public Ciclo(int claveCiclo, String nombre, int claveFP, String tipo, int claveFP2, String familiaPro) {
		super();
		ClaveCiclo = claveCiclo;
		Nombre = nombre;
		ClaveFP = claveFP;
		Tipo = tipo;
		ClaveFP2 = claveFP2;
		FamiliaPro = familiaPro;
	}
	
	public Ciclo() {
		super();
		ClaveCiclo = 0;
		Nombre = "";
		ClaveFP = 0;
		Tipo = "";
		ClaveFP2 = 0;
		FamiliaPro = "";
	}
	public int getClaveCiclo() {
		return ClaveCiclo;
	}
	public void setClaveCiclo(int claveCiclo) {
		ClaveCiclo = claveCiclo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getClaveFP() {
		return ClaveFP;
	}
	public void setClaveFP(int claveFP) {
		ClaveFP = claveFP;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getClaveFP2() {
		return ClaveFP2;
	}
	public void setClaveFP2(int claveFP2) {
		ClaveFP2 = claveFP2;
	}
	public String getFamiliaPro() {
		return FamiliaPro;
	}
	public void setFamiliaPro(String familiaPro) {
		FamiliaPro = familiaPro;
	}
	
	
	
	
}
