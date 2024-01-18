public class Carros implements Comparable<Carros>{

    //Atributos
    private String nome;
    private int ano;

    //Construtor
    public Carros(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    //Metodo Get
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "\nCarros{" +
                "nome='" + this.nome + '\'' +
                ", ano=" + this.ano +
                '}';
    }

    //Metodo Comparable
    @Override
    public int compareTo(Carros outroCarros) {
        return this.nome.compareTo(outroCarros.nome);
    }
}
