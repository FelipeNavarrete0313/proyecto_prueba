package com.ejemplo.demo_spring.service;

import com.ejemplo.demo_spring.model.Fichaje;
import com.ejemplo.demo_spring.repository.FichajeRepository;
import org.springframework.stereotype.Service;

@Service
public class FichajeService {

    private final FichajeRepository fichajeRepository;

    public FichajeService(FichajeRepository fichajeRepository) {
        this.fichajeRepository = fichajeRepository;
    }

    public Fichaje generarNuevoFichaje() {
        // Aquí podrías agregar lógica de negocio adicional si lo requieres
        return fichajeRepository.obtenerFichajeAleatorio();
    }
}