package service;

import Dao.VacinaDAO;
import Model_Entety.Vacina;

import java.sql.SQLException;
import java.util.List;

public class VacinaService {

    private VacinaDAO dao;

    public VacinaService()
            throws SQLException {

        dao =
                new VacinaDAO();
    }

    public void salvar(
            Vacina vacina
    ) throws SQLException {

        dao.salvar(vacina);
    }

    public List<Vacina> listar()
            throws SQLException {

        return dao.listar();
    }
}