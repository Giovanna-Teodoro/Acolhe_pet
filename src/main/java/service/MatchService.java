package service;

import Dao.AnimalDAO;
import Model_Entety.Animal;
import Model_Entety.Preferencias;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MatchService {

    private AnimalDAO animalDAO;

    public MatchService() throws SQLException {

        animalDAO = new AnimalDAO();

    }

    public List<ResultadoMatch> buscarAnimaisCompativeis(
            Preferencias pref
    ) throws SQLException {

        List<Animal> animais
                = animalDAO.listar();

        List<ResultadoMatch> resultado
                = new ArrayList<>();

        for (Animal animal : animais) {

            if (!animal.getEstado()
                    .equalsIgnoreCase("NAO_ADOTADO")) {

                continue;

            }
            int pontos = 0;

            if (animal.getTipo()
                    .equalsIgnoreCase(
                            pref.getTipo()
                    )) {

                pontos++;
            }

            if (animal.getCor()
                    .equalsIgnoreCase(
                            pref.getCor()
                    )) {

                pontos++;
            }

            if (animal.getRaca()
                    .equalsIgnoreCase(
                            pref.getRaca()
                    )) {

                pontos++;
            }

            if (animal.getGenero()
                    == pref.getGenero()) {

                pontos++;
            }

            if (animal.getPorte()
                    == pref.getPorte()) {

                pontos++;
            }
            if (animal.isCastrado()
                    == pref.isCastrado()) {

                pontos++;

            }

            if (animal.isDeficiencia()
                    == pref.isDeficiencia()) {

                pontos++;
            }

            if (animal.isFIV()
                    == pref.isFIV()) {

                pontos++;
            }

            // FELV
            if (animal.isFELV()
                    == pref.isFELV()) {

                pontos++;
            }

            if (animal.getIdade()
                    == pref.getIdade()) {

                pontos++;
            }

            if (animal.getPeso()
                    == pref.getPeso()) {

                pontos++;
            }

            if (pontos > 0) {

                ResultadoMatch r
                        = new ResultadoMatch(
                                animal,
                                pontos
                        );

                resultado.add(r);
            }
        }

        resultado.sort(
                Comparator.comparing(
                        ResultadoMatch::getPontos
                ).reversed()
        );

        return resultado;
    }
}
