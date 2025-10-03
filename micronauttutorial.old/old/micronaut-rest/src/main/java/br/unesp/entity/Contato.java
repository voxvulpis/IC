package br.unesp.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@MappedEntity("contato")
public class Contato {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private long idContato;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato(){
        
    }

}
