package pbl.pkg04;
public abstract class Produto {
    protected double preco;
    protected int validade;
    protected String especificacao;
    protected double tempoEntrega;
    protected double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getValidade() {
        return validade;
    }
    public void setValidade(int validade) {
        this.validade = validade;
    }
    public String getEspecificacao() {
        return especificacao;
    }
    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
    public double getTempoEntrega() {
        return tempoEntrega;
    }
    public void setTempoEntrega(Produto produto, String dia){
        if((produto instanceof Frios) && (dia.equals("Domingo"))){
            this.tempoEntrega = 6 * 1.1;
        }else if((produto instanceof Paozinho) && ((dia.equals("Sábado")) || (dia.equals("Domingo")))){
            this.tempoEntrega = 2 * 1.15;
        }else if((produto instanceof Docinho) && ((dia.equals("Sábado")) || (dia.equals("Domingo")))){
            this.tempoEntrega = 5 * 1.2;
        }else if(produto instanceof Frios){
            this.tempoEntrega = 6;
        }else if(produto instanceof Paozinho){
            this.tempoEntrega = 2;
        }else if(produto instanceof Docinho){
            this.tempoEntrega = 5;
        }
    }
}