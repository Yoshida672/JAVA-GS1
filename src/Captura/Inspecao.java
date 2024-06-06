package Captura;

import Perfil.Supervisor;

import java.util.ArrayList;
import java.util.Date;

public class Inspecao {
    private Date data;
    private Porto porto;
    private ArrayList<Embarcacao> embarcacoes;
    private Supervisor supervisor;

    public Inspecao() {
    }

    public Inspecao(Date data, Porto porto, ArrayList<Embarcacao> embarcacoes, Supervisor supervisor) {
        this.data = data;
        this.porto = porto;
        this.embarcacoes = embarcacoes;
        this.supervisor = supervisor;
    }
    public void registrarInspecao() {
        // Código para registrar inspeção
        System.out.println("Inspeção registrada no porto: " + nomePorto + " na data: " + data);
    }
}

}
