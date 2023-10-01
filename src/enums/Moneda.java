package enums;

import java.math.BigDecimal;

public enum Moneda {

    // Valores fecha 01/10/2023
    DOLAR(BigDecimal.valueOf(4070.75)),
    EURO(BigDecimal.valueOf(4302.54)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(4966.93)),
    SOL_PERUANO(BigDecimal.valueOf(1072.25)),
    YEN(BigDecimal.valueOf(27.20));
	

    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }
}
