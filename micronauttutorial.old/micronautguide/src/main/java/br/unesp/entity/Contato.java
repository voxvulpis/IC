package br.unesp.entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Entity(name = "contato")
public class Contato {

    @Id
    @Column(name = "idContato", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idContato;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato(){
        
    }

}
