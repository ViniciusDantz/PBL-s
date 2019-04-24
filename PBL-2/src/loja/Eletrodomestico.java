package loja;
public abstract class Eletrodomestico {
    protected String marca;
    protected double preco;
    protected String voltagem;
    public abstract void calcdesconto(String mes);
}