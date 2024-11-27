/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista3correcao;

import java.io.File;

/**
 *
 * @author joao3
 */
public class Lista3Correcao {

    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

    private long obterTamanhoArquivos(File arquivos) {
        long total = 0;

        File[] dir = arquivos.listFiles();
        if (dir != null) {
            for (File f : dir) {
                if (f.isDirectory()) {
                    total += obterTamanhoArquivos(f);
                } else {
                    total += f.length();
                }
            }
        }
        return total;
    }
}
