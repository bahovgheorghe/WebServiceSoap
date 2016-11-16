package it.alfasoft.gheorghe;

import java.util.HashMap;
import java.util.Map;

public class FaturaDAO {

	private Map<String,Fatura> fature;
	
	public FaturaDAO(){
		fature = new HashMap<String, Fatura>();
		Fatura f1= new Fatura("1a",1200.99,"privato");
		Fatura f2= new Fatura("1b",1250.99,"privato");
		Fatura f3= new Fatura("1c",1300.99,"privato");
		
		fature.put(f1.getCodCliente(), f1);
		fature.put(f2.getCodCliente(), f2);
		fature.put(f3.getCodCliente(), f3);
	}
	
	public Fatura getFaturaConCodice(String codCliente){
		return fature.get(codCliente);
	}
	
	public Fatura getTutteFature( Map<String,Fatura> fature){
		return fature.get(fature);
		
	}
}
