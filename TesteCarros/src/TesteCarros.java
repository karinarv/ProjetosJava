import java.util.ArrayList;
import java.util.Collections;

public class TesteCarros {
    public static void main(String[] args) {
        //Elementos
        String carro1 = "Saveiro";
        String carro2 = "Gol";
        String carro3 = "Uno";
        String carro4 = "Ranger";
        String carro5 = "Civic";

        //Instancia do Array List
        ArrayList<String> carros = new ArrayList<>();

        //Adicionando os elementos
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);

        //Imprimindo
        System.out.println(carros);

        //Ordenando elementos
        Collections.sort(carros);
        System.out.println(carros);

        //Removendo elemento
        carros.remove(2);

        //Adicionando mais um elemento
        String carro6 = "Corolla";
        carros. add(carro6);

        // Percorrendo o array
        for (String i : carros) {
            System.out.print(" * " + i);
        }

    }
}
