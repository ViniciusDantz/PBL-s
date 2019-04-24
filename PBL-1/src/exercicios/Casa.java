package exercicios;

import java.util.ArrayList;

public class Casa{
    private String cor;
    ArrayList<Porta> porta = new ArrayList<>();
    public String getCor(){
        return this.cor;
    }
    public void Pinta(String cor){
        if(cor.equalsIgnoreCase("Preto") || cor.equalsIgnoreCase("Branco")|| cor.equalsIgnoreCase("Amarelo") || cor.equalsIgnoreCase("Vermelho")
        || cor.equalsIgnoreCase("Laranja") || cor.equalsIgnoreCase("Verde") || cor.equalsIgnoreCase("Azul") || cor.equalsIgnoreCase("Violeta")
        || cor.equalsIgnoreCase("Cinza") || cor.equalsIgnoreCase("Dourado") || cor.equalsIgnoreCase("Bege") || cor.equalsIgnoreCase("Roxo")
        || cor.equalsIgnoreCase("Rosa") || cor.equalsIgnoreCase("Prata") || cor.equalsIgnoreCase("Marrom") || cor.equals("null")){
            this.cor = cor;
        }else{
            this.cor = "Cor definida pelo usuário não reconhecida!";
        }
    }
    public Casa(){
        this.porta = new ArrayList<>();
    }
    public void cadastraPortas(Porta porta){
        this.porta.add(porta);
    }
    public int quantPortas(){
        return this.porta.size();
    }
    public int portasAbertas(){
        int quantAb = 0;//Quant portas abertas
        for (int i = 0; i < this.porta.size(); i++) {
            if(this.porta.get(i).getEstado()){
                quantAb++;
            }
        }
        return quantAb;
    }
}