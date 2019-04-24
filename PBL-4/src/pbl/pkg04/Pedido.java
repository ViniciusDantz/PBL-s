package pbl.pkg04;
import java.util.ArrayList;
public class Pedido {
    private ArrayList<Produto> produtos;
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProduto(Produto produto) {
        this.produtos.add(produto);
    }
    private int quantP;//quantidade total de Pães
    private int quantD;//quantidade total de Doce
    private int quantF;//quantidade total de Frios
    public Pedido() {
        this.produtos = new ArrayList<>();
    }
    public double tempoTotalEntrega(ArrayList<Produto> produtos){
        double total = 0;//tempo total de entrega
        for (int i = 0; i < produtos.size(); i++) {
            total = total + produtos.get(i).getTempoEntrega();
        }
        return total;
    }
    public void quantidade(ArrayList<Produto> produtos){
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i) instanceof Frios){
                quantF++;
            }else if(produtos.get(i) instanceof Docinho){
                quantD++;
            }else if(produtos.get(i) instanceof Paozinho){
                quantP++;
            }
        }
    }
    public double totalCompra(ArrayList<Produto> produtos){
        double precoTotal = 0;
        for (int i = 0; i < produtos.size(); i++) {
            precoTotal = precoTotal + produtos.get(i).getPreco();
        }
        return precoTotal;
    }
    public int getQuantP() {
        return quantP;
    }
    public int getQuantD() {
        return quantD;
    }
    public int getQuantF() {
        return quantF;
    }
}