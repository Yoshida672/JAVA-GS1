package Perfil;

public class Usuario {

    private Telefone telefone;
    private Endereco endereco;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(Telefone telefone, Endereco endereco, String email, String senha) {
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "telefone=" + telefone +
                ", endereco=" + endereco +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
