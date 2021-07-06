package List;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
//      Dado uma lista com 7 notas de aluno {7, 8.5, 9.3, 5, 7, 0, 3.6}, faça:
//      List notas = new ArrayList(); // antes do java 5
//      List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamant Operator(jdk 7)
//      ArrayList<Double> notas = new ArrayList<>()]
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

/*      List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // pode porém nao será possível adicionar ou remover
        notas.add(10d);
        System.out.println(notas);
*/
        //dessa maneira torna a lista imutável
/*      List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.5);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());
        System.out.println("---------------------------");

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
        System.out.println("---------------------------");

        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        notas.add(4,8.0);
        System.out.println(notas);
        System.out.println("---------------------------");

        System.out.println("Substitui a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println("---------------------------");

        System.out.println("Confira se nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("---------------------------");

        System.out.println("Exiba todas a notas na ordem em que foram informada: ");
        System.out.println(notas.toString());
        System.out.println("---------------------------");

        System.out.println("Percorrendo a lista");
        for (Double nota : notas){
            System.out.println(nota);
        }

        System.out.println("Exibe a terceira nota adicionada: " + notas.get(2));
        System.out.println("---------------------------");


        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("---------------------------");

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();

        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("---------------------------");


        System.out.println("Exiba a média das notas: " + soma / notas.size());
        System.out.println("---------------------------");

        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("---------------------------");

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);
        System.out.println("---------------------------");


        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7.0){
                iterator1.remove();
            }
        }

        System.out.println(notas);
        System.out.println("---------------------------");


        System.out.println("Apague tada a Lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("---------------------------");
        System.out.println("Confira se a lista está vazia+ " + notas.isEmpty());

        System.out.println("------------- EXERCICIOS --------------");

/*

        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList

        System.out.println("Crie uma Lista notas2 " +
        "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-la: ");

        System.out.println("Mostre a primeira nota da nova lista removendo-a: ")

 */
        //List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        Queue<Double> notas2 = new LinkedList<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);
        System.out.println("---------------------------");


        System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + notas2.peek());
        System.out.println("---------------------------");

        System.out.println("Mostre a primeira nota da nova lista removendo-a: " + notas2.poll());
        System.out.println("---------------------------");
        System.out.println(notas2);

    }

}
