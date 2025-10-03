package br.unesp.entity;

import io.micronaut.data.annotation.Embeddable;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@Serdeable
public class Acesso {
    @Column(name = "acesso_usuario")
    private String usuario;
    @Column(name = "acesso_senha")
    private String senha;

    public Acesso(){}
}