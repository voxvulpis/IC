package br.unesp.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@MappedEntity("endereco")
public class Endereco {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private long idEndereco;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    @Relation(value = Relation.Kind.MANY_TO_ONE)
    private Pessoa pessoa;

    public Endereco() {
    }

}
