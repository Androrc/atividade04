abstract class MeioDePagamento {
    protected double valor;

    public MeioDePagamento(double valor) {
        this.valor = valor;
    }

    public abstract void pagar();
}

// abstract class: define uma classe que não pode ser instanciada diretamente.
// método abstrato: pagar() não possui corpo e deve ser implementado pelas subclasses.

public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("Teste");
    }
}