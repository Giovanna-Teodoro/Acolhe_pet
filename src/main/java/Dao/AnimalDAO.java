package Dao;

import Database.DB;
import Model_Entety.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    private Connection conn;

    public AnimalDAO() throws SQLException {
        this.conn = new DB().conectar();
    }

    // SALVAR
    public void salvar(Animal animal) throws SQLException {

        String sql = """
            INSERT INTO animal
            (
                nome,
                tipo,
                cor,
                idade,
                genero,
                raca,
                deficiencia,
                castrado,
                peso,
                porte,
                fiv,
                felv,
                estado
            )
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        """;

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setString(1, animal.getNome());
        stmt.setString(2, animal.getTipo());
        stmt.setString(3, animal.getCor());
        stmt.setInt(4, animal.getIdade());
        stmt.setString(5, String.valueOf(animal.getGenero()));
        stmt.setString(6, animal.getRaca());
        stmt.setBoolean(7, animal.isDeficiencia());
        stmt.setBoolean(8, animal.isCastrado());
        stmt.setFloat(9, animal.getPeso());
        stmt.setString(10, String.valueOf(animal.getPorte()));
        stmt.setBoolean(11, animal.isFIV());
        stmt.setBoolean(12, animal.isFELV());
        stmt.setString(13, animal.getEstado());

        stmt.executeUpdate();

        stmt.close();
    }

    // LISTAR
    public List<Animal> listar() throws SQLException {

        List<Animal> lista =
                new ArrayList<>();

        String sql =
                "SELECT * FROM animal";

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        ResultSet rs =
                stmt.executeQuery();

        while(rs.next()){

            Animal animal =
                    new Animal();

            animal.setId(rs.getInt("id"));
            animal.setNome(rs.getString("nome"));
            animal.setTipo(rs.getString("tipo"));
            animal.setCor(rs.getString("cor"));
            animal.setIdade(rs.getInt("idade"));
            animal.setGenero(rs.getString("genero").charAt(0));

            animal.setRaca(rs.getString("raca"));

            animal.setDeficiencia( rs.getBoolean("deficiencia")
            );

            animal.setCastrado(
                    rs.getBoolean("castrado")
            );

            animal.setPeso(
                    rs.getFloat("peso")
            );

            animal.setPorte(
                    rs.getString("porte").charAt(0)
            );

            animal.setFIV(
                    rs.getBoolean("fiv")
            );

            animal.setFELV(
                    rs.getBoolean("felv")
            );

            animal.setEstado(
                    rs.getString("estado")
            );

            lista.add(animal);
        }

        rs.close();
        stmt.close();

        return lista;
    }

    // BUSCAR POR ID
    public Animal buscarPorId(int id)
            throws SQLException {

        String sql =
                "SELECT * FROM animal WHERE id = ?";

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setInt(1, id);

        ResultSet rs =
                stmt.executeQuery();

        Animal animal = null;

        if(rs.next()){

            animal = new Animal();

            animal.setId(rs.getInt("id"));
            animal.setNome(rs.getString("nome"));
        }

        rs.close();
        stmt.close();

        return animal;
    }

    // UPDATE
    public void atualizar(Animal animal)
            throws SQLException {

        String sql = """
            UPDATE animal
            SET
                nome = ?,
                cor = ?,
                idade = ?
            WHERE id = ?
        """;

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setString(1, animal.getNome());
        stmt.setString(2, animal.getCor());
        stmt.setInt(3, animal.getIdade());
        stmt.setInt(4, animal.getId());

        stmt.executeUpdate();

        stmt.close();
    }

    // DELETE
    public void deletar(int id)
            throws SQLException {

        String sql =
                "DELETE FROM animal WHERE id = ?";

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();

        stmt.close();
    }
}