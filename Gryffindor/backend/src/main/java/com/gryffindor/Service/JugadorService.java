package com.gryffindor.service;

import com.gryffindor.model.Jugador;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JugadorService {
    private final Map<String, Jugador> jugadores = new HashMap<>();

    public void registrarJugador(String idSesion, Jugador jugador) {
        jugadores.put(idSesion, jugador);
    }

    public Jugador obtenerJugador(String idSesion) {
        return jugadores.get(idSesion);
    }

    public void eliminarJugador(String idSesion) {
        jugadores.remove(idSesion);
    }
}
