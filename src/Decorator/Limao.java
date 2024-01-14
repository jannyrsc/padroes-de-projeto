package Decorator;

public class Limao extends CoquetelDecorator {

    public Limao(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Limão";
        preco = 1.0;
    }
}
