package br.com.Leiturista.repository;

import br.com.Leiturista.model.Leiturista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeituristaRepository extends JpaRepository<Leiturista, Long> {

}
