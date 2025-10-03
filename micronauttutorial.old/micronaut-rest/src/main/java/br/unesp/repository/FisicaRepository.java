package br.unesp.repository;

import br.unesp.entity.Fisica;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.MYSQL)
public interface FisicaRepository extends CrudRepository<Fisica, Long> {
    // Fisica findByCpf(String cpf){
    //     return find("cpf", cpf).firstResult();
    // }

    // Fisica findbyCpf(String cpf);
    
    // @SuppressWarnings("unchecked")
    // Fisica save(Fisica fisica);
}