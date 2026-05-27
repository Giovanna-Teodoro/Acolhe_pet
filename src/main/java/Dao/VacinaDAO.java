package Dao;

import Database.DB;
import Model_Entety.Vacina;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VacinaDAO {

    private Connection conn;

    public VacinaDAO()
            throws SQLException {

        conn =
                new DB().conectar();
    }

    public void salvar(
            Vacina vacina
    ) throws SQLException {

        String sql =
                "INSERT INTO vacina(nome) VALUES(?)";

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setString(
                1,
                vacina.getNome()
        );

        stmt.executeUpdate();

        stmt.close();
    }

    public List<Vacina> listar()
            throws SQLException {

        List<Vacina> lista =
                new ArrayList<>();

        String sql =
                "SELECT * FROM vacina";

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        ResultSet rs =
                stmt.executeQuery();

        while(rs.next()){

            Vacina vacina =
                    new Vacina();

            vacina.setId(
                    rs.getInt("id")
            );

            vacina.setNome(
                    rs.getString("nome")
            );

            lista.add(vacina);
        }

        rs.close();
        stmt.close();

        return lista;
    }
}