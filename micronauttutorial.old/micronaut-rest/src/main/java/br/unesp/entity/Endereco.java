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

@Entity(name = "Endereco")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@Serdeable
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEndereco;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String estado;
    private String cidade;

    public void setIdEndereco(){}
}
