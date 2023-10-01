package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaLibraEsterlina extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaPesoColombiano(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaPesoColombiano(moneda, valorEnMoneda);
    }
}
