package br.unesp.entity;

import java.util.Date;

import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@MappedEntity("fisica")
public class Fisica {

    private String cpf;
    private Date dataNascimento;

    public Fisica(){
        
    }

}
