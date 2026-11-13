package padroescomportamentais.visitor;

public class Passaro implements Animal {

    private int anilha;
    private String nome;
    private float peso;

    public Passaro(int anilha, String nome, float peso) {
        this.anilha = anilha;
        this.nome = nome;
        this.peso = peso;
    }

    public int getAnilha() {
        return anilha;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPassaro(this);
    }

}
