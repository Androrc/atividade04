abstract class MeioDePagamento {
    protected double valor;

    public MeioDePagamento(double valor) {
        this.valor = valor;
    }

    public abstract void pagar();
}

class Pix extends MeioDePagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}

// abstract class: MeioDePagamento é uma classe abstrata e não pode ser instanciada.
// método abstrato: pagar() é declarado sem implementação na classe abstrata.
// subclasse concreta: Pix implementa o método pagar().
// construtor com super(valor): Pix chama o construtor da classe MeioDePagamento.

public class Exemplo02 {
    public static void main(String[] args) {
        MeioDePagamento pagamento = new Pix(100.00);
        pagamento.pagar();
    }
}