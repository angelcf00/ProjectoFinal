package application;

public class Alumnos {
String DNAI;
String Nombre; 
String Apellidos;
String Email;
int Telefono;

String DNI;
int ClaveCiclo;
String Curso;
public Alumnos(String dNAI, String nombre, String apellidos, String email, int telefono, String dNI, int claveCiclo,
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

public Alumnos(String nombre, String apellidos) {
	super();
	Nombre = nombre;
	Apellidos = apellidos;
}

public Alumnos() {
	super();
	DNAI = "";
	Nombre = "";
	Apellidos = "";
	Email = "";
	Telefono = 0;
	DNI = "";
	ClaveCiclo = 0;
	Curso = "";
	

}

public String getDNAI() {
	return DNAI;
}
public void setDNAI(String dNAI) {
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
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
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
