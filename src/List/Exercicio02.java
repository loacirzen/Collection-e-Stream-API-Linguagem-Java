package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        String classificacao = "";

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?: ");
        perguntas.add("Esteve no local do crime?: ");
        perguntas.add("Mora perto da vítima?: ");
        perguntas.add("Devia para a vítima?: ");
        perguntas.add("Já trabalhou com a vítima?: ");

        List<String> respostas = new ArrayList<>();

        System.out.println("Entre com (S)Sim ou (N)Não ");
        for(int i = 0; i< perguntas.size(); i++){
            System.out.print(perguntas.get(i));
            respostas.add(scan.nextLine());
        }

        Iterator<String> iterator = respostas.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.equalsIgnoreCase("S")) {
                cont++;
            }
        }

        if(cont == 2){
            classificacao = "Suspeito";
        } else if (cont >= 3 && cont <= 4){
            classificacao = "Cúmplice";
        } else if (cont == 5){
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("A classificação foi: " + classificacao);
    }
}
