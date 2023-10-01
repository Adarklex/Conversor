package model;

import enums.Moneda;
import enums.TipoConversion;

import java.math.BigDecimal;

public class IniciadorConversionMonedas {

	private static final String PESO_COLOMBIANO_A_DOLAR = "De Peso colombiano a Dólar";
    private static final String PESO_COLOMBIANO_A_EURO = "De Peso colombiano a Euro";
    private static final String PESO_COLOMBIANO_A_LIBRA_ESTERLINA = "De Peso colombiano a Libra Esterlina";
    private static final String PESO_COLOMBIANO_A_SOL_PERUANO = "De Peso colombiano a Sol peruano";
    private static final String PESO_COLOMBIANO_A_YEN = "De Peso colombiano a YEN";
    private static final String DOLAR_A_PESO_COLOMBIANO = "De Dólar a Peso colombiano";
    private static final String EURO_A_PESO_COLOMBIANO = "De Euro a Peso colombiano";
    private static final String LIBRA_ESTERLINA_A_PESO_COLOMBIANO = "De Libra Esterlina a Peso colombiano";
    private static final String SOL_PERUANO_A_PESO_COLOMBIANO = "De Sol peruano a Peso colombiano";
    private static final String YEN_A_PESO_COLOMBIANO = "De YEN a Peso colombiano";
    private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMoneda convertidorDeMonedaSolPeruano = new ConvertidorDeMonedaSolPeruano();
    private ConvertidorDeMoneda convertidorDeMonedaYen = new ConvertidorDeMonedaYen();

    private Moneda moneda;

    public BigDecimal operarConversao(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case PESO_COLOMBIANO_A_DOLAR -> {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_A_EURO -> {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_A_LIBRA_ESTERLINA -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_A_SOL_PERUANO -> {
                return convertidorDeMonedaSolPeruano.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_A_YEN -> {
                return convertidorDeMonedaYen.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_A_PESO_COLOMBIANO -> {
                return convertidorDeMonedaDolar.convertirParaPesoColombiano(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_A_PESO_COLOMBIANO -> {
                return convertidorDeMonedaEuro.convertirParaPesoColombiano(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_A_PESO_COLOMBIANO -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaPesoColombiano(moneda, BigDecimal.valueOf(valorInicial));
            }
            case SOL_PERUANO_A_PESO_COLOMBIANO -> {
                return  convertidorDeMonedaSolPeruano.convertirParaPesoColombiano(moneda, BigDecimal.valueOf(valorInicial));
            }
            case YEN_A_PESO_COLOMBIANO -> {
                return convertidorDeMonedaYen.convertirParaPesoColombiano(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("ELECCIÓN INVÁLIDA");
        }

    }

}
