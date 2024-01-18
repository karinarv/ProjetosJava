import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {

        //antes do java 8
        List<String> palavras = new ArrayList<>();
        palavras.add("Treina Web online");
        palavras.add("Udemy online");
        palavras.add("Aula online");
        palavras.add("Alura online");
        palavras.add("caelum");
        Comparator<String> comparador = new ComparadorPorTamanho();
        Collections.sort(palavras, comparador);
        System.out.println(palavras);

        //Java 8
        palavras.sort(comparador);
        System.out.println(palavras);

    }
}
class ComparadorPorTamanho implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}

