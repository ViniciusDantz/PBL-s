package exercicios;
import java.util.ArrayList;
public class Edificio {
    private String cor;
    ArrayList<Andar> andar = new ArrayList<>();
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
    public Edificio(){
        this.andar = new ArrayList<>();
    }
    public void cadastraAndar(Andar andar){
        this.andar.add(andar);
    }
    public int quantPortasAndares(){
        int x = 0;
        for (int i = 0; i < this.andar.size(); i++) {
            x = this.andar.get(i).quantPortas() + x;
        }
        return x;
    }
    public int quantPortasAbertasAndares(){
        int x = 0;
        for (int i = 0; i < this.andar.size(); i++) {
            for (int j = 0; j < this.andar.get(i).porta.size(); j++) {
                if(this.andar.get(i).porta.get(j).getEstado()){
                    x++;
                }
            }
        }
        return x;
    }
}