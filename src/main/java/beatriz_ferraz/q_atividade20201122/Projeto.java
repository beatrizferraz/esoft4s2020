package beatriz_ferraz.q_atividade20201122;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import java.util.Set;
import java.util.HashSet;

@Entity
public class Projeto extends BaseEntity {
    private String nome;
    private String dataDeInicio;
    private String prazoParaTerminar;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Funcionario> funcionarios = new HashSet<>();

    @OneToOne
    private LiderDeProjeto liderDeProjeto;

    public Projeto() {
        super();
    }

    public Projeto(String nome, LiderDeProjeto liderDeProjeto, String dataDeInicio, String prazoParaTerminar) {
        this();
        this.nome = nome;
        this.liderDeProjeto = liderDeProjeto; 
        this.dataDeInicio = dataDeInicio;
        this.prazoParaTerminar = prazoParaTerminar;
    }

    public String getNome() {
        return nome;
    }

    public LiderDeProjeto getLiderDeProjeto() {
        return liderDeProjeto;
    }

    public String getDataDeInicio() {
        return dataDeInicio;
    }

    public String getPrazoParaTerminar() {
        return prazoParaTerminar;
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public int getTamanhoDaEquipe() {
        int tamanhoDaEquipe = 0;
        for(int i = 0; i < funcionarios.size(); i ++) {
            tamanhoDaEquipe ++;
        }
        return tamanhoDaEquipe + 1; // + o lider de projeto
    }

    @Override
    public String toString() {
        String stringFuncionarios = "Funcionarios na equipe: \n";
        for(Funcionario f: this.funcionarios) {
            stringFuncionarios += f.toString();
        }
        
        return "Nome do projeto: " + nome + "\n"
                + "Lider do projeto: " + liderDeProjeto + "\n"
                + "Data de Inicio: " + dataDeInicio + "\n"
                + "Prazo: " + prazoParaTerminar + "\n"
                + stringFuncionarios.substring(0,stringFuncionarios.length())
                + "\nTamanho da equipe: " + getTamanhoDaEquipe();
    }
}
