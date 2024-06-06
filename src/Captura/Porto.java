package Captura;

import Perfil.Endereco;

import java.time.LocalDate;

public class Porto {
    private String nomePorto;
    private Endereco endereco;
    private int qtdBercos;
    private double custoGeral;

    public Porto() {
    }

    public Porto(String nomePorto, Endereco endereco, int qtdBercos, double custoGeral) {
        this.nomePorto = nomePorto;
        this.endereco = endereco;
        this.qtdBercos = qtdBercos;
        this.custoGeral = custoGeral;
    }

    public String getNomePorto() {
        return nomePorto;
    }

    public void setNomePorto(String nomePorto) {
        this.nomePorto = nomePorto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQtdBercos() {
        return qtdBercos;
    }

    public void setQtdBercos(int qtdBercos) {
        this.qtdBercos = qtdBercos;
    }

    public double getCustoGeral() {
        return custoGeral;
    }

    public void setCustoGeral(double custoGeral) {
        this.custoGeral = custoGeral;
    }

    @Override
    public String toString() {
        return "Porto{" +
                "nomePorto='" + nomePorto + '\'' +
                ", endereco=" + endereco +
                ", qtdBercos=" + qtdBercos +
                ", custoGeral=" + custoGeral +
                '}';
    }
}
