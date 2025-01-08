 package br.unesp.springtutorial.repository;

import br.unesp.springtutorial.entity.Fisica;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Prof. Dr. Frank J. Affonso
 */
public interface FisicaRepository extends JpaRepository<Fisica, Long> {

    Fisica findByCpf(String cpf);

}