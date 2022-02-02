package com.dam1;
// importamos la libreria
import libreriasv8.Consola;

public class Main {

    public static void main(String[] args) {
        // iinstanciamos una clase de la libreria
	    Consola miConsola = new Consola("Hola Consola");
        // usamos un método del nuevo objeto
        miConsola.visualiza();
    }
}
