package Captura;

public class Area_Pesca {
    private String coordenadas;
    private String especiesComuns;
    private double extensao;
    private ESTADO_CONSERVACAO estadoConservacao;

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getEspeciesComuns() {
        return especiesComuns;
    }

    public void setEspeciesComuns(String especiesComuns) {
        this.especiesComuns = especiesComuns;
    }

    public double getExtensao() {
        return extensao;
    }

    public void setExtensao(double extensao) {
        this.extensao = extensao;
    }

    public ESTADO_CONSERVACAO getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(ESTADO_CONSERVACAO estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public Area_Pesca() {
    }

    public Area_Pesca(String coordenadas, String especiesComuns, double extensao, ESTADO_CONSERVACAO estadoConservacao) {
        this.coordenadas = coordenadas;
        this.especiesComuns = especiesComuns;
        this.extensao = extensao;
        this.estadoConservacao = estadoConservacao;
    }

    @Override
    public String toString() {
        return "Area de Pesca " +
                "coordenadas: " + coordenadas + '\'' +
                ", especiesComuns: " + especiesComuns + '\'' +
                ", extensao: " + extensao +
                ", estadoConservacao: " + estadoConservacao;
    }
}
