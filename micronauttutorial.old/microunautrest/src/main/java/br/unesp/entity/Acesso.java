package br.unesp.entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@Entity
@Table(name = "acesso")
public class Acesso {
    @Id
    @Column(name = "usuario", nullable = false, unique = true)
    private String usuario;
    private String senha;
}