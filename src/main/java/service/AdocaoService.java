package service;

import Dao.AdocaoDAO;
import Model_Entety.Adocao;

import java.sql.SQLException;
import java.util.List;

public class AdocaoService {

    private AdocaoDAO dao;

    public AdocaoService() throws SQLException {

        dao = new AdocaoDAO();

    }

    public void salvar(Adocao adocao)
            throws SQLException {

        dao.salvar(adocao);

    }

    public List<Adocao> listar()
            throws SQLException {

        return dao.listar();

    }

    public Adocao buscarPorAnimal(int animalId)
            throws SQLException {

        return dao.buscarPorAnimal(animalId);

    }

    public void deletar(int id)
            throws SQLException {

        dao.deletar(id);

    }
}