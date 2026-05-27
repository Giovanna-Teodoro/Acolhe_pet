package Teste;

import Controller.SistemaController;

import Model_Entety.*;

import java.time.LocalDate;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {

            SistemaController controller
                    = new SistemaController();

            System.out.println(
                    "========== TESTE SISTEMA =========="
            );
            /**
             * User user = new User();
             *
             * user.setNome( "Administrador" );
             *
             * user.setEmail( "admin@gmail.com" );
             *
             * user.setSenhaHash( "123456" );
             *
             * controller.salvarUsuario( user );
             *
             * System.out.println( "Usuario salvo" );
*
             */
            User login
                    = controller.login(
                            "admin@gmail.com",
                            "123456"
                    );

            if (login != null) {

                System.out.println(
                        "Login realizado"
                );

            }
            /**
             * Adotante adotante = new Adotante();
             *
             * adotante.setNome( "Maria" );
             *
             * adotante.setCpf( "12345678900" );
             *
             * adotante.setEmail( "maria@gmail.com" );
             *
             * adotante.setTelefone( "67999999999" );
             *
             * adotante.setEndereco( "Rua A" );
             *
             * Preferencias preferencias = new Preferencias();
             *
             * preferencias.setTipo( "Gato" );
             *
             * preferencias.setCor( "Preto" );
             *
             * preferencias.setGenero( 'M' );
             *
             * preferencias.setCastrado( true );
             *
             * preferencias.setPorte( 'P' );
             *
             * preferencias.setFIV( false );
             *
             * preferencias.setFELV( false );
             *
             * controller.salvarAdotante( adotante, preferencias );
             *
             * System.out.println( "Adotante salvo" );
             *
             * Animal animal = new Animal();
             *
             * animal.setNome( "Thor" );
             *
             * animal.setTipo( "Gato" );
             *
             * animal.setCor( "Preto" );
             *
             * animal.setIdade( 2 );
             *
             * animal.setGenero( 'M' );
             *
             * animal.setRaca( "Siames" );
             *
             * animal.setDeficiencia( false );
             *
             * animal.setCastrado( true );
             *
             * animal.setPeso( 3.5f );
             *
             * animal.setPorte( 'P' );
             *
             * animal.setFIV( false );
             *
             * animal.setFELV( false );
             *
             * animal.setEstado( "NAO_ADOTADO" );
             *
             * controller.salvarAnimal( animal );
             *
             * System.out.println( "Animal salvo" );
             *
             * Vacina vacina = new Vacina();
             *
             * vacina.setNome( "V4" );
             *
             * controller.salvarVacina( vacina );
             *
             * System.out.println( "Vacina salva" );
*
             */
            List<Vacina> vacinas
                    = controller
                            .listarVacinas();

            int vacinaId
                    = vacinas.get(0)
                            .getId();
          

            AnimalVacina av
                    = new AnimalVacina();

            av.setAnimalId(
                   1
            );

            av.setVacinaId(
                    vacinaId
            );

            av.setDataAplicacao(
                    LocalDate.now()
            );

            av.setDataReforco(
                    LocalDate.now()
                            .plusDays(5)
            );

            controller.salvarAnimalVacina(
                    av
            );

            System.out.println(
                    "Relacao animal vacina salva"
            );

            controller.verificarVacinas();

            System.out.println(
                    "Verificacao vacina feita"
            );
/**
            controller.gerarMatchesAutomaticos();

            System.out.println(
                    "Match automatico realizado"
            );

            Adocao adocao
                    = new Adocao();

            adocao.setAdotanteId(
                    adotante.getId()
            );

            adocao.setAnimalId(
                    animal.getId()
            );

            adocao.setStatus(
                    "EM_PROCESSO"
            );

            controller.salvarAdocao(
                    adocao
            );

            System.out.println(
                    "Adocao salva"
            );

            Historico historico
                    = new Historico();

            historico.setUsuarioId(
                    user.getId()
            );

            historico.setAnimalId(
                    animal.getId()
            );

            historico.setAdotanteId(
                    adotante.getId()
            );

            historico.setAcao(
                    "Adocao iniciada"
            );

            controller.salvarHistorico(
                    historico
            );

            System.out.println(
                    "Historico salvo"
            );

            Estatistica estatistica
                    = controller
                            .buscarEstatisticas();

            System.out.println(
                    "Animais adotados: "
                    + estatistica
                            .getAnimaisAdotados()
            );

            System.out.println(
                    "Animais nao adotados: "
                    + estatistica
                            .getAnimaisNaoAdotados()
            );

            System.out.println(
                    "Animais em processo: "
                    + estatistica
                            .getAnimaisEmProcesso()
            );

            System.out.println(
                    "Total adocoes: "
                    + estatistica
                            .getTotalAdocoes()
            );

            List<Animal> animais
                    = controller
                            .listarAnimais();

            System.out.println(
                    "Lista animais:"
            );

            for (Animal a : animais) {

                System.out.println(
                        a.getNome()
                        + " - "
                        + a.getEstado()
                );
            }

            List<Adotante> adotantes
                    = controller
                            .listarAdotantes();

            System.out.println(
                    "Lista adotantes:"
            );

            for (Adotante a : adotantes) {

                System.out.println(
                        a.getNome()
                );
            }

            List<Notificacao> notificacoes
                    = controller
                            .listarNotificacoes();

            System.out.println(
                    "Lista notificacoes:"
            );

            for (Notificacao n : notificacoes) {

                System.out.println(
                        n.getMensagem()
                );
            }

            List<Historico> historicos
                    = controller
                            .listarHistorico();

            System.out.println(
                    "Lista historico:"
            );

            for (Historico h : historicos) {

                System.out.println(
                        h.getAcao()
                );
            }

            controller.gerarPdfEstatistica(
                    "estatistica.pdf"
            );

            controller.gerarPdfHistorico(
                    "historico.pdf"
            );

            System.out.println(
                    "PDFs gerados"
            );
**/
            System.out.println(
                    "========== SISTEMA FUNCIONANDO =========="
            );

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
