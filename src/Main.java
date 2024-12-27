import br.com.alura.produto.model.Product;
import br.com.alura.produto.model.Servico;

public class Main {
    public static void main(String[] args) {
        Product produto = new Product();
        produto.setNome("Caderno");
        produto.setPrecoProduto(10);

        double precoFinalProduto = produto.getPrecoTotalCompra(3);

        System.out.println("Preço total da compra: R$ " + produto.getAplicaDesconto(25, precoFinalProduto));

        Servico servico = new Servico();
        servico.setPrecoPorHora(34);

        double precoFinalServio = servico.getPrecoTotalCompra(4);

        System.out.println("Preço total do serviço: R$ " + servico.getAplicaDesconto(25, precoFinalServio));
    }
}
