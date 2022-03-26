package ro.fasttrackit.lab6.tema;

import java.util.Arrays;

public class ExercitiiTema {
    public static void main(String[] args) {
        System.out.println(produsIntregiSir(new int[]{1, 22, 3, 43, 5, 61, 7}));
    }

    private static int produsIntregiSir(int[] sir) {
        int rezultat = 1;
        for (int i = 0; i < sir.length; i++) {
            rezultat *= sir[i];
        }
        return rezultat;
    }
}
