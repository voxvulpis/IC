package br.unesp.entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Contato")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@Serdeable
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idContato;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato(){}

    public void setIdContato(){}
}
