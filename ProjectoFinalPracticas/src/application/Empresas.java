package application;

public class Empresas {
 
int IDConvenio;
String CIF;
String Representante;
String NIFRep;
String NombreEmpresa;
String Pais;
String Ciudad;
String provincia;
String Direccion;
int CP;
int Telefono;
int Fax;

public Empresas(int iDConvenio, String cIF, String representante, String nIFRep, String nombreEmpresa, String pais,
		String ciudad, String provincia, String direccion, int cP, int telefono, int fax) {
	super();
	IDConvenio = iDConvenio;
	CIF = cIF;
	Representante = representante;
	NIFRep = nIFRep;
	NombreEmpresa = nombreEmpresa;
	Pais = pais;
	Ciudad = ciudad;
	this.provincia = provincia;
	Direccion = direccion;
	CP = cP;
	Telefono = telefono;
	Fax = fax;
}

public int getIDConvenio() {
	return IDConvenio;
}

public void setIDConvenio(int iDConvenio) {
	IDConvenio = iDConvenio;
}

public String getCIF() {
	return CIF;
}

public void setCIF(String cIF) {
	CIF = cIF;
}

public String getRepresentante() {
	return Representante;
}

public void setRepresentante(String representante) {
	Representante = representante;
}

public String getNIFRep() {
	return NIFRep;
}

public void setNIFRep(String nIFRep) {
	NIFRep = nIFRep;
}

public String getNombreEmpresa() {
	return NombreEmpresa;
}

public void setNombreEmpresa(String nombreEmpresa) {
	NombreEmpresa = nombreEmpresa;
}

public String getPais() {
	return Pais;
}

public void setPais(String pais) {
	Pais = pais;
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



}
