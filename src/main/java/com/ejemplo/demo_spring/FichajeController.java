package com.ejemplo.demo_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class FichajeController {

    private final String[] jugadores = {"Carlos Bacca", "Yimmi Chará", "Santiago Mele", "Víctor Cantillo", "José Enamorado", "Didier Moreno"};
    private final String[] roles = {"Fichaje Estrella ⭐", "Ídolo que regresa", "Promesa de la cantera", "Refuerzo de lujo"};
    private final String[] posiciones = {"Delantero", "Mediocampista", "Defensa", "Portero"};

    @GetMapping("/fichaje")
    public String anunciarFichaje() {
        Random random = new Random();
        
        String jugador = jugadores[random.nextInt(jugadores.length)];
        String rol = roles[random.nextInt(roles.length)];
        String posicion = posiciones[random.nextInt(posiciones.length)];
        
        return """
            <!DOCTYPE html>
            <html lang="es">
            <head>
            <meta charset="UTF-8">
            <title>Simulador de Fichajes</title>
                <style>
                    body { background-color: #f4f4f9; display: flex; flex-direction: column; align-items: center; justify-content: center; height: 100vh; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; }
                    .card { border: 4px solid #c8102e; padding: 30px; width: 320px; text-align: center; border-radius: 15px; background-color: #fff; box-shadow: 0 8px 20px rgba(0,0,0,0.15); transition: transform 0.2s; }
                    .card:hover { transform: scale(1.03); }
                    .btn { margin-top: 30px; padding: 15px 30px; background-color: #00285e; color: white; border: none; border-radius: 50px; font-size: 16px; cursor: pointer; font-weight: bold; box-shadow: 0 4px 10px rgba(0, 40, 94, 0.3); transition: all 0.3s ease; }
                    .btn:hover { background-color: #001b40; transform: translateY(-2px); }
                </style>
            </head>
            <body>
                <div class="card">
                    <h2 style="margin-top: 0; color: #00285e;">¡Nuevo Fichaje Tiburón! 🦈</h2>
                    <h1 style="color: #c8102e; margin: 15px 0;">%s</h1>
                    <p style="font-size: 1.2em; color: #333;"><strong>Posición:</strong> %s</p>
                    <p style="font-size: 1.1em; color: #555; font-style: italic;">%s</p>
                </div>
                
                <!-- Este es el botón que le da vida al proyecto -->
                <button class="btn" onclick="window.location.reload()">🔄 Simular Otro Fichaje</button>
            </body>
            </html>
            """.formatted(jugador, posicion, rol);
    }
}