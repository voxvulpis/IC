package br.unesp.entity;

import java.time.LocalDateTime;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PessoaFisica")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
@ToString(callSuper = true, includeFieldNames = true)
@Serdeable
public class Fisica extends Pessoa{
    @Column(name = "cpf", unique = true)
    private String cpf;
    
    private LocalDateTime dataNascimento;

    public Fisica(){}
}
