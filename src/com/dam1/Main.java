package com.dam1;

import libreriasv8.FactoriaDeSalidas;
import libreriasv8.InterfaceMetodosComunes;

public class Main {

    public static void main(String[] args) {

        InterfaceMetodosComunes unaConsola = FactoriaDeSalidas.getProducto(1, "Hi");
        unaConsola.visualiza();

        InterfaceMetodosComunes unaVentana = FactoriaDeSalidas.getProducto(2,"Bye");
        unaVentana.visualiza();
    }
}
