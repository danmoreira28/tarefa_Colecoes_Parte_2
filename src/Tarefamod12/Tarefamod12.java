package Tarefamod12;

import java.util.Scanner;

public class Tarefamod12 {
    public static void main(String[] args) {
        System.out.println("#### Digite sua lista de nomes e sexos, separados por espaço e vírgula ####");
        Scanner scanner = new Scanner(System.in);
        String nomes = scanner.nextLine();
        String[] nomeSexoArray = nomes.split(",");

        for (String nomeSexo : nomeSexoArray) {
            String[] partes = nomeSexo.trim().split("-");
            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();

            if (sexo.equals("M")) {
                System.out.println(nome + " é masculino");
            } else if (sexo.equals("F")) {
                System.out.println(nome + " é feminino");
            } else {
                System.out.println("Sexo desconhecido para " + nome);
            }
        }

        scanner.close();
    }
}

