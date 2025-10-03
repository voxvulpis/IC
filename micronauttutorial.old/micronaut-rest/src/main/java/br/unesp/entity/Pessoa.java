package br.unesp.entity;

import java.util.ArrayList;
import java.util.List;
// import java.util.ArrayList;
// import java.util.List;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@Serdeable
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoa;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_idPessoa")
    private List<Endereco> endereco;
    // private Acesso acesso;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contato_idContato")
    private Contato contato;

    public Pessoa() {
        this.endereco = new ArrayList<>();
    }
    
    public void setIdPessoa(){
    }
}
