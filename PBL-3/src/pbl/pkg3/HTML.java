package pbl.pkg3;
public abstract class HTML {
    protected String cor;
    protected double tamanho;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public abstract void responsividade(Dispositivo dispo);
}
