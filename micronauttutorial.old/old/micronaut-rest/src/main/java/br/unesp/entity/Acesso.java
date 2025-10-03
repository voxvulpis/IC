package br.unesp.entity;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Serdeable
@MappedEntity("acesso")
public class Acesso {
    @NotNull
    @Id
    private String usuario;
    @NotNull
    private String senha;
}