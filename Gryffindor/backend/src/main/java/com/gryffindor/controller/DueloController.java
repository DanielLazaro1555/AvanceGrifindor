package com.gryffindor.controller;

import com.gryffindor.model.HechizoMensaje;
import com.gryffindor.model.ResultadoDuelo;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class DueloController {

    @MessageMapping("/hechizo")
    @SendTo("/topic/resultado")
    public ResultadoDuelo procesarHechizo(HechizoMensaje mensaje) throws InterruptedException {
        // Simulación simple de lógica del duelo
        Thread.sleep(1000); // Delay para simular proceso

        String resultado = "Jugador " + mensaje.getJugador() + " lanzó " + mensaje.getHechizo();
        return new ResultadoDuelo(resultado);
    }
}
