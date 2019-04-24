package pbl.pkg3;

import javax.swing.JOptionPane;

public class PBL3 {
    public static void main(String[] args) {
        Paragrafo paragrafo = new Paragrafo();
        Link link = new Link();
        Lista lista = new Lista();
        //--------------------Dispositivos e pré configurações---------------
        Dispositivo desktop = new Desktop();
        Dispositivo notebook = new Notebook();
        Dispositivo tablet = new Tablet();
        Dispositivo celular = new Celular();
        Object[] dispositivos = {
            "Desktop", "Notebook", "Tablet", "Celular", "Sair"
        };
        //----------------------Pré configurações Conteúdos------------------
        String resposta;
        do{
            paragrafo.setCor("Verde");
            paragrafo.setTamanho(30);//tamanho original
            link.setCor("Vermelho");
            link.setTamanho(10);
            lista.setCor("Azul");
            lista.setTamanho(40);
            //----------------------Detalhes da execução----------------------
            resposta = (String) JOptionPane.showInputDialog(null, "", "Dispositivos", 1, null, dispositivos, "Desktop");
            switch (resposta) {
                case "Desktop":
                    paragrafo.responsividade(desktop);
                    link.responsividade(desktop);
                    lista.responsividade(desktop);
                    break;
                case "Notebook":
                    paragrafo.responsividade(notebook);
                    link.responsividade(notebook);
                    lista.responsividade(notebook);
                    break;
                case "Tablet":
                    break;
                case "Celular":
                    paragrafo.responsividade(celular);
                    link.responsividade(celular);
                    lista.responsividade(celular);
                    break;
            }
            if(!resposta.equalsIgnoreCase("Sair")){
                JOptionPane.showMessageDialog(null, "Valores Pré-definidos(Tamanho)\nParágrafos: 30"
                + "\nLinks: 10\nListas: 40\n\n"+resposta+"\nParágrafos\nTamanho: "
                +paragrafo.getTamanho()+ "\nCor: " +paragrafo.getCor()+
                "\n\nLinks\nTamanho: " +link.getTamanho()+ "\nCor: " +link.getCor()
                + "\n\nListas\nTamanho: " +lista.getTamanho()+ "\nCor: " + lista.getCor(), resposta, 1);
            }
        }while(!resposta.equalsIgnoreCase("Sair"));
    }
}