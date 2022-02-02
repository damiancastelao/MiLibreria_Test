package com.dam1;

import libreriasv8.FactoriaDeSalidas;
import libreriasv8.InterfaceMetodosComunes;


public class Main {

    public static void main(String[] args) {

        InterfaceMetodosComunes unaConsola = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CONSOLA, "Hi");
        unaConsola.visualiza();

        InterfaceMetodosComunes unaVentana = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.VENTANA,"Bye");
        unaVentana.visualiza();

        System.out.println("Mi modificación");
    }
}
