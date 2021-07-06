package Set;

import java.util.*;

public class Exercicio01 {

    public static void main(String[] args) {


        Set<String> cores = new LinkedHashSet<>();
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Anill");
        cores.add("Violeta");

        System.out.println(cores);

        System.out.println("--------------------------");

        System.out.println("Quantidade de cores: " + cores.size());

        System.out.println("--------------------------");

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("--------------------------");
        Set<String> cores3 = new LinkedHashSet<>();
        cores3.add("Vermelho");
        cores3.add("Laranja");
        cores3.add("Amarelo");
        cores3.add("Verde");
        cores3.add("Azul");
        cores3.add("Anill");
        cores3.add("Violeta");
        List<String> cores4 = new ArrayList<>(cores);
        Collections.reverse(cores4);
        System.out.println("Imprimento as cores inversa da que foi informada");
        System.out.println(cores4);

        System.out.println("--------------------------");
        System.out.println("Exibir todas as cores com letra V");
        for (String cor: cores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto: ");
        cores.clear();

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());


    }
}
