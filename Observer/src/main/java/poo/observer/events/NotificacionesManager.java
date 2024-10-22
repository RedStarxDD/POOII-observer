/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.observer.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import poo.observer.Libro;

/**
 *
 * @author user
 */
public class NotificacionesManager {
    Map<String, List<NotificacionesListener>> listeners = new HashMap<>();

    public NotificacionesManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void suscribirse(String eventType, NotificacionesListener listener) {
        List<NotificacionesListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void desuscribirse(String eventType, NotificacionesListener listener) {
        List<NotificacionesListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notificar(String eventType, Libro libro) {
        List<NotificacionesListener> users = listeners.get(eventType);
        for (NotificacionesListener listener : users) {
            listener.actualizar(libro);
        }
    }    
}
