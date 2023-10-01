import enums.TipoConversion;
import model.*;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) throws Exception {

        String conversionDeMoneda = "Convertir moneda";
        String conversionDeTemperatura = "Convertir temperatura";

        boolean ejecuta = true;

        Repetidor repetidor = new Repetidor();

        while(ejecuta){
            String operacion = JOptionPane.showInputDialog(null, "Elige la operación",
                    "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {conversionDeMoneda, conversionDeTemperatura}, "Elección").toString();

            if (operacion.equals(conversionDeMoneda)) {
                IniciadorConversionMonedas iniciadorConversionMonedas = new IniciadorConversionMonedas();
                String operacaoMoedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.PESO_COLOMBIANO_A_DOLAR.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_A_EURO.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_A_LIBRA_ESTERLINA.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_A_SOL_PERUANO.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_A_YEN.getDescripcion(),
                                TipoConversion.DOLAR_A_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.EURO_A_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.LIBRA_ESTERLINA_A_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.SOL_PERUANO_A_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.YEN_A_PESO_COLOMBIANO.getDescripcion()},
                        "Elija").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorConversionMonedas.operarConversao(operacaoMoedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if(operacion.equals(conversionDeTemperatura)){
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacaoTemperaturas = JOptionPane.showInputDialog(null, "Elige la escala de temperatura",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.CELSIUS_A_FAHRENHEIT.getDescripcion(),
                                TipoConversion.CELSIUS_A_KELVIN.getDescripcion(),
                                TipoConversion.FAHRENHEIT_A_CELSIUS.getDescripcion(),
                                TipoConversion.FAHRENHEIT_A_KELVIN.getDescripcion(),
                                TipoConversion.KELVIN_A_CELSIUS.getDescripcion(),
                                TipoConversion.KELVIN_A_FAHRENHEIT.getDescripcion(),},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversao(operacaoTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            ejecuta = repetidor.intentaRepetir();
        }

    }
}
