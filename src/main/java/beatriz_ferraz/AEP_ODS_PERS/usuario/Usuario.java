package beatriz_ferraz.AEP_ODS_PERS.usuario;

import javax.persistence.Entity;

import beatriz_ferraz.AEP_ODS_PERS.BaseEntity;

@Entity
public class Usuario extends BaseEntity {
    
    private String nome;
    private String senha;

    public Usuario() {
        super();
    }

    public Usuario(String nome, String senha) {
        this();
        setNome(nome);
        setSenha(senha);
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
        return "Usuario: " + nome + "\n";
    }
}
