package beatriz_ferraz.AEP_ODS_PERS;

import java.util.UUID;

public class Usuario {
    
    private String id;
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
       
        id = UUID.randomUUID().toString();
        setNome(nome);
        setSenha(senha);
    }

    public String getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() == 0 || nome.trim().split(" ").length < 2) {
            throw new RuntimeException("O nome deve conter duas palavras.");
        }
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.trim().length() < 6 ||  senha.trim().length() > 12) {
            throw new RuntimeException("Senha deve ter entre 6 e 12 caracteres.");
        }
        this.senha = senha;
    }

    @Override
    public String toString() {
        return nome;
    }
}
