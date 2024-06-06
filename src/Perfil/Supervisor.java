package Perfil;

public class Supervisor extends Usuario{
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String areaResponsavel;

    public Supervisor() {
    }

    public Supervisor(String nome, String dataNascimento, String cpf, String areaResponsavel) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.areaResponsavel = areaResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAreaResponsavel() {
        return areaResponsavel;
    }

    public void setAreaResponsavel(String areaResponsavel) {
        this.areaResponsavel = areaResponsavel;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", areaResponsavel='" + areaResponsavel + '\'' +
                "} " + super.toString();
    }
}
