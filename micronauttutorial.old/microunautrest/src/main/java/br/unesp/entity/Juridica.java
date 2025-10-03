package br.unesp.entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Embeddable
public class Juridica {

    @EmbeddedId
    private String cnpj;

    public Juridica(){
        
    }

}
