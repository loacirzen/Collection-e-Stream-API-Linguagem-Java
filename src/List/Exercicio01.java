package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meses = 6;
        List<Double> temperaturas = new ArrayList<>();

        for(int i = 0; i<meses; i++){
            System.out.print("Entre com a temperatura do mês "+ i + " : ");
            temperaturas.add(scan.nextDouble());
        }

        Double somaTemperatura = 0.0;
        Iterator<Double> iterator = temperaturas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            somaTemperatura += next;

        }

        double mediaTemperatura = (somaTemperatura / meses);

        for(int i = 0; i<meses; i++){

            String mesesAno = "";

            switch (i){
                case 0 : mesesAno = "Janeiro"; break;
                case 1 : mesesAno = "Fevereiro"; break;
                case 2 : mesesAno = "Março"; break;
                case 3 : mesesAno = "Abril"; break;
                case 4 : mesesAno = "Maio"; break;
                case 5 : mesesAno = "Junho";
            };

            if(temperaturas.get(i) > mediaTemperatura){
                System.out.println(i + " - " + mesesAno + " : " + temperaturas.get(i));
            }
        }
    }
}
