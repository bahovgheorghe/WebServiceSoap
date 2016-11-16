package it.alfasoft.gheorghe;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public abstract class FaturaService implements Ifature  {

	/* (non-Javadoc)
	 * @see it.alfasoft.gheorghe.Ifature#prendiTuteFature()
	 */
	@Override
	@WebMethod
	public Fatura prendiTuteFature(String codCliente){
		FaturaDAO fDao = new FaturaDAO();
		return fDao.getFaturaConCodice(codCliente);
	}



}
