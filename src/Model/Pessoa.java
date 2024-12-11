package Model;

public class Pessoa {

    private int id;
    //add getters e setters
    private String nome;
    private String cargo;
    private String email;
    private String senha;


    public Pessoa() {
    }

    public Pessoa(int id, String nome, String cargo, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }
    public void setId (int id){
        this.id = id;

    }

    public String getNome() {
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;

    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
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