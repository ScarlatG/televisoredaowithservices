package it.prova.televisoredaowithservices.dao.televisore;

import java.time.LocalDate;
import java.util.List;

import it.prova.televisoredaowithservices.dao.IBaseDAO;
import it.prova.televisoredaowithservices.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore> {

	public Televisore cercaTelevisorePiuGrande() throws Exception;

	public List<Televisore> trovaTelevisoriProdottiInUnDatoIntervalloDiDate(LocalDate dataConfronto);

	public List<Televisore> trovaLaListaDiMarcheDeiTelevisoriProdottiNegliUltimiSeiMesi(String marcaInput,
			LocalDate dataInput);

}
