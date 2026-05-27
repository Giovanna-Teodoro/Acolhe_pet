package Model_Entety;

import java.time.LocalDate;

public class Adocao {

    private int id;

    // relacionamento
    private int adotanteId;
    private int animalId;

    private LocalDate dataAdocao;

    private String status;

    private String observacao;

    public Adocao() {

        this.dataAdocao = LocalDate.now();

    }

    // GETTERS

    public int getId() {
        return id;
    }

    public int getAdotanteId() {
        return adotanteId;
    }

    public int getAnimalId() {
        return animalId;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public String getStatus() {
        return status;
    }

    public String getObservacao() {
        return observacao;
    }

    // SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setAdotanteId(int adotanteId) {
        this.adotanteId = adotanteId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}