package Model_Entety;

import java.time.LocalDate;

public class Animal {
    

    private int id;
    
    private String nome;
    
    private String tipo;
    private String cor;
    private String raca;

    private int idade;
    private float peso;

    private char genero;
    private char porte;
    private String estado;
    
    private boolean deficiencia;
    private boolean castrado;

    private boolean fiv;
    private boolean felv;

    private LocalDate dataEntrada;

    public Animal() {
        this.dataEntrada = LocalDate.now();
        
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


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


    public char getPorte() {
        return porte;
    }

    public void setPorte(char porte) {
        this.porte = porte;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public boolean isDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(boolean deficiencia) {
        this.deficiencia = deficiencia;
    }


    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }


    public boolean isFIV() {
        return fiv;
    }

    public void setFIV(boolean fiv) {
        this.fiv = fiv;
    }


    public boolean isFELV() {
        return felv;
    }

    public void setFELV(boolean felv) {
        this.felv = felv;
    }


    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}