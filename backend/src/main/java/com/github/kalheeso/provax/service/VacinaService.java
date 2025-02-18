package com.github.kalheeso.provax.service;

import com.github.kalheeso.provax.domain.Vacina;
import com.github.kalheeso.provax.repository.VacinaRepository;
import org.springframework.stereotype.Service;

@Service
public class VacinaService {
    private final VacinaRepository vacinaRepository;

    public VacinaService(VacinaRepository vacinaRepository) {
        this.vacinaRepository = vacinaRepository;
    }

    public Iterable<Vacina> findAll() {
        return vacinaRepository.findAll();
    }

    public Vacina create(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    public void deleteById(Long id) {
        vacinaRepository.deleteById(id);
    }
}
