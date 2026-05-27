package Model_Entety;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Adotante {

    private int id;

    private String nome;
    
    
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    private LocalDate dataCadastro;

    private boolean aptoAdocao;

  
    public Adotante() {
        this.dataCadastro = LocalDate.now();
 
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    public boolean isAptoAdocao() {
        return aptoAdocao;
    }

    public void setAptoAdocao(boolean aptoAdocao) {
        this.aptoAdocao = aptoAdocao;
    }



}