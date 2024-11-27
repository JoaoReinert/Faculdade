/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploaulaarquivo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.DirectoryNotEmptyException;
import java.util.Scanner;

/**
 *
 * @author joao3
 */
public class ExemploAulaArquivo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite o caminho do diretorio");
        String directoryPath = scan.nextLine();
        
        try {
            File directory = new File(directoryPath);
            if (!directory.exists() || !directory.isDirectory()) {
                throw new Exception("o diretorio nao existe");
            }
            
            long totalSizeInBytes = calculateDirectorySize(directory);
            double totalSizeInMegaBytes = totalSizeInBytes / (1024.0 * 1024.0);
            
            System.out.printf("Tamanho total dos arquivos: %.2f MB\\n\", totalSizeInMegabytes");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
    
    public static long calculateDirectorySize(File directory) {
          long totalSize = 0;
          
          File[] files = directory.listFiles();
          
          if (files != null) {
              for (File file : files) {
                  if (file.isDirectory()) {
                      totalSize += calculateDirectorySize(file);
                  } else {
                      totalSize += file.length();
                  }
              }
          }
          return totalSize;
    }
    
}
