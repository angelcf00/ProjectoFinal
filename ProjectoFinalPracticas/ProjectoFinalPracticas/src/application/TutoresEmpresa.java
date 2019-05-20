package application;

public class TutoresEmpresa {

	int DNITE;
	String Nombre;
	String Apellidos;
	String Email;
	int Telefono;
	
	int DNITC;
	String NombreC;
	String ApellidosC;
	String EmailC;
	public TutoresEmpresa(int dNITE, String nombre, String apellidos, String email, int telefono, int dNITC,
			String nombreC, String apellidosC, String emailC) {
		super();
		DNITE = dNITE;
		Nombre = nombre;
		Apellidos = apellidos;
		Email = email;
		Telefono = telefono;
		DNITC = dNITC;
		NombreC = nombreC;
		ApellidosC = apellidosC;
		EmailC = emailC;
		
	}
	
	public TutoresEmpresa(String nombre, String apellidos) {
		super();
		DNITE = 0;
		Nombre = "";
	}
		public TutoresEmpresa() {
			super();
			DNITE = 0;
			Nombre = "";
			Apellidos = "";
			Email = "";
			Telefono = 0;
			DNITC = 0;
			NombreC = "";
			ApellidosC = "";
			EmailC = "";
	}
	public int getDNITE() {
		return DNITE;
	}
	public void setDNITE(int dNITE) {
		DNITE = dNITE;
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
	public int getDNITC() {
		return DNITC;
	}
	public void setDNITC(int dNITC) {
		DNITC = dNITC;
	}
	public String getNombreC() {
		return NombreC;
	}
	public void setNombreC(String nombreC) {
		NombreC = nombreC;
	}
	public String getApellidosC() {
		return ApellidosC;
	}
	public void setApellidosC(String apellidosC) {
		ApellidosC = apellidosC;
	}
	public String getEmailC() {
		return EmailC;
	}
	public void setEmailC(String emailC) {
		EmailC = emailC;
	}
	
	
}
