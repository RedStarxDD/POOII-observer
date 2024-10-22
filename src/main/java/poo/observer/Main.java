/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.observer;

import poo.observer.events.ReservaListener;
import poo.observer.events.NuevoListener;
import poo.observer.events.VencimientoListener;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca=new Biblioteca();
        biblioteca.añadirLibros(new Libro(1, "100 años de soledad"));
        Cliente cliente1=new Cliente(1, "Dante", biblioteca),
                cliente2=new Cliente(2, "Lileth", biblioteca);
        
        cliente1.getBiblioteca().notificaciones.suscribirse("vencimiento", new VencimientoListener());
        cliente1.getBiblioteca().notificaciones.suscribirse("nuevo", new NuevoListener());
        cliente1.getBiblioteca().notificaciones.suscribirse("reserva", new ReservaListener());
        
        cliente2.getBiblioteca().notificaciones.suscribirse("nuevo", new NuevoListener());
        
        biblioteca.vencimientoPrestamo(1);
        biblioteca.nuevoLibro(1);
        biblioteca.cambiarReserva(1);
    }
}
