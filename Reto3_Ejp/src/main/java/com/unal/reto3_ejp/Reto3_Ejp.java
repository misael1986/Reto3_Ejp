/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.unal.reto3_ejp;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Reto3_Ejp {

    public static void main(String[] args) {
        Album album= new Album();
        ArrayList<Integer> lista= new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(5);
        lista.add(5);
        
        
        album.clases(lista);
    }
}
