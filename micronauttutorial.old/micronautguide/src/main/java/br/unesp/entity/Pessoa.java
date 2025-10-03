package br.unesp.entity;

import java.util.ArrayList;
import java.util.List;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Introspected
@Entity(name = "pessoa")
public class Pessoa {

    @Id
    @Column(name = "idPessoa", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoa;
    private String nome;
    @OneToMany
    @JoinColumn
    private List<Endereco> endereco;
    @OneToOne
    @JoinColumn
    private Acesso acesso;
    @OneToOne
    @JoinColumn
    private Contato contato;

    
    public Pessoa() {
        this.endereco = new ArrayList<>();
    }
    public void setEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }

}
