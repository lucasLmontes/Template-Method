package com.resumo;

public abstract class Funcionario {

    private String nome;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract float calcularSalario();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return "||" + getTipo() + "\n" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", salário=" + this.calcularSalario();
    }
}