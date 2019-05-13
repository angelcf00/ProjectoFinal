package application;

public class AsignarEmpresa {

	String DNAI;
	int IDConvenio;
	String FechaInicio;
	String FechaFin;
	String HorasDia;
	String HorasTotal;
	String HorarioMañana;
	String HorarioTarde;
	String DNITC;
	String DNITE;
	public AsignarEmpresa(String dNAI, int iDConvenio, String fechaInicio, String fechaFin, String horasDia,
			String horasTotal, String horarioMañana, String horarioTarde, String dNITC, String dNITE) {
		super();
		DNAI = dNAI;
		IDConvenio = iDConvenio;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
		HorasDia = horasDia;
		HorasTotal = horasTotal;
		HorarioMañana = horarioMañana;
		HorarioTarde = horarioTarde;
		DNITC = dNITC;
		DNITE = dNITE;
	}
	public String getDNAI() {
		return DNAI;
	}
	public void setDNAI(String dNAI) {
		DNAI = dNAI;
	}
	public int getIDConvenio() {
		return IDConvenio;
	}
	public void setIDConvenio(int iDConvenio) {
		IDConvenio = iDConvenio;
	}
	public String getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}
	public String getHorasDia() {
		return HorasDia;
	}
	public void setHorasDia(String horasDia) {
		HorasDia = horasDia;
	}
	public String getHorasTotal() {
		return HorasTotal;
	}
	public void setHorasTotal(String horasTotal) {
		HorasTotal = horasTotal;
	}
	public String getHorarioMañana() {
		return HorarioMañana;
	}
	public void setHorarioMañana(String horarioMañana) {
		HorarioMañana = horarioMañana;
	}
	public String getHorarioTarde() {
		return HorarioTarde;
	}
	public void setHorarioTarde(String horarioTarde) {
		HorarioTarde = horarioTarde;
	}
	public String getDNITC() {
		return DNITC;
	}
	public void setDNITC(String dNITC) {
		DNITC = dNITC;
	}
	public String getDNITE() {
		return DNITE;
	}
	public void setDNITE(String dNITE) {
		DNITE = dNITE;
	}
	
	
}
