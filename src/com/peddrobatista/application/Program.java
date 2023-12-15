package com.peddrobatista.application;

import com.peddrobatista.entities.Rent;

import java.util.Scanner;

public class Program  {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Rent[] vetor = new Rent[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.print("Email: ");
            String email = teclado.next();
            System.out.print("Quarto: ");
            int roomNumber = teclado.nextInt();

            Rent aluguel = new Rent(name, email);

            vetor[roomNumber] = aluguel;
        }
        
        System.out.println();
        System.out.println("Quartos ocupados: ");

        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }

        teclado.close();
    }
}
