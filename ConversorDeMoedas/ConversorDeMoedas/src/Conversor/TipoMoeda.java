package Conversor;


public class TipoMoeda {
    private String base_code;

    private double conversion_rate;

    public TipoMoeda(TipoMoedaRecord moeda ) {
        this.base_code = moeda.base_code();
        this.conversion_rate = moeda.conversion_rate();
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }
}

