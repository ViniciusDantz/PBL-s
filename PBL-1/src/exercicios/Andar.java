package exercicios;

import java.util.ArrayList;

public class Andar {
    private String nome;
    ArrayList<Porta> porta = new ArrayList<>();
    public Andar(){
        this.porta = new ArrayList<>();
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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