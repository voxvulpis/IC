package br.unesp.entity;

import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@MappedEntity("juridica")
public class Juridica {

    private String cnpj;

    public Juridica(){
        
    }

}
