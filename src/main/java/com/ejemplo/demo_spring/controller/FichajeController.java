package com.ejemplo.demo_spring.controller;

import com.ejemplo.demo_spring.model.Fichaje;
import com.ejemplo.demo_spring.service.FichajeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FichajeController {

    private final FichajeService fichajeService;

    public FichajeController(FichajeService fichajeService) {
        this.fichajeService = fichajeService;
    }

    @GetMapping("/fichaje")
    public String anunciarFichaje() {
        Fichaje f = fichajeService.generarNuevoFichaje();
        
        return """
            <!DOCTYPE html>
            <html lang="es">
            <head>
                <meta charset="UTF-8">
                <title>Simulador de Fichajes por Capas</title>
                <style>
                    body { background-color: #f4f4f9; display: flex; flex-direction: column; align-items: center; justify-content: center; height: 100vh; font-family: 'Segoe UI', sans-serif; margin: 0; }
                    .card { border: 4px solid #c8102e; padding: 30px; width: 320px; text-align: center; border-radius: 15px; background-color: #fff; box-shadow: 0 8px 20px rgba(0,0,0,0.15); }
                    .btn { margin-top: 30px; padding: 15px 30px; background-color: #00285e; color: white; border: none; border-radius: 50px; font-size: 16px; cursor: pointer; font-weight: bold; }
                    .btn:hover { background-color: #001b40; }
                </style>
            </head>
            <body>
                <div class="card">
                    <h2 style="margin-top: 0; color: #00285e;">¡Fichaje por Capas! 🦈</h2>
                    <h1 style="color: #c8102e; margin: 15px 0;">%s</h1>
                    <p style="font-size: 1.2em; color: #333;"><strong>Posición:</strong> %s</p>
                    <p style="font-size: 1.1em; color: #555; font-style: italic;">%s</p>
                </div>
                <button class="btn" onclick="window.location.reload()">🔄 Simular Otro Fichaje</button>
            </body>
            </html>
            """.formatted(f.getJugador(), f.getPosicion(), f.getRol());
    }
}