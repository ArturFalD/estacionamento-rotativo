package model.bean;

public class Motorista {

    private int idMotorista;
    private String nome;
    private String rg;
    private String genero;
    private String celular;
    private String cpf;
    private String email;
    private String senha;

    public int getIdMotorista() {
        return idMotorista;
    }
    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getGenero() {
       return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}
