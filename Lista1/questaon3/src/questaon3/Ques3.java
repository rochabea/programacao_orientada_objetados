package questaon3;
import java.util.ArrayList;
import java.util.Scanner;

public class Ques3 {
    
	public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>(); //Lista que recebe classe Pedidos
        double total = 0.0; // Total gasto pelas mesas 

        Scanner scanner = new Scanner(System.in);

        //While que vai perguntar ao usuário se ele deseja add outra mesa
        while (true) {
            total = adicionarPedidos(scanner, pedidos, total);
            
            System.out.print("Deseja adicionar outra mesa? (S/N): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }
        
        // Função que printa os pedidos diretamente da classe Pedidos
        System.out.println("\nPedidos:");
        for (Pedido pedido : pedidos) 
        {
            System.out.printf("Mesa %d: %dx %s - R$%.2f%n",
                pedido.getMesa(), pedido.getQuantidade(), pedido.getProduto(), pedido.getTotalPedido());
        }

        System.out.printf("\nValor total: R$%.2f%n", total);
    }

    // Método que recebe todos os valores de pedidos bem como o nome, quantidade e o valor
    public static double adicionarPedidos(Scanner scanner, ArrayList<Pedido> pedidos, double total) {
        System.out.print("Número da mesa: ");
        int numeroMesa = scanner.nextInt();

        for (int j = 0; j < 3; j++) {
            System.out.println("Pedido " + (j + 1) + ":");
            scanner.nextLine();  // Consumir a quebra de linha deixada pelo nextInt()
            System.out.print("Nome da bebida ou refeição: ");
            String produto = scanner.nextLine();
            System.out.print("Valor do produto: ");
            double valor = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            double totalPedido = valor * quantidade;

            pedidos.add(new Pedido(numeroMesa, produto, valor, quantidade, totalPedido));

            total += totalPedido; //Add tudo a variavel total
        }

        return total; // Toda vez que o método rodar ele vai somar na variavel total
    }
}


// Classe Pedido que vai retornar os valores de cada variavel e utilizada par ser herdada no método main atraves de GETTERs
class Pedido {
    private int mesa;
    private String produto;
    private double valor;
    private int quantidade;
    private double totalPedido;

    public Pedido(int mesa, String produto, double valor, int quantidade, double totalPedido) {
        this.mesa = mesa;
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
        this.totalPedido = totalPedido;
    }

    public int getMesa() {
        return mesa;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotalPedido() {
        return totalPedido;
    }
}
