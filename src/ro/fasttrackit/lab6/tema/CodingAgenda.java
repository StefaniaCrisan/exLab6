package ro.fasttrackit.lab6.tema;

import java.util.Scanner;
import java.lang.*;

public class CodingAgenda {
    public static int[] agenda = new int[4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alegeti optiunea: ");
        String alege = scanner.nextLine();
        switch (alege) {
            case "adaugare":
                System.out.println("Numarul " + add(agenda, 7423344) + " a fost adaugat");
                break;
            case "modificare":
                replace(agenda, 7544662, 8276552);
                System.out.println("Numerele au fost inlocuite");
                break;
            case "stergere":
                System.out.println("Numarul " + remove(agenda, 7657999) + " a fost sters");
                break;
            case "cautare":
                System.out.println("Rezultatul cautarii: " + search(agenda, 653778));
                break;
            default:
                System.out.println("-1");
        }
    }

    public static int add(int[] agenda, int nr) {
        int i = 0;
        for (i = 0; i < agenda.length; i++) {
            if (agenda[i] == 0) {
                agenda[i] = nr;
                break;  //break la fiec if ca sa se opreasca tot cand e gasit nr
            }
        }
        return nr;
    }

    public static int replace(int[] agenda, int actual, int newnr) {
        int i = 0;
        add(agenda, actual);
        for (i = 0; i < 4; i++) {
            if (agenda[i] == actual) {
                agenda[i] = newnr;
                break;
            }
        }
        return agenda[i];
    }

    public static int remove(int[] agenda, int nr) {
        int i = 0;
        add(agenda, nr);
        for (i = 0; i < 4; i++) {
            if (agenda[i] == nr) {
                agenda[i] = 0;
                break;
            }
        }
        return nr;
    }

    public static int search(int[] agenda, int nr) {
        int i = 0;
        add(agenda, nr);
        for (i = 0; i < 4; i++) {
            if (agenda[i] == nr) {
                System.out.println("Numar gasit");
                break;
            }
        }
        return agenda[i];
    }
}
