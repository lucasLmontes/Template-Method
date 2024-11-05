package com.resumo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioHoristaTest {

    @Test
    public void deveCalcularSalarioCorreto() {
        FuncionarioHorista funcionario = new FuncionarioHorista();
        funcionario.setSalarioHora(20.0f);
        funcionario.setHorasTrabalhadas(100);
        assertEquals(2000.0f, funcionario.calcularSalario());
    }

    @Test
    public void deveRetornarInformacoes() {
        FuncionarioHorista funcionario = new FuncionarioHorista();
        funcionario.setSalarioHora(20.0f);
        funcionario.setHorasTrabalhadas(100);
        funcionario.setNome("Carlos");
        funcionario.setId(3);
        assertEquals("||FuncionarioHorista\nid=3, nome='Carlos', salário=2000.0", funcionario.getInfo());
    }
}
