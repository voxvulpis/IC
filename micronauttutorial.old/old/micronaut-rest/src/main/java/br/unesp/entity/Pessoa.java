package br.unesp.entity;

import java.util.ArrayList;
import java.util.List;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;
import io.micronaut.data.annotation.sql.JoinColumn;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Introspected
@MappedEntity("pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private long idPessoa;
    private String nome;
    @Relation(value = Relation.Kind.ONE_TO_MANY)
    @JoinColumn
    private List<Endereco> endereco;
    @Relation(value = Relation.Kind.ONE_TO_ONE)
    @JoinColumn
    private Acesso acesso;
    @Relation(value = Relation.Kind.ONE_TO_ONE)
    @JoinColumn
    private Contato contato;

    
    public Pessoa() {
        this.endereco = new ArrayList<>();
    }
    public void setEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }

}
