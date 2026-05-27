package service;

import Model_Entety.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatchAutomaticoService {

    private AnimalService animalService;

    private AdotanteService adotanteService;

    private MatchService matchService;

    private NotificacaoService notificacaoService;

    public MatchAutomaticoService()
            throws SQLException {

        animalService =
                new AnimalService();

        adotanteService =
                new AdotanteService();

        matchService =
                new MatchService();

        notificacaoService =
                new NotificacaoService();

    }

    public void gerarMatches()
            throws SQLException {

        List<Adotante> adotantes =
                adotanteService.listar();

        for(Adotante adotante : adotantes){

            Preferencias preferencias =
                    adotanteService
                    .buscarPreferencias(
                            adotante.getId()
                    );

            if(preferencias == null){

                continue;

            }

            List<ResultadoMatch> matches =
                    matchService
                    .buscarAnimaisCompativeis(
                            preferencias
                    );

            if(matches.isEmpty()){

                continue;

            }

            ResultadoMatch melhor =
                    matches.get(0);

            if(melhor.getPontos() >= 5){

                Notificacao n =
                        new Notificacao();

                n.setTitulo(
                        "Novo correspondecia  encontrado"
                );

                n.setMensagem(
                        "O animal "
                        + melhor.getAnimal().getNome()
                        + " combina com o adotante "
                        + adotante.getNome()
                );

                n.setTipo(
                        "MATCH"
                );

                n.setVisualizada(
                        false
                );

                n.setData(
                        java.time.LocalDate.now()
                );

                notificacaoService
                        .salvar(n);
            }
        }
    }
}