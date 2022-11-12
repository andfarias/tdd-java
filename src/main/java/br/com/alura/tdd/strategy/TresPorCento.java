package br.com.alura.tdd.strategy;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class TresPorCento implements RegraCalculoStrategy {
    @Override
    public BigDecimal calcula(Funcionario funcionario) {
        return funcionario.getSalario().multiply(new BigDecimal("0.03"));
    }
}
