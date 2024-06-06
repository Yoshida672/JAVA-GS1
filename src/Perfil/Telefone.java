package Perfil;

public class Telefone {
    private int DDD;
    private int DDI;
    private String numeroTelefone;

    public Telefone() {
    }

    public Telefone(int DDD, int DDI, String numeroTelefone) {
        this.DDD = DDD;
        this.DDI = DDI;
        this.numeroTelefone = numeroTelefone;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getDDI() {
        return DDI;
    }

    public void setDDI(int DDI) {
        this.DDI = DDI;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "DDD=" + DDD +
                ", DDI=" + DDI +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
