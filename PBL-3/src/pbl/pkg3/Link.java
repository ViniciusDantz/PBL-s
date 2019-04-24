package pbl.pkg3;
public class Link extends HTML{
    @Override
    public void responsividade(Dispositivo dispo) {
        if(dispo instanceof Notebook){
            this.setTamanho(tamanho * 2);
        }else if(dispo instanceof Celular){
            this.setTamanho(tamanho * 0.7);
        }else if(dispo instanceof Desktop){
            this.setTamanho(tamanho * 2.2);
        }
    }
}