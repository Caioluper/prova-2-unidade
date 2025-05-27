
public class Filme {
    private String nome;
    private String genero;
    private double nota;

    public Filme(String nome, String genero, double nota) {
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Filme: " + nome + " | Gênero: " + genero + " | Nota: " + nota;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Filme) {
            Filme outro = (Filme) obj;
            return this.nome.equalsIgnoreCase(outro.nome);
        }
        return false;
    }
}
