package com.resumo;

public class FuncionarioMensalista extends Funcionario {

    private float salarioMensal;

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public float calcularSalario() {
        return salarioMensal;
    }

    @Override
    public String getTipo() {
        return "FuncionarioMensalista";
    }
}
