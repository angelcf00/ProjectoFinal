package application;

public class Centro {

int CodigoCentro;
String DirectorCentro;
String NIFDirector;
String NombreCentro;
String Ciudad;
String provincia;
String Direccion;
int CP;
int Telefono;
int Fax;
int DAT;
public Centro(int codigoCentro, String directorCentro, String nIFDirector, String nombreCentro, String ciudad,
		String provincia, String direccion, int cP, int telefono, int fax, int dAT) {
	super();
	CodigoCentro = codigoCentro;
	DirectorCentro = directorCentro;
	NIFDirector = nIFDirector;
	NombreCentro = nombreCentro;
	Ciudad = ciudad;
	this.provincia = provincia;
	Direccion = direccion;
	CP = cP;
	Telefono = telefono;
	Fax = fax;
	DAT = dAT;
}
public int getCodigoCentro() {
	return CodigoCentro;
}
public void setCodigoCentro(int codigoCentro) {
	CodigoCentro = codigoCentro;
}
public String getDirectorCentro() {
	return DirectorCentro;
}
public void setDirectorCentro(String directorCentro) {
	DirectorCentro = directorCentro;
}
public String getNIFDirector() {
	return NIFDirector;
}
public void setNIFDirector(String nIFDirector) {
	NIFDirector = nIFDirector;
}
public String getNombreCentro() {
	return NombreCentro;
}
public void setNombreCentro(String nombreCentro) {
	NombreCentro = nombreCentro;
}
public String getCiudad() {
	return Ciudad;
}
public void setCiudad(String ciudad) {
	Ciudad = ciudad;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
public int getCP() {
	return CP;
}
public void setCP(int cP) {
	CP = cP;
}
public int getTelefono() {
	return Telefono;
}
public void setTelefono(int telefono) {
	Telefono = telefono;
}
public int getFax() {
	return Fax;
}
public void setFax(int fax) {
	Fax = fax;
}
public int getDAT() {
	return DAT;
}
public void setDAT(int dAT) {
	DAT = dAT;
}



}
