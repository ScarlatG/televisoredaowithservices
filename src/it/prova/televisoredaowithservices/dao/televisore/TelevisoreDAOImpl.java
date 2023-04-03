package it.prova.televisoredaowithservices.dao.televisore;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import it.prova.televisoredaowithservices.dao.AbstractMySQLDAO;
import it.prova.televisoredaowithservices.model.Televisore;

public class TelevisoreDAOImpl extends AbstractMySQLDAO implements TelevisoreDAO {

	public List list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Televisore get(Long idInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public List findByExample(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void setConnection(Connection connection) {
		// TODO Auto-generated method stub

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
