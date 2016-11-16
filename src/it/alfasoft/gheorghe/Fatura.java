package it.alfasoft.gheorghe;

/*
 *faturaDAO: deve avere 
 *	1list fature 
 *	2 metodi Crea fattura(),
 *	getTuteFature()
 *	getTuteFatureConCodiceCliente()   
 *
 *@webService 2 metodi:
 *	PrendiTuteFature()
 *	PrendiTuteFatureConCodice()
 * 	
 * client dev'essere un main che
 * 	stampa tutte fature;
 * 	stampa 
 * 
 * */


public class Fatura {

	private String codCliente;
	private double importo;
	private String ragioneSociale;
	
	public Fatura() {

	}
	
	public Fatura(String codCliente, double importo, String ragioneSociale) {
		this.codCliente = codCliente;
		this.importo = importo;
		this.ragioneSociale = ragioneSociale;
	}
	public String getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	
	
}
