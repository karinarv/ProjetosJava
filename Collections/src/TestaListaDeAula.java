import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {

        //Criando elementos da classe aula
        Aula a1 = new Aula("Revisando ArrayList", 21);
        Aula a2 = new Aula("Listas de objeto", 13);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        //Criando o ArrayList de aulas do tipo Aula
        ArrayList<Aula> aulas = new ArrayList<>();

        //Adicionando elementos
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        //Imprimindo
        System.out.println(aulas);

        //Ordenando listas
        Collections.sort(aulas);

        //Imprimindo
        System.out.println(aulas);

        //Comparando de acordo com o tempo
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        //Forma resumida de escrever o código acima
        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
