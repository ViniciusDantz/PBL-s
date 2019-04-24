package loja;
public class Ferro extends Eletrodomestico{
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
        if(voltagem.equalsIgnoreCase("110") || voltagem.equalsIgnoreCase("220")
        || voltagem.equalsIgnoreCase("5")){
            this.voltagem = voltagem;
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void calcdesconto(String mes) {
        if(mes.equalsIgnoreCase("Maio")){
            this.preco = this.preco - (this.preco*0.15);
        }//15% de desconto atribuido ao preço do prod. se for maio
    }   
}