package com.resumo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioMensalistaTest {

    @Test
    public void deveCalcularSalarioCorreto() {
        FuncionarioMensalista funcionario = new FuncionarioMensalista();
        funcionario.setSalarioMensal(3000.0f);
        assertEquals(3000.0f, funcionario.calcularSalario());
    }

    @Test
    public void deveRetornarInformacoes() {
        FuncionarioMensalista funcionario = new FuncionarioMensalista();
        funcionario.setSalarioMensal(3000.0f);
        funcionario.setNome("Ana");
        funcionario.setId(4);
        assertEquals("||FuncionarioMensalista\nid=4, nome='Ana', salário=3000.0", funcionario.getInfo());
    }
}
