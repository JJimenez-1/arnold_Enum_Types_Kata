package edu.elsmancs.arnoldEnumType;

import edu.elsmancs.arnoldEnumType.Planeta;

public class ArnoldMain {
    public static void main(String[] args) {
        double peso = 1.0;

        for(Planeta planeta : Planeta.values()) {
            System.out.printf("Tu peso en %s es %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nTu peso solo en los planetas terrestres: ");
        for(Planeta planeta : Planeta.getPlanetasTerrestres()){
            System.out.printf("Tu peso en %s es %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nTu peso solo en los planetas gaseosos: ");
        for(Planeta planeta : Planeta.getGigantesGaseosos()){
            System.out.printf("Tu peso en %s es %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
    }
}
