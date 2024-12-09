package Model;

public class Pessoa {
    //add getters e setters
    private String nome;
    private String cargo;
    private String email;
    private String senha;


    public Pessoa() {
    }

    public Pessoa(String nome, String cargo, String email, String senha) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.senha = email;
    }
}