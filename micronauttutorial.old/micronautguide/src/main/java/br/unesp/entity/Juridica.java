package br.unesp.entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Entity(name = "juridica")
public class Juridica {

    private String cnpj;

    public Juridica(){
        
    }

}
