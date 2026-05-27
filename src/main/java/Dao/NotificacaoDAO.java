package Dao;

import Database.DB;
import Model_Entety.Notificacao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NotificacaoDAO {

    private Connection conn;

    public NotificacaoDAO()
            throws SQLException {

        conn =
                new DB().conectar();

    }

    public void salvar(
            Notificacao notificacao
    ) throws SQLException {

        String sql = """
            INSERT INTO notificacao
            (
                titulo,
                mensagem,
                tipo,
                visualizada,
                data
            )
            VALUES (?, ?, ?, ?, ?)
        """;

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setString(
                1,
                notificacao.getTitulo()
        );

        stmt.setString(
                2,
                notificacao.getMensagem()
        );

        stmt.setString(
                3,
                notificacao.getTipo()
        );

        stmt.setBoolean(
                4,
                notificacao.isVisualizada()
        );

        stmt.setDate(
                5,
                Date.valueOf(
                        notificacao.getData()
                )
        );

        stmt.executeUpdate();

        stmt.close();
    }

    public List<Notificacao> listar()
            throws SQLException {

        List<Notificacao> lista =
                new ArrayList<>();

        String sql =
                "SELECT * FROM notificacao ORDER BY data DESC";

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        ResultSet rs =
                stmt.executeQuery();

        while(rs.next()){

            Notificacao n =
                    new Notificacao();

            n.setId(
                    rs.getInt("id")
            );

            n.setTitulo(
                    rs.getString("titulo")
            );

            n.setMensagem(
                    rs.getString("mensagem")
            );

            n.setTipo(
                    rs.getString("tipo")
            );

            n.setVisualizada(
                    rs.getBoolean("visualizada")
            );

            n.setData(
                    rs.getDate("data")
                    .toLocalDate()
            );

            lista.add(n);
        }

        rs.close();
        stmt.close();

        return lista;
    }

    public void marcarComoVisualizada(
            int id
    ) throws SQLException {

        String sql = """
            UPDATE notificacao
            SET visualizada = true
            WHERE id = ?
        """;

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();

        stmt.close();
    }
}