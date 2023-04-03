package it.prova.televisoredaowithservices.service.televisore;

import java.time.LocalDate;
import java.util.List;

import it.prova.televisoredaowithservices.dao.televisore.TelevisoreDAO;
import it.prova.televisoredaowithservices.model.Televisore;

public interface TelevisoreService {
	// questo mi serve per injection
	public void setUserDao(TelevisoreDAO televisoreDAO);

	public List<Televisore> listAll() throws Exception;

	public Televisore findById(Long idInput) throws Exception;

	public int aggiorna(Televisore input) throws Exception;

	public int inserisciNuovo(Televisore input) throws Exception;

	public int rimuovi(Televisore input) throws Exception;

	public List<Televisore> findByExample(Televisore input) throws Exception;

	public Televisore cercaTelevisorePiuGrande() throws Exception;

	public List<Televisore> trovaTelevisoriProdottiInUnDatoIntervalloDiDate(LocalDate dataConfronto);

	public List<Televisore> trovaLaListaDiMarcheDeiTelevisoriProdottiNegliUltimiSeiMesi(String marcaInput,
			LocalDate dataInput);

}