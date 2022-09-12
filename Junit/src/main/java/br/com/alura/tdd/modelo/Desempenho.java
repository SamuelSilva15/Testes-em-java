package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    BOM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.15");
        }
    }, EXCELENTE {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.2");
        }
    }, A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.03");
        }
    };

    public abstract BigDecimal percentualReajuste();
}
