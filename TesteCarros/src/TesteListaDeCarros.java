import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeCarros {

    public static void main(String[] args) {

        //Elementos do Array
        Carros c1 = new Carros("Argo", 2020);
        Carros c2 = new Carros("Saveiro", 2007);
        Carros c3 = new Carros ("Gol", 2005);
        Carros c4 = new Carros("Uno", 2003);
        Carros c5 = new Carros("Ranger", 2021);
        Carros c6 = new Carros("Civic", 2014);
        Carros c7 = new Carros("Corolla", 2009);

        //Instanciando ArrayList
        ArrayList<Carros> carros = new ArrayList<>();

        //Adicionando os elementos
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);
        carros.add(c6);
        carros.add(c7);

        System.out.println(carros);

        //Ordenando elementos
        Collections.sort(carros);
        System.out.println(carros);

        //Ordenando os carros por ano
        carros.sort(Comparator.comparing(Carros::getAno));
        System.out.println(carros);
    }

}
