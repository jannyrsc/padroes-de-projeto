package Decorator;

public class Acucar extends CoquetelDecorator {

    public Acucar(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Açucar";
        preco = 1.0;
    }
}
