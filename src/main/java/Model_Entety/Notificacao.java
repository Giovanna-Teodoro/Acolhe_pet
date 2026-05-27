package Model_Entety;

import java.time.LocalDate;

public class Notificacao {

    private int id;

    private String titulo;

    private String mensagem;

    private String tipo;

    private boolean visualizada;

    private LocalDate data;

    public Notificacao() {
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isVisualizada() {
        return visualizada;
    }

    public LocalDate getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVisualizada(boolean visualizada) {
        this.visualizada = visualizada;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}