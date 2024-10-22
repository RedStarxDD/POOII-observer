/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.observer;

import poo.observer.events.NotificacionesManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Biblioteca {
    public NotificacionesManager notificaciones;
    private List<Libro> libros;

    public Biblioteca() {
        this.notificaciones = new NotificacionesManager("vencimiento", "nuevo", "reserva");
        this.libros = new ArrayList<>();
    }
    
    public void añadirLibros(Libro libro){
        libros.add(libro);
    }
    
    public void vencimientoPrestamo(int idLibro){
        notificaciones.notificar("vencimiento", encontrarLibro(idLibro));
    }
    
    public void nuevoLibro(int idLibro){
        notificaciones.notificar("nuevo", encontrarLibro(idLibro));       
    }
    
    public void cambiarReserva(int idLibro){
        notificaciones.notificar("reserva", encontrarLibro(idLibro));       
    }
    
    public Libro encontrarLibro(int idLibro){
        for (Libro l : libros) {
            if(l.getId()==idLibro){
                return l;
            }
        }
        return null;
    }
}
