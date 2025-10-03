package br.unesp.entity;

import java.util.Date;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Embeddable
public class Fisica {

    @EmbeddedId
    private String cpf;
    private Date dataNascimento;

    public Fisica(){
        
    }

}
