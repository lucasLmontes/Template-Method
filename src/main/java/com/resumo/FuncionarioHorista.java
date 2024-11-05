package com.resumo;

public class FuncionarioHorista extends Funcionario {

    private float salarioHora;
    private int horasTrabalhadas;

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public float calcularSalario() {
        return salarioHora * horasTrabalhadas;
    }

    @Override
    public String getTipo() {
        return "FuncionarioHorista";
    }
}
