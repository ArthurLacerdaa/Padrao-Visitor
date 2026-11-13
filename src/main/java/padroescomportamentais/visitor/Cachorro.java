package padroescomportamentais.visitor;

public class Cachorro implements Animal {

    private int codigo;
    private String nome;
    private Raca raca;

    public Cachorro(int codigo, String nome, Raca raca) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeRaca() {
        return this.raca.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCachorro(this);
    }

}
