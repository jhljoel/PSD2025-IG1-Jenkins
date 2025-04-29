package org.example;

import java.util.ArrayList;
import java.util.List;

public class MarcoUtil {

    public List<String> generarMarco(String texto) {
        String[] palabras = texto.split("\\s+");

        int maxLen = 0;
        for (String palabra : palabras) {
            maxLen = Math.max(maxLen, palabra.length());
        }

        int ancho = maxLen + 4;
        List<String> resultado = new ArrayList<>();

        String borde = "*".repeat(ancho);
        resultado.add(borde);

        String formato = String.format("%%-%ds", maxLen); // genera "%-Ns"

        for (String palabra : palabras) {
            String linea = "* " + String.format(formato, palabra) + " *";
            resultado.add(linea);
        }

        resultado.add(borde);
        return resultado;
    }
}
