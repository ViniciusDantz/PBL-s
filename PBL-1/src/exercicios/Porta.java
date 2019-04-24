package exercicios;
public class Porta {
    private boolean estado;
    private String cor, location;
    private double dx, dy, dz; //Dimensão x, y, z
    public double getDx() {
        return this.dx;
    }
    public void setDx(double dx) {
        this.dx = dx;
    }
    public double getDy() {
        return this.dy;
    }
    public void setDy(double dy) {
        this.dy = dy;
    }
    public double getDz() {
        return this.dz;
    }
    public void setDz(double dz) {
        this.dz = dz;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        if(estado.equals("abrir") || estado.equals("Abrir")){
            this.estado = true;
        }
        if(estado.equals("Fechar") || estado.equals("fechar")){
            this.estado = false;
        }
    }
    public String getCor(){
        return this.cor;
    }
    public void Pinta(String cor){
        if(cor.equalsIgnoreCase("Preto") || cor.equalsIgnoreCase("Branco")|| cor.equalsIgnoreCase("Amarelo") || cor.equalsIgnoreCase("Vermelho")
        || cor.equalsIgnoreCase("Laranja") || cor.equalsIgnoreCase("Verde") || cor.equalsIgnoreCase("Azul") || cor.equalsIgnoreCase("Violeta")
        || cor.equalsIgnoreCase("Cinza") || cor.equalsIgnoreCase("Dourado") || cor.equalsIgnoreCase("Bege") || cor.equalsIgnoreCase("Roxo")
        || cor.equalsIgnoreCase("Rosa") || cor.equalsIgnoreCase("Prata") || cor.equalsIgnoreCase("Marrom") || cor.equals("Sem cor")){
            this.cor = cor;
        }else{
            this.cor = "Cor definida pelo usuário não reconhecida!";
        }
    }
    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}