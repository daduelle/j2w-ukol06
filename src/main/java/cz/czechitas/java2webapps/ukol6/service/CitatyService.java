package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {

    private CitatyRepository repository;
    private NahodneCisloService nahodneCislo;

    @Autowired
    public void CitatyRepository(CitatyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void NahodneCisloService(NahodneCisloService nahodneCislo) {
        this.nahodneCislo = nahodneCislo;
    }

    public String nahodnyCitat() {
        return repository.citat(nahodneCislo.dejNahodneCislo(repository.pocet()));
    }

    public String konkretniCitat(int index) {
        return repository.citat(index - 1);
    }
}

