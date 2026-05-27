package Model_Entety;

import java.time.LocalDateTime;

public class Historico {

    private int id;

    private Integer usuarioId;

    private Integer animalId;

    private Integer adotanteId;

    private String acao;

    private LocalDateTime dataEvento;

    public Historico() {
    }

    public int getId() {
        return id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public Integer getAdotanteId() {
        return adotanteId;
    }

    public String getAcao() {
        return acao;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public void setAdotanteId(Integer adotanteId) {
        this.adotanteId = adotanteId;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public void setDataEvento(
            LocalDateTime dataEvento
    ) {

        this.dataEvento = dataEvento;

    }
}