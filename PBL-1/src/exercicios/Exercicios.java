package exercicios;
import javax.swing.JOptionPane;
public class Exercicios {
    public static void main(String[] args) {
        Object[] opcoes = {
            "Fechar", "Ver/Mudar local" , "Ver/Mudar dimensões", "Ver/Mudar cor", "Adicionar nova porta", "Sair"
        };
        Object[] opcoes2 = {
            "Abrir", "Ver/Mudar local", "Ver/Mudar dimensões", "Ver/Mudar cor", "Adicionar nova porta", "Sair"
        };
        Object[] opcoes3 = {
            "Altura", "Largura", "Profundidade", "Voltar"
        };
        Object[] opcoes4 = {
            "Casa", "Edifício"
        };
        String x;//variável que recebe a resposta para configurar a porta
        Porta porta;
        Andar andar;
        String[] option = new String[5];
        //-----------------------Casa ou edifício?------------------------------
        option[4] = (String) JOptionPane.showInputDialog(null, "Escolha uma das opções:", 
        "Casa ou Edifício?", JOptionPane.PLAIN_MESSAGE, null, opcoes4, null);
        //--------------------------Edifício------------------------------------
        if(option[4].equals("Edifício")){
            Edificio edificio = new Edificio();
            do{
                edificio.Pinta(JOptionPane.showInputDialog(null, "Qual cor gostaria de pintar seu edifício?", "Pintar Edifício", JOptionPane.PLAIN_MESSAGE));
                if(edificio.getCor().equals("Cor definida pelo usuário não reconhecida!")){
                    JOptionPane.showConfirmDialog(null, "Cor não reconhecida!");
                }
            }while(edificio.getCor().equals("Cor definida pelo usuário não reconhecida!"));
            JOptionPane.showConfirmDialog(null, "Edifício pintado de " +edificio.getCor()+ " com sucesso!");
            String y;//variável que recebe a resposta (Sim/Não) para adicionar porta ou adicionar andar
            y = JOptionPane.showInputDialog("Gostaria de adicionar um andar?");
            int i;
            do{
                andar = new Andar();
                i = 1;
                if(y.equalsIgnoreCase("Sim")){
                    andar.setNome(JOptionPane.showInputDialog("Insira o nome do andar:"));
                    y = JOptionPane.showInputDialog("Gostaria de adicionar uma porta neste andar? "+"(" +andar.getNome()+ ")");
                    if(y.equalsIgnoreCase("Sim")){
                        porta = new Porta();
                        porta.setDx(1);
                        porta.setDy(0.03);
                        porta.setDz(2.1);
                        porta.setLocation("Não definido!");
                        porta.Pinta("Sem cor");
                        do{
                            if(porta.getEstado()){
                                x = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", 
                                "Porta " +i+ " - " +andar.getNome(), JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
                            }else{
                                x = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", 
                                "Porta " +i+ " - " +andar.getNome(), JOptionPane.PLAIN_MESSAGE, null, opcoes2, null);
                            }
                            if(x.equals("Abrir")){
                                porta.setEstado("Abrir");
                                JOptionPane.showConfirmDialog(null, "Porta aberta!");
                            }
                            if(x.equals("Fechar")){
                                porta.setEstado("Fechar");
                                JOptionPane.showConfirmDialog(null, "Porta fechada!");
                            }
                            if(x.equals("Ver/Mudar dimensões")){
                                option[0] = JOptionPane.showInputDialog(null, "Dimensões:\nAltura (Z): "
                                +porta.getDz()+ "\nLargura (X): " +porta.getDx()+ "\nProfundidade (Y): " +porta.getDy()+ 
                                "\n\nDimensionar porta? (Sim/Não)", x, JOptionPane.PLAIN_MESSAGE);
                                if(option[0].equals("sim") || option[0].equals("Sim")){
                                    do{
                                        option[1] = (String) JOptionPane.showInputDialog(null, "Dimensões:\nAltura (Z): "
                                +porta.getDz()+ "\nLargura (X): " +porta.getDx()+ "\nProfundidade (Y): " +porta.getDy()+ "\n\nQual eixo gostaria de dimensionar?", 
                                        "Dimensionar porta", JOptionPane.PLAIN_MESSAGE, null, opcoes3, null);
                                        if(option[1].equals("Altura")){
                                            porta.setDz(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura da porta:")));
                                        }
                                        if(option[1].equals("Largura")){
                                            porta.setDx(Double.parseDouble(JOptionPane.showInputDialog("Insira a largura da porta:")));
                                        }
                                        if(option[1].equals("Profundidade")){
                                            porta.setDy(Double.parseDouble(JOptionPane.showInputDialog("Insira a profundidade da porta:")));
                                        }
                                    }while(!option[1].equals("Voltar"));
                                }
                            }
                            if(x.equals("Ver/Mudar cor")){
                                option[2] = JOptionPane.showInputDialog(null, "Cor: " +porta.getCor()+ "\n\nPintar porta? (Sim/Não)", x, JOptionPane.PLAIN_MESSAGE);
                                if(option[2].equals("sim") || option[2].equals("Sim")){
                                   do{
                                       porta.Pinta(JOptionPane.showInputDialog(null, "Qual cor gostaria de pintar a porta?", "Pintar porta", JOptionPane.PLAIN_MESSAGE));
                                       if(porta.getCor().equals("Cor definida pelo usuário não reconhecida!")){
                                           JOptionPane.showConfirmDialog(null, "Cor não reconhecida!");
                                       }else{
                                           JOptionPane.showConfirmDialog(null, "Porta pintada de " +porta.getCor()+ " com sucesso!");
                                       }
                                   }while(porta.getCor().equals("Cor definida pelo usuário não reconhecida!"));
                                }
                            }
                            if(x.equals("Ver/Mudar local")){
                                option[3] = JOptionPane.showInputDialog(null, "Local: " +porta.getLocation()+ 
                                "\n\nMudar local? (Sim/Não)", "Ver/Mudar local da porta", JOptionPane.PLAIN_MESSAGE);
                                if(option[3].equalsIgnoreCase("Sim")){
                                    porta.setLocation(JOptionPane.showInputDialog(null, "Onde gostaria "
                                    + "de instalar a porta?", "Instalar/Mudar local da porta", JOptionPane.PLAIN_MESSAGE));
                                    JOptionPane.showConfirmDialog(null, "Porta instalada no(a) " +porta.getLocation()+ " com sucesso!");
                                }
                            }
                            if(x.equals("Adicionar nova porta")){
                                andar.cadastraPortas(porta);
                                JOptionPane.showConfirmDialog(null, "Porta salva com sucesso!");
                                porta = new Porta();
                                porta.setDx(1);
                                porta.setDy(0.03);
                                porta.setDz(2.1);
                                porta.setLocation("Não definido!");
                                porta.Pinta("Sem cor");
                                i++;
                            }
                        }while(!x.equals("Sair"));
                        andar.cadastraPortas(porta);
                        JOptionPane.showConfirmDialog(null, "Porta salva com sucesso!");
                    }
                    y = JOptionPane.showInputDialog("Gostaria de adicionar novo andar?");
                    if(y.equalsIgnoreCase("Sim")){
                        edificio.cadastraAndar(andar);
                    }
                }
            }while(y.equalsIgnoreCase("Sim"));
            edificio.cadastraAndar(andar);
            JOptionPane.showConfirmDialog(null, "Cor do edifício: " +edificio.getCor()+ "\nQuantidade de andares: " +edificio.andar.size()+
            "\nQuantidade de portas: " +edificio.quantPortasAndares()+ "\nQuantidade de portas abertas: " +edificio.quantPortasAbertasAndares());
            for (i = 0; i < edificio.andar.size(); i++) {
                for (int j = 0; j < edificio.andar.get(i).porta.size(); j++) {
                    JOptionPane.showConfirmDialog(null, "Porta " +(j+1)+ "\nAndar: " +edificio.andar.get(i).getNome()+ "\nLocal: " +edificio.andar.get(i).porta.get(j).getLocation()+
                    "\nCor: " +edificio.andar.get(i).porta.get(j).getCor()+ "\nDimensões\nAltura: " +edificio.andar.get(i).porta.get(j).getDz()+ 
                    "\nLargura: " +edificio.andar.get(i).porta.get(j).getDy()+ "\nProfundidade: " +edificio.andar.get(i).porta.get(j).getDx());
                }
            }
        }else{
           //---------------------------Casa------------------------------------
            Casa casa = new Casa();
            do{
                casa.Pinta(JOptionPane.showInputDialog(null, "Qual cor gostaria de pintar sua casa?", "Pintar Casa", JOptionPane.PLAIN_MESSAGE));
                if(casa.getCor().equals("Cor definida pelo usuário não reconhecida!")){
                    JOptionPane.showConfirmDialog(null, "Cor não reconhecida!");
                }
            }while(casa.getCor().equals("Cor definida pelo usuário não reconhecida!"));
            JOptionPane.showConfirmDialog(null, "Casa pintada de " +casa.getCor()+ " com sucesso!");
            String y;//variável que recebe a resposta (Sim/Não) para adicionar porta
            y = JOptionPane.showInputDialog("Gostaria de adicionar uma porta?");
            if(y.equalsIgnoreCase("Sim")){
                porta = new Porta();
                porta.setDx(1);
                porta.setDy(0.03);
                porta.setDz(2.1);
                porta.setLocation("Não definido!");
                porta.Pinta("Sem cor");
                int i = 1;
                do{
                    if(porta.getEstado()){
                        x = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", 
                        "Porta " +i, JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
                    }else{
                        x = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", 
                        "Porta " +i, JOptionPane.PLAIN_MESSAGE, null, opcoes2, null);
                    }
                    if(x.equals("Abrir")){
                        porta.setEstado("Abrir");
                        JOptionPane.showConfirmDialog(null, "Porta aberta!");
                    }
                    if(x.equals("Fechar")){
                        porta.setEstado("Fechar");
                        JOptionPane.showConfirmDialog(null, "Porta fechada!");
                    }
                    if(x.equals("Ver/Mudar dimensões")){
                        option[0] = JOptionPane.showInputDialog(null, "Dimensões:\nAltura (Z): "
                        +porta.getDz()+ "\nLargura (X): " +porta.getDx()+ "\nProfundidade (Y): " +porta.getDy()+ 
                        "\n\nDimensionar porta? (Sim/Não)", x, JOptionPane.PLAIN_MESSAGE);
                        if(option[0].equals("sim") || option[0].equals("Sim")){
                            do{
                                option[1] = (String) JOptionPane.showInputDialog(null, "Dimensões:\nAltura (Z): "
                        +porta.getDz()+ "\nLargura (X): " +porta.getDx()+ "\nProfundidade (Y): " +porta.getDy()+ "\n\nQual eixo gostaria de dimensionar?", 
                                "Dimensionar porta", JOptionPane.PLAIN_MESSAGE, null, opcoes3, null);
                                if(option[1].equals("Altura")){
                                    porta.setDz(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura da porta:")));
                                }
                                if(option[1].equals("Largura")){
                                    porta.setDx(Double.parseDouble(JOptionPane.showInputDialog("Insira a largura da porta:")));
                                }
                                if(option[1].equals("Profundidade")){
                                    porta.setDy(Double.parseDouble(JOptionPane.showInputDialog("Insira a profundidade da porta:")));
                                }
                            }while(!option[1].equals("Voltar"));
                        }
                    }
                    if(x.equals("Ver/Mudar cor")){
                        option[2] = JOptionPane.showInputDialog(null, "Cor: " +porta.getCor()+ "\n\nPintar porta? (Sim/Não)", x, JOptionPane.PLAIN_MESSAGE);
                        do{
                           if(option[2].equals("sim") || option[2].equals("Sim")){
                               porta.Pinta(JOptionPane.showInputDialog(null, "Qual cor gostaria de pintar a porta?", "Pintar porta", JOptionPane.PLAIN_MESSAGE));
                               if(porta.getCor().equals("Cor definida pelo usuário não reconhecida!")){
                                   JOptionPane.showConfirmDialog(null, "Cor não reconhecida!");
                               }else{
                                   JOptionPane.showConfirmDialog(null, "Porta pintada de " +porta.getCor()+ " com sucesso!");
                              }
                           }
                        }while(porta.getCor().equals("Cor definida pelo usuário não reconhecida!"));
                    }
                    if(x.equals("Ver/Mudar local")){
                        option[3] = JOptionPane.showInputDialog(null, "Local: " +porta.getLocation()+ 
                        "\n\nMudar local? (Sim/Não)", "Ver/Mudar local da porta", JOptionPane.PLAIN_MESSAGE);
                        if(option[3].equalsIgnoreCase("Sim")){
                            porta.setLocation(JOptionPane.showInputDialog(null, "Em qual cômodo gostaria "
                            + "de instalar a porta?", "Instalar/Mudar local da porta", JOptionPane.PLAIN_MESSAGE));
                            JOptionPane.showConfirmDialog(null, "Porta instalada no(a) " +porta.getLocation()+ " com sucesso!");
                        }
                    }
                    if(x.equals("Adicionar nova porta")){
                        casa.cadastraPortas(porta);
                        JOptionPane.showConfirmDialog(null, "Porta salva com sucesso!");
                        porta = new Porta();
                        porta.setDx(1);
                        porta.setDy(0.03);
                        porta.setDz(2.1);
                        porta.setLocation("Não definido!");
                        porta.Pinta("Sem cor");
                        i++;
                    }
                }while(!x.equals("Sair"));
                casa.cadastraPortas(porta);
                JOptionPane.showConfirmDialog(null, "Porta salva com sucesso!");
                for (i = 0; i < casa.porta.size(); i = i+2) {
                    casa.porta.get(i).setEstado("Abrir");
                }
                JOptionPane.showConfirmDialog(null, "Cor da casa: " +casa.getCor()+ "\nQuantidade de portas: " +casa.porta.size()+
                "\nQuantidade de portas abertas: " +casa.portasAbertas());
                for (i = 0; i < casa.porta.size(); i++) {
                    JOptionPane.showConfirmDialog(null, "Porta " +(i+1)+ "\nLocal: " +casa.porta.get(i).getLocation()+
                    "\nCor: " +casa.porta.get(i).getCor()+ "\nDimensões\nAltura: " +casa.porta.get(i).getDz()+ 
                    "\nLargura: " +casa.porta.get(i).getDy()+ "\nProfundidade: " +casa.porta.get(i).getDx());
                }
            }
        }
    }
}