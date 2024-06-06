package Captura;

import java.time.LocalDateTime;

public class Embarcacao {
    private String nome;
    private double capacidadeCarga;
    private String registro;
    private int portoId;

    private int numero_viagens;
    private int limite_viagens;
    public void registrarPesca(RegistroPesca registroPesca) {
        // Código para registrar pesca
        System.out.println("Pesca registrada com método: " + registroPesca.getMetodoCaptura() + " e quantidade: " + registroPesca.getQuantidadeCapturada());
    }
}
