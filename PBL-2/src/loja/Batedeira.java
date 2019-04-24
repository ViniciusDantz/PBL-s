package loja;
public class Batedeira extends Eletrodomestico implements Helicoidal{
    private int quantHelic;
    private double quantMLitroS;
    public double getQuantMLitroS() {
        return quantMLitroS;
    }
    public int getQuantHelic() {
        return quantHelic;
    }
    public void setQuantHelic(int quantHelic) {
        this.quantHelic = quantHelic;
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
        if(mes.equalsIgnoreCase("Dezembro")){
            this.preco = this.preco - (this.preco*0.2);
        }//20% de desconto atribuido ao preço do prod. se for dezembro
    }
    @Override
    public void calcQuantLitroS(double volume, double capacidade) {
        if(this.quantHelic > 1){
            this.quantMLitroS = (volume / (capacidade * quantHelic));
        }else{
            this.quantMLitroS = (volume / capacidade);
        }
    }//mult. quant de helic. pela capac. se tiver mais de um helice
}