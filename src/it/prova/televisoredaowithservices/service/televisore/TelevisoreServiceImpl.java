package it.prova.televisoredaowithservices.service.televisore;

import java.time.LocalDate;
import java.util.List;

import it.prova.televisoredaowithservices.dao.televisore.TelevisoreDAO;
import it.prova.televisoredaowithservices.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	public void setUserDao(TelevisoreDAO televisoreDAO) {
		// TODO Auto-generated method stub

	}

	public List listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Televisore findById(Long idInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int aggiorna(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int inserisciNuovo(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int rimuovi(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public List findByExample(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Televisore cercaTelevisorePiuGrande() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List trovaTelevisoriProdottiInUnDatoIntervalloDiDate(LocalDate dataConfronto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List trovaLaListaDiMarcheDeiTelevisoriProdottiNegliUltimiSeiMesi(String marcaInput, LocalDate dataInput) {
		// TODO Auto-generated method stub
		return null;
	}

}
