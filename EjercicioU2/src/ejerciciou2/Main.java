/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciou2;

import Controlador.ListaEnlazada.ListaEnlazada;
import Modelo.Persona;

/**
 *
 * @author David Campoverde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
//            ListaEnlazada<Integer> lista = new ListaEnlazada<>();
//            lista.insertar(6);
//            lista.insertar(0);
//            lista.insertar(-1);
//            lista.insertar(60);
//            lista.insertar(6);
//            lista.insertar(90);
//            lista.imprimir();
//            //lista.order_seleccion(null, 2);
//            lista.imprimir();
//            System.out.println("BUSQUEDA");
//            lista.buscar(null, 6).imprimir();
//
//            ListaEnlazada<String> lista1 = new ListaEnlazada<>();
//            lista1.insertar("Soto");
//            lista1.insertar("Campoverde");
//            lista1.insertar("Mercurio");
//            lista1.insertar("Granda");
//            lista1.insertar("Intriago");
//            lista1.buscar(null, "Soto").imprimir();
//            lista1.imprimir();
//            lista1.order_seleccion(null, 1);
//            lista1.imprimir();
            
            ListaEnlazada<Persona> personas = new ListaEnlazada<>();
            personas.insertar(new Persona ("David", "Campoverde"));
            personas.insertar(new Persona ("Belen", "Alvarez"));
            personas.insertar(new Persona ("Mauricio", "Soto"));
            personas.insertar(new Persona ("Lionel", "Messi"));
            personas.insertar(new Persona ("Rodolfo", "Granda"));
            personas.insertar(new Persona ("Julieta", "Zuniga"));
            personas.buscar("apellidos", "ra").imprimir();
//            personas.imprimir();
//            personas.order_seleccion("nombres", 1);
//            personas.imprimir();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
