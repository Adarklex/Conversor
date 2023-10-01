package interfaces;

import enums.Moneda;

import java.math.BigDecimal;

public interface MonedaConvertible {

    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEmReais);
    BigDecimal convertirParaPesoColombiano(Moneda moneda, BigDecimal valorNaMoeda);

}
