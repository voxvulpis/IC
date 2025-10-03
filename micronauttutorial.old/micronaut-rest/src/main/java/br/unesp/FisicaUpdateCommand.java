package br.unesp;

import java.util.Date;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Serdeable
public class FisicaUpdateCommand {
    @NonNull
    private final String cpf;

    @NonNull
    private final Date dataNascimento;

}
