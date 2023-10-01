package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaYen extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.YEN;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaPesoColombiano(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.YEN;
        return super.convertirParaPesoColombiano(moneda, valorEnMoneda);
    }
}
