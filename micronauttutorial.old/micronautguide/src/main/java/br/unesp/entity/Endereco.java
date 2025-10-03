package br.unesp.entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Entity(name = "endereco")
public class Endereco {

    @Id
    @Column(name = "idEndereco", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEndereco;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    @ManyToOne
    private Pessoa pessoa;

    public Endereco() {
    }

}
