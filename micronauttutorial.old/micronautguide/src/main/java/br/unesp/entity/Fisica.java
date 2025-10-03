package br.unesp.entity;

import java.util.Date;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Entity(name = "fisica")
public class Fisica {

    private String cpf;
    private Date dataNascimento;

    public Fisica(){
        
    }

}
