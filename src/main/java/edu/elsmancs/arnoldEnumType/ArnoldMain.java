package edu.elsmancs.arnoldEnumType;

import edu.elsmancs.arnoldEnumType.Planeta;

public class ArnoldMain {
    public static void main(String[] args) {
        double peso = 1.0;

        for(Planeta planeta : Planeta.values()) {
            System.out.printf("Tu peso en %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
    }
}
