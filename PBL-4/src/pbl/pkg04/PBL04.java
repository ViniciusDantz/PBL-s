package pbl.pkg04;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class PBL04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        Produto pao = new Paozinho();
        Produto doce = new Docinho();
        Produto frios = new Frios();
        Object[] diaSemana = {
            "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
        };
        //----------------Pré-cadastro itens--------------------
        String dia;
        dia = (String) JOptionPane.showInputDialog(null, "", "Dia da semana", 1, null, diaSemana, "Domingo");
        pao.setEspecificacao("Pãozinho da melhor qualidade");
        pao.setPreco(0.2);
        pao.setTempoEntrega(pao, dia);
        pao.setValidade(9);
        
        doce.setEspecificacao("Docinho da melhor qualidade");
        doce.setPreco(1);
        doce.setTempoEntrega(doce, dia);
        doce.setValidade(12);
        
        frios.setEspecificacao("Frios da melhor qualidade");
        frios.setPreco(5);
        frios.setTempoEntrega(frios, dia);
        frios.setValidade(8);
        //--------------------------Pedido-----------------------------------
        Pedido pedido = new Pedido();
        Object[] tipoProdutos = {
            "Pãozinho", "Docinho", "Frios", "Sair"
        };
        Object[] tipoDoce = {
            "Fino", "Festa", "Gourmet", "Ornamental",
        };
        String resposta = "", respostaDoce = "", respostaPao = "";
        JOptionPane.showMessageDialog(null, "Produtos\n\nPãozinho:\nEspecificação: " +pao.getEspecificacao()+
        ".\nPreço: R$" +pao.getPreco()+ "\nValidade: " +pao.getValidade()+ " dias.\n\nDocinho:\nEspecificação: " +doce.getEspecificacao()+
        ".\nPreço: R$" +doce.getPreco()+ "\nValidade: " +doce.getValidade()+ " dias.\nTipos: finos, de festa, gourmet, ornamental."
        + "\n\nFrios:\nEspecificação: " +frios.getEspecificacao()+ ".\nPreço: R$" +frios.getPreco()+ "\nValidade: " +frios.getValidade()+ " dias.");
        do{
            resposta = (String) JOptionPane.showInputDialog(null, "", "Produto", 0, null, tipoProdutos, "Pãozinho");
            switch(resposta){
                case "Pãozinho":
                    pedido.setProduto(pao);
                    respostaPao = JOptionPane.showInputDialog("Sabor do pãozinho:");
                    break;
                case "Docinho":
                    pedido.setProduto(doce);
                    respostaDoce = (String) JOptionPane.showInputDialog(null, "", "Doces", 0, null, tipoDoce, "Fino");
                    break;
                case "Frios":
                    pedido.setProduto(frios);
                    break;
                case "Sair":
                    break;
                default:
                    break;
            }
        }while(!resposta.equals("Sair"));
        pedido.quantidade(pedido.getProdutos());
        JOptionPane.showMessageDialog(null, "Recibo do pedido\n\nPães: " +pedido.getQuantP()+
        "\nDoce: " +pedido.getQuantD()+ "\nFrios: " +pedido.getQuantF()+ "\nTempo total de entrega: " +
        df.format(pedido.tempoTotalEntrega(pedido.getProdutos()))+ " min\nTotal: R$" +df.format(pedido.totalCompra(pedido.getProdutos())));
    }
}