package Captura;

public class Especie {
    private String nomePopular;
    private String nomeCientifico;
    private double tamanhoMedio;
    private double pesoMedio;
    private String periodoReproducao;
    private NIVEL_EXTINCAO nivelExtincao;

    public Especie() {
    }

    public Especie(String nomePopular, String nomeCientifico, double tamanhoMedio, double pesoMedio, String periodoReproducao, NIVEL_EXTINCAO nivelExtincao) {
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.tamanhoMedio = tamanhoMedio;
        this.pesoMedio = pesoMedio;
        this.periodoReproducao = periodoReproducao;
        this.nivelExtincao = nivelExtincao;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public double getTamanhoMedio() {
        return tamanhoMedio;
    }

    public void setTamanhoMedio(double tamanhoMedio) {
        this.tamanhoMedio = tamanhoMedio;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public String getPeriodoReproducao() {
        return periodoReproducao;
    }

    public void setPeriodoReproducao(String periodoReproducao) {
        this.periodoReproducao = periodoReproducao;
    }

    public NIVEL_EXTINCAO getNivelExtincao() {
        return nivelExtincao;
    }

    public void setNivelExtincao(NIVEL_EXTINCAO nivelExtincao) {
        this.nivelExtincao = nivelExtincao;
    }
}
