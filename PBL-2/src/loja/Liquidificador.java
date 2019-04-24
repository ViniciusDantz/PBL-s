package loja;
public class Liquidificador extends Eletrodomestico implements Helicoidal{
    private Tampa tampa;
    public Tampa getTampa() {
        return tampa;
    }
    public void setTampa(Tampa tampa) {
        this.tampa = tampa;
    }
    private double quantMLitroS;
    public double getQuantMLitroS() {
        return quantMLitroS;
    }
    public Liquidificador(){
        tampa = new Tampa();
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getVoltagem() {
        return voltagem;
    }
    public boolean setVoltagem(String voltagem) {
        if(voltagem.equalsIgnoreCase("110") || voltagem.equalsIgnoreCase("220")){
            this.voltagem = voltagem;
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void calcdesconto(String mes) {
        if(mes.equalsIgnoreCase("Agosto")){
            this.preco = this.preco - (this.preco*0.1);
        }//10% de desconto atribuido ao preço do prod. se for agosto
    }
    @Override
    public void calcQuantLitroS(double volume, double capacidade) {
        this.quantMLitroS = volume / capacidade;
    }
}