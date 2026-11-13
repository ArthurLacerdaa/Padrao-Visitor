package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalVisitorTest {

    @Test
    void deveExibirCachorro() {
        Cachorro cachorro = new Cachorro(1, "Rex", new Raca("Labrador"));

        AnimalVisitor visitor = new AnimalVisitor();
        assertEquals("Cachorro{codigo=1, nome='Rex', raca=Labrador}", visitor.exibir(cachorro));
    }

    @Test
    void deveExibirGato() {
        Gato gato = new Gato(1, "Mimi", "Tigrada");

        AnimalVisitor visitor = new AnimalVisitor();
        assertEquals("Gato{codigo=1, nome='Mimi', pelagem='Tigrada'}", visitor.exibir(gato));
    }

    @Test
    void deveExibirPassaro() {
        Passaro passaro = new Passaro(1, "Piu", 0.5f);

        AnimalVisitor visitor = new AnimalVisitor();
        assertEquals("Passaro{anilha=1, nome='Piu', peso=0.5}", visitor.exibir(passaro));
    }

}