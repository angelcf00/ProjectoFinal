package application;

public class Alumnos {
int DNAI;
String Nombre; 
String Apellidos;
String Email;
int Telefono;

int DNI;
int ClaveCiclo;
String Curso;
public Alumnos(int dNAI, String nombre, String apellidos, String email, int telefono, int dNI, int claveCiclo,
		String curso) {
	super();
	DNAI = dNAI;
	Nombre = nombre;
	Apellidos = apellidos;
	Email = email;
	Telefono = telefono;
	DNI = dNI;
	ClaveCiclo = claveCiclo;
	Curso = curso;
}
public int getDNAI() {
	return DNAI;
}
public void setDNAI(int dNAI) {
	DNAI = dNAI;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellidos() {
	return Apellidos;
}
public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public int getTelefono() {
	return Telefono;
}
public void setTelefono(int telefono) {
	Telefono = telefono;
}
public int getDNI() {
	return DNI;
}
public void setDNI(int dNI) {
	DNI = dNI;
}
public int getClaveCiclo() {
	return ClaveCiclo;
}
public void setClaveCiclo(int claveCiclo) {
	ClaveCiclo = claveCiclo;
}
public String getCurso() {
	return Curso;
}
public void setCurso(String curso) {
	Curso = curso;
}



}
