package br.com.alura.tdd.strategy;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public interface RegraCalculoStrategy {
    BigDecimal calcula(Funcionario funcionario);
}

