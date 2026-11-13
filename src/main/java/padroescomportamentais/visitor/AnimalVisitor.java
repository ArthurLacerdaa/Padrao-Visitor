package padroescomportamentais.visitor;

public class AnimalVisitor implements Visitor {

    public String exibir(Animal animal) {
        return animal.aceitar(this);
    }

    @Override
    public String exibirCachorro(Cachorro cachorro) {
        return "Cachorro{" +
                "codigo=" + cachorro.getCodigo() +
                ", nome='" + cachorro.getNome() + '\'' +
                ", raca=" + cachorro.getNomeRaca() +
                '}';
    }

    @Override
    public String exibirGato(Gato gato) {
        return "Gato{" +
                "codigo=" + gato.getCodigo() +
                ", nome='" + gato.getNome() + '\'' +
                ", pelagem='" + gato.getPelagem() + '\'' +
                '}';
    }

    @Override
    public String exibirPassaro(Passaro passaro) {
        return "Passaro{" +
                "anilha=" + passaro.getAnilha() +
                ", nome='" + passaro.getNome() + '\'' +
                ", peso=" + passaro.getPeso() +
                '}';
    }
}
