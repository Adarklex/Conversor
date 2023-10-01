package enums;

public enum TipoConversion {
    PESO_COLOMBIANO_A_DOLAR("De Peso colombiano a Dólar"),
    PESO_COLOMBIANO_A_EURO("De Peso colombiano a Euro"),
    PESO_COLOMBIANO_A_LIBRA_ESTERLINA("De Peso colombiano a Libra Esterlina"),
    PESO_COLOMBIANO_A_SOL_PERUANO("De Peso colombiano a Sol peruano"),
    PESO_COLOMBIANO_A_YEN("De Peso colombiano a YEN"),
    DOLAR_A_PESO_COLOMBIANO("De Dólar a Peso colombiano"),
    EURO_A_PESO_COLOMBIANO("De Euro a Peso colombiano"),
    LIBRA_ESTERLINA_A_PESO_COLOMBIANO("De Libra Esterlina a Peso colombiano"),
    SOL_PERUANO_A_PESO_COLOMBIANO("De Sol peruano a Peso colombiano"),
    YEN_A_PESO_COLOMBIANO("De YEN a Peso colombiano"),


    CELSIUS_A_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_A_KELVIN("Celsius a Kelvin"),
    KELVIN_A_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_A_CELSIUS ("Kelvin a Celsius"),
    FAHRENHEIT_A_CELSIUS ("Fahrenheit a Celsius"),
    FAHRENHEIT_A_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
