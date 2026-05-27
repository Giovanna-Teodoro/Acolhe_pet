package Model_Entety;

public class User {

    private int id;

    private String nome;
    private String email;

 
    private String senhaHash;

    private String tipo;

    private boolean ativo;

    public User() {
    }

  

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAtivo() {
        return ativo;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}