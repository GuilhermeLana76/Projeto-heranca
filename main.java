package br.edu.projeto;

import br.edu.projeto.modelo.Instrumento;
import br.edu.projeto.modelo.Violao;
import br.edu.projeto.modelo.Piano;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   DEMONSTRAÇÃO DE HERANÇA - Instrumentos Musicais");
        System.out.println("========================================\n");

        Violao violao1 = new Violao("Violão Clássico", "Yamaha", 450.00, 2022, 6, "Nylon");
        Violao violao2 = new Violao("Violão Folk", "Fender", 650.00, 2023, 6, "Aço");
        Piano piano1 = new Piano("Piano de Cauda", "Steinway", 25000.00, 2020, 88, true);

        List<Instrumento> instrumentos = new ArrayList<>();
        instrumentos.add(violao1);
        instrumentos.add(violao2);
        instrumentos.add(piano1);

        System.out.println("--- LISTA DE INSTRUMENTOS ---\n");
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
            System.out.println();
        }

        System.out.println("\n--- TOCANDO OS INSTRUMENTOS ---\n");
        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
            System.out.println("   Tipo de Som: " + instrumento.obterTipoDeSom());
            System.out.println();
        }

        System.out.println("\n--- MANUTENÇÃO DOS INSTRUMENTOS ---\n");
        System.out.println(violao1.afinarCordas());
        System.out.println(violao2.afinador());
        System.out.println(piano1.regularAltura());

        System.out.println("\n========================================");
        System.out.println("   FIM DA DEMONSTRAÇÃO");
        System.out.println("========================================");
    }
}