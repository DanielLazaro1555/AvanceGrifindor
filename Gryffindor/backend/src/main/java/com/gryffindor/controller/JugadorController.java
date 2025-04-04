package com.gryffindor.controller;

import com.gryffindor.model.Jugador;
import com.gryffindor.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jugador")
@CrossOrigin(origins = "*") // permite que el frontend se conecte
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @PostMapping("/registrar/{idSesion}")
    public String registrarJugador(@PathVariable String idSesion, @RequestBody Jugador jugador) {
        jugadorService.registrarJugador(idSesion, jugador);
        return "Jugador registrado: " + jugador.getNombre() + " - Casa: " + jugador.getCasa();
    }

    @GetMapping("/obtener/{idSesion}")
public Jugador obtenerJugador(@PathVariable String idSesion) {
    return jugadorService.obtenerJugador(idSesion);
}


    @DeleteMapping("/eliminar/{idSesion}")
    public String eliminarJugador(@PathVariable String idSesion) {
        jugadorService.eliminarJugador(idSesion);
        return "Jugador eliminado";
    }
}
