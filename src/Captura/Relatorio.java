package Captura;

import java.util.ArrayList;

public class Relatorio {
    private Inspecao inspecao;
    private ArrayList<RegistroPesca> registrosPesca;

    public Relatorio() {
    }

    public Relatorio(Inspecao inspecao, ArrayList<RegistroPesca> registrosPesca) {
        this.inspecao = inspecao;
        this.registrosPesca = registrosPesca;
    }

    public Inspecao getInspecao() {
        return inspecao;
    }

    public void setInspecao(Inspecao inspecao) {
        this.inspecao = inspecao;
    }

    public ArrayList<RegistroPesca> getRegistrosPesca() {
        return registrosPesca;
    }

    public void setRegistrosPesca(ArrayList<RegistroPesca> registrosPesca) {
        this.registrosPesca = registrosPesca;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "inspecao=" + inspecao +
                ", registrosPesca=" + registrosPesca +
                '}';
    }
}
