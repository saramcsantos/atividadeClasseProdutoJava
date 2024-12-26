import br.com.alura.produto.model.Product;

public class Main {
    public static void main(String[] args) {
        Product produto = new Product();
        produto.setNomeDoProduto("Livro Código Limpo");
        produto.setPrecoDoProduto(72.67);

        System.out.println(String.format("Produto: %s Preço orginal: R$ % .2f Preço com desconto: R$ % .2f",
                produto.getNomeDoProduto(), produto.getPrecoDoProduto(), produto.aplicaDesconto(0.10)));
    }
}
