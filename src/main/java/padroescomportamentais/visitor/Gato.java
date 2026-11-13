package padroescomportamentais.visitor;

public class Gato implements Animal {

    private int codigo;
    private String nome;
    private String pelagem;

    public Gato(int codigo, String nome, String pelagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.pelagem = pelagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getPelagem() {
        return pelagem;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirGato(this);
    }

}
