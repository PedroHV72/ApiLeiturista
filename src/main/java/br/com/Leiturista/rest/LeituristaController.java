package br.com.Leiturista.rest;

import br.com.Leiturista.model.Leiturista;
import br.com.Leiturista.repository.LeituristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leiturista")
public class LeituristaController {

    @Autowired
    private LeituristaRepository leituristaRepository;

    @PostMapping
    private Leiturista adicionar(@RequestBody Leiturista leiturista) {
        return leituristaRepository.save(leiturista);
    }

    @GetMapping
    private List<Leiturista> listar() {
        return leituristaRepository.findAll();
    }

    @DeleteMapping
    private void deletar() {
        leituristaRepository.deleteAll();
    }

}
