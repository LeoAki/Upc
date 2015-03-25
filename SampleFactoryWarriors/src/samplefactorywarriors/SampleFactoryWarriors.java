package samplefactorywarriors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SampleFactoryWarriors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        List<Warrior> misGuerreros = new ArrayList<>();
        char option;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Creacion de Guerreros");
            System.out.println("¿Qué tipo de guerrero deseas?");
            System.out.println("[N] Ninja , [S] Samurai, [T] TortugaNinja, [Q] Quit");
            System.out.println("Opción: ");
            option = entrada.readLine().toUpperCase().charAt(0);
            switch (option) {
                case 'N':
                    misGuerreros.add(WarriorFactory.crearGuerrero("Ninja"));
                    System.out.println("Ninja creado");
                    break;
                case 'S':
                    misGuerreros.add(WarriorFactory.crearGuerrero("Samurai"));
                    System.out.println("Samurai creado");
                    break;
                case 'T':
                    misGuerreros.add(WarriorFactory.crearGuerrero("TortuNinja"));
                    System.out.println("Tortuninja creado");
                    break;
            }
        } while (option == 'N' || option == 'S' || option == 'T');

        System.out.println("\nMis Guerreros creados");
        for (Warrior g : misGuerreros) {
            System.out.println(g.imprimirGuerrero());
        }
    }

}
