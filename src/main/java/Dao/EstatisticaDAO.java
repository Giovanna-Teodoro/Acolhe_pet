package Dao;

import Database.DB;
import Model_Entety.Estatistica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstatisticaDAO {

    private Connection conn;

    public EstatisticaDAO()
            throws SQLException {

        conn =
                new DB().conectar();

    }

    public Estatistica buscarEstatisticas()
            throws SQLException {

        Estatistica e =
                new Estatistica();

        String adotados = """
            SELECT COUNT(*) total
            FROM animal
            WHERE estado = 'ADOTADO'
        """;

        String naoAdotados = """
            SELECT COUNT(*) total
            FROM animal
            WHERE estado = 'NAO_ADOTADO'
        """;

        String emProcesso = """
            SELECT COUNT(*) total
            FROM animal
            WHERE estado = 'EM_PROCESSO'
        """;

        String totalAnimais = """
            SELECT COUNT(*) total
            FROM animal
        """;

        String totalAdocoes = """
            SELECT COUNT(*) total
            FROM adocao
        """;

        String totalAdotantes = """
            SELECT COUNT(*) total
            FROM adotante
        """;

        PreparedStatement stmt;

        ResultSet rs;

        stmt = conn.prepareStatement(adotados);
        rs = stmt.executeQuery();

        if(rs.next()){

            e.setAnimaisAdotados(
                    rs.getInt("total")
            );
        }

        rs.close();
        stmt.close();

        stmt =
                conn.prepareStatement(
                        naoAdotados
                );

        rs =
                stmt.executeQuery();

        if(rs.next()){

            e.setAnimaisNaoAdotados(
                    rs.getInt("total")
            );
        }

        rs.close();
        stmt.close();

        stmt =
                conn.prepareStatement(
                        emProcesso
                );

        rs =
                stmt.executeQuery();

        if(rs.next()){

            e.setAnimaisEmProcesso(
                    rs.getInt("total")
            );
        }

        rs.close();
        stmt.close();

        stmt =
                conn.prepareStatement(
                        totalAnimais
                );

        rs =
                stmt.executeQuery();

        if(rs.next()){

            e.setTotalAnimais(
                    rs.getInt("total")
            );
        }

        rs.close();
        stmt.close();

        stmt =
                conn.prepareStatement(
                        totalAdocoes
                );

        rs =
                stmt.executeQuery();

        if(rs.next()){

            e.setTotalAdocoes(
                    rs.getInt("total")
            );
        }

        rs.close();
        stmt.close();

        stmt =
                conn.prepareStatement(
                        totalAdotantes
                );

        rs =
                stmt.executeQuery();

        if(rs.next()){

            e.setTotalAdotantes(
                    rs.getInt("total")
            );
        }

        rs.close();
        stmt.close();

        return e;
    }
}