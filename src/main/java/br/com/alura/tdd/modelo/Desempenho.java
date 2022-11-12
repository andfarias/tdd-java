package br.com.alura.tdd.modelo;

import br.com.alura.tdd.strategy.QuinzePorCento;
import br.com.alura.tdd.strategy.RegraCalculoStrategy;
import br.com.alura.tdd.strategy.TresPorCento;
import br.com.alura.tdd.strategy.VintePorCento;

public enum Desempenho {
    A_DESEJAR(new TresPorCento()),
    BOM(new QuinzePorCento()),
    OTIMO(new VintePorCento());

    private final RegraCalculoStrategy regra;

    Desempenho(RegraCalculoStrategy regra) {
        this.regra = regra;
    }

    public RegraCalculoStrategy getRegra() {
        return regra;
    }

}
