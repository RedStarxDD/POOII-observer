/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.observer.events;

import poo.observer.Libro;

/**
 *
 * @author user
 */
public class VencimientoListener implements NotificacionesListener{

    @Override
    public void actualizar(Libro libro) {
        System.out.println("Venció el préstamo del libro: "+libro.getNombre());
    }
    
}
