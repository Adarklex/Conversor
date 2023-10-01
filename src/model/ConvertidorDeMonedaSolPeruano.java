package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaSolPeruano extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.SOL_PERUANO;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaPesoColombiano(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.SOL_PERUANO;
        return super.convertirParaPesoColombiano(moneda, valorEnMoneda);
    }
}
