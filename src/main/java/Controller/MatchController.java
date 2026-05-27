package Controller;

import Model_Entety.Preferencias;

import service.MatchService;
import service.ResultadoMatch;

import java.sql.SQLException;
import java.util.List;

public class MatchController {

    private MatchService service;

    public MatchController()
            throws SQLException {

        service =
                new MatchService();

    }

    public List<ResultadoMatch>
    buscarAnimaisCompativeis(
            Preferencias preferencias
    ) throws SQLException {

        return service
                .buscarAnimaisCompativeis(
                        preferencias
                );
    }
}