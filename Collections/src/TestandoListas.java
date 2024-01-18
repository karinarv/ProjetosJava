import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String [] args){

        //inserindo valores
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com cursos e Sets";
        String aula4 = "Aumentando o conhecimentos";
        //Trabalhando com coleções Array List e adicionando elementos
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        //Imprimindo ArrayList
        System.out.println(aulas);

        //Removendo elementos
        aulas.remove(0);

        //Imprimindo ArrayList
        System.out.println(aulas);

        //Tratando valores dentro do array usando ForEach
        for (String aula : aulas) {

            System.out.println("Aula: " + aula);
        }

        //Utilizando o GET para obter a primeira aula
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        //Utilizando o GET para obter a segunda aula
        String segundaAula = aulas.get(1);
        System.out.println("A segunda aula é: " + segundaAula);

        //Percorre a lista através do indice
        for (int i = 0; i < aulas.size(); i ++) {
            System.out.println("Aula: " + aulas.get(i));
        }

        //Percorre a lista com for each[metodo]
        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " );
            System.out.println("Aula: " + aula);
        });

        //Ordenar aulas por sequência
        Collections.sort(aulas);
        System.out.println("Depois de ordenado: " + "\n" + aulas);
    }
}
