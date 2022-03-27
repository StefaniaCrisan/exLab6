package ro.fasttrackit.lab6.tema;

import java.util.Arrays;

public class ExercitiiTema {
    public static void main(String[] args) {
        System.out.println("1. Produsul numerelor: " + produsIntregiSir(new int[]{1, 22, 3, 43, 5, 61, 7}));
        System.out.println(numereImpare(new int[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(numereMaiMici(new int[]{1, 2, 3, 4, 5, 6, 7}, 5));
    }

    private static int numereMaiMici(int[] sir, int numar) {
        System.out.println("3. Numerele mai mici decat " + numar + " sunt:");
        int i = 0;
        for (i = 0; i < sir.length; i++) {
            if (sir[i] < numar) {
                System.out.println(sir[i]);
            }
        }
        return numar;
    }

    private static int[] numereImpare(int[] sir) {
        System.out.println("2. Numarele impare sunt: ");
        int[] sirImpar = new int[sir.length];
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] % 2 != 0) {
                sirImpar[i] = sir[i];
                System.out.println(sirImpar[i]);
            }
        }
        return sirImpar;
    }

    private static int produsIntregiSir(int[] sir) {
        int rezultat = 1;
        for (int i = 0; i < sir.length; i++) {
            rezultat *= sir[i];
        }
        return rezultat;
    }

}
