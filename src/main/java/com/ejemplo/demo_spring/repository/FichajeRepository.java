package com.ejemplo.demo_spring.repository;

import com.ejemplo.demo_spring.model.Fichaje;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Random;

@Repository
public class FichajeRepository {

    private final List<Fichaje> listaFichajes = List.of(
        new Fichaje("Carlos Bacca", "Delantero", "Fichaje Estrella ⭐"),
        new Fichaje("Yimmi Chará", "Mediocampista", "Ídolo que regresa"),
        new Fichaje("Santiago Mele", "Portero", "Refuerzo de lujo"),
        new Fichaje("Víctor Cantillo", "Mediocampista", "Refuerzo de lujo"),
        new Fichaje("José Enamorado", "Delantero", "Promesa de la cantera")
    );

    public Fichaje obtenerFichajeAleatorio() {
        Random random = new Random();
        return listaFichajes.get(random.nextInt(listaFichajes.size()));
    }
}