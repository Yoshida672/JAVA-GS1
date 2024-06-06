package Captura;

public class RegistroPesca {
    private Embarcacao embarcacao;
    private METODO_CAPTURA metodoCaptura;
    private Especie especie;
    private Area_Pesca locaisPesca;
    private double pesoTotal;

    public RegistroPesca() {
    }

    public RegistroPesca(Embarcacao embarcacao, METODO_CAPTURA metodoCaptura, Especie especie, Area_Pesca locaisPesca, double pesoTotal) {
        this.embarcacao = embarcacao;
        this.metodoCaptura = metodoCaptura;
        this.especie = especie;
        this.locaisPesca = locaisPesca;
        this.pesoTotal = pesoTotal;
    }

    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }

    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }

    public METODO_CAPTURA getMetodoCaptura() {
        return metodoCaptura;
    }

    public void setMetodoCaptura(METODO_CAPTURA metodoCaptura) {
        this.metodoCaptura = metodoCaptura;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Area_Pesca getLocaisPesca() {
        return locaisPesca;
    }

    public void setLocaisPesca(Area_Pesca locaisPesca) {
        this.locaisPesca = locaisPesca;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    @Override
    public String toString() {
        return "RegistroPesca{" +
                "embarcacao=" + embarcacao +
                ", metodoCaptura=" + metodoCaptura +
                ", especie=" + especie +
                ", locaisPesca=" + locaisPesca +
                ", pesoTotal=" + pesoTotal +
                '}';
    }
}
