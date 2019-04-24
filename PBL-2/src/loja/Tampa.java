package loja;
public class Tampa {
    private String cor;
    private String descricao;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        if(cor.equalsIgnoreCase("Preto") || cor.equalsIgnoreCase("Branco")|| cor.equalsIgnoreCase("Amarelo") || cor.equalsIgnoreCase("Vermelho")
        || cor.equalsIgnoreCase("Laranja") || cor.equalsIgnoreCase("Verde") || cor.equalsIgnoreCase("Azul") || cor.equalsIgnoreCase("Violeta")
        || cor.equalsIgnoreCase("Cinza") || cor.equalsIgnoreCase("Dourado") || cor.equalsIgnoreCase("Bege") || cor.equalsIgnoreCase("Roxo")
        || cor.equalsIgnoreCase("Rosa") || cor.equalsIgnoreCase("Prata") || cor.equalsIgnoreCase("Marrom") || cor.equals("null")){
            this.cor = cor;
        }else{
            this.cor = "Cor definida pelo usuário não reconhecida!";
        }
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}