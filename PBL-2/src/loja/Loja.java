package loja;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Loja {
    public static void main(String[] args) {
        Object[] option1 = {
            "Loja", "Fábrica", "Mudar mês", "Sair"
        };
        Object[] option2 = {
            "Liquidificador", "Ferro de passar", "Batedeira", "Voltar"
        };
        Liquidificador liqui = new Liquidificador();
        Ferro ferro = new Ferro();
        Batedeira bate = new Batedeira();
        String[] option = new String[2];
        Tampa tampa = new Tampa();
        DecimalFormat decimal = new DecimalFormat("0.00");
        boolean resposta;
        String mes;
        mes = JOptionPane.showInputDialog("Insira o mês:");
        do{
            option[0] = (String) JOptionPane.showInputDialog(null, "Loja ou Fábrica?", 
            null, JOptionPane.QUESTION_MESSAGE, null, option1, "Loja");
            //-------------------------------------------Loja-------------------------------------------
            if(option[0].equalsIgnoreCase("Loja")){
                do{
                    option[1] = (String) JOptionPane.showInputDialog(null, "Escolha o eletrodoméstico que gostaria de cadastrar:",
                    "Eletrodomésticos", JOptionPane.QUESTION_MESSAGE, null, option2, "Liquidificador");
                    //-----------------------------------Liquidificador-----------------------------------
                    if(option[1].equals("Liquidificador")){
                        liqui.setMarca(JOptionPane.showInputDialog("Informe a marca:"));
                        liqui.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Liquidificador\nMarca: "
                        +liqui.getMarca()+"\n\nInforme o preço:")));
                        do{
                            resposta = liqui.setVoltagem(JOptionPane.showInputDialog("Liquidificador\nMarca: " +liqui.getMarca()+
                            "\nPreço: " +decimal.format(liqui.getPreco())+ "\n\nInsira a voltagem:"));
                            if(!resposta){
                                JOptionPane.showConfirmDialog(null, "Voltagem Incompatível!", "ERRO", JOptionPane.WARNING_MESSAGE);
                            }
                        }while(resposta == false);
                        liqui.calcdesconto(mes);
                        liqui.calcQuantLitroS(Double.parseDouble(JOptionPane.showInputDialog("Liquidificador\nMarca: " +liqui.getMarca()+
                        "\nPreço: " +decimal.format(liqui.getPreco())+ "\nVoltagem: " +liqui.getVoltagem()+ " V\n\nInforme o volume:")),
                        Double.parseDouble(JOptionPane.showInputDialog("Liquidificador\nMarca: " +liqui.getMarca()+
                        "\nPreço: " +decimal.format(liqui.getPreco())+ "\nVoltagem: " +liqui.getVoltagem()+ " V\n\nInforme a capacidade:")));
                        //-----------------------------tampa---------------------------------------
                        tampa.setCor(JOptionPane.showInputDialog("Informe a cor da tampa:"));
                        tampa.setDescricao(JOptionPane.showInputDialog("Informe a descrição da tampa:"));
                        liqui.setTampa(tampa);
                        //----------------------------------Resultado---------------------------------------
                        JOptionPane.showConfirmDialog(null, "Liquidificador\nMarca: " +liqui.getMarca()+
                        "\nPreço: " +decimal.format(liqui.getPreco())+ "\nVoltagem: " +liqui.getVoltagem()+ " V\nQuantidade média de litros"
                        + " que podem ser batidos por segundo: " +decimal.format(liqui.getQuantMLitroS())+ "\n\nTampa\nCor: " +liqui.getTampa().getCor()+
                        "\nDescrição: " +liqui.getTampa().getDescricao(), "Eletrodoméstico", JOptionPane.YES_OPTION);
                    }else{
                        //-----------------------------------Ferro de passar-----------------------------------
                        if(option[1].equals("Ferro de passar")){
                            ferro.setMarca(JOptionPane.showInputDialog("Informe a marca:"));
                            ferro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Ferro de passar\nMarca: "
                            +ferro.getMarca()+ "\n\nInforme o preço:")));
                            do{
                                resposta = ferro.setVoltagem(JOptionPane.showInputDialog("Ferro de passar\nMarca: " +ferro.getMarca()+
                                "\nPreço: " +decimal.format(ferro.getPreco())+ "\n\nInsira a voltagem:"));
                                if(!resposta){
                                    JOptionPane.showConfirmDialog(null, "Voltagem Incompatível!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                }
                            }while(resposta == false);
                            ferro.calcdesconto(mes);
                            //----------------------------------Resultado---------------------------------------
                            JOptionPane.showConfirmDialog(null, "Ferro de passar\nMarca: " +ferro.getMarca()+   
                            "\nPreço: " +decimal.format(ferro.getPreco())+ "\nVoltagem: " +ferro.getVoltagem()+ " V", "Eletrodoméstico",JOptionPane.OK_OPTION);
                        }else{
                            //-----------------------------------Batedeira-----------------------------------
                            if(option[1].equals("Batedeira")){
                                bate.setMarca(JOptionPane.showInputDialog("Informe a marca:"));
                                bate.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Batedeira\nMarca: "
                                +bate.getMarca()+ "\n\nInforme o preço:")));
                                bate.setQuantHelic(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de hélices:")));
                                do{
                                    resposta = bate.setVoltagem(JOptionPane.showInputDialog("Batedeira\nMarca: " +bate.getMarca()+
                                    "\nPreço: " +decimal.format(bate.getPreco())+ "\n\nInsira a voltagem:"));
                                    if(!resposta){
                                        JOptionPane.showConfirmDialog(null, "Voltagem Incompatível!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                    }
                                }while(resposta == false);
                                bate.calcQuantLitroS(Double.parseDouble(JOptionPane.showInputDialog("Batedeira\nMarca: " +bate.getMarca()+
                                "\nPreço: " +decimal.format(bate.getPreco())+ "\nVoltagem: " +bate.getVoltagem()+ " V\n\nInforme o volume:")),
                                Double.parseDouble(JOptionPane.showInputDialog("Batedeira\nMarca: " +bate.getMarca()+
                                "\nPreço: " +decimal.format(bate.getPreco())+ "\nVoltagem: " +bate.getVoltagem()+ " V\n\nInforme a capacidade:")));
                                bate.calcdesconto(mes);
                                //----------------------------------Resultado---------------------------------------
                                JOptionPane.showConfirmDialog(null, "Batedeira:\nMarca: " +bate.getMarca()+
                                "\nPreço: " +decimal.format(bate.getPreco())+ "\nVoltagem: " +bate.getVoltagem()+ " V\nQuantidade média de litros"
                                + " que podem ser batidos por segundo: " +decimal.format(bate.getQuantMLitroS()), "Eletrodoméstico",JOptionPane.OK_OPTION);
                            }else{
                                if(option[1].equals("Voltar")){
                                    break;
                                }
                            }
                        }
                    }
                }while(!option[1].equals("Voltar"));
                //-------------------------------------------Fábrica-------------------------------------------
            }else{
                if(option[0].equalsIgnoreCase("Fábrica")){
                    do{
                        option[1] = (String) JOptionPane.showInputDialog(null, "Escolha o eletrodoméstico que gostaria de cadastrar:",
                        "Eletrodomésticos", JOptionPane.QUESTION_MESSAGE, null, option2, "Liquidificador");
                        //-----------------------------------Liquidificador-----------------------------------
                        if(option[1].equals("Liquidificador")){
                            liqui.setMarca(JOptionPane.showInputDialog("Informe a marca:"));
                            do{
                                resposta = liqui.setVoltagem(JOptionPane.showInputDialog("Liquidificador\nMarca: " +liqui.getMarca()+
                                "\n\nInsira a voltagem:"));
                                if(!resposta){
                                    JOptionPane.showConfirmDialog(null, "Voltagem Incompatível!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                }
                            }while(resposta == false);
                            liqui.calcQuantLitroS(Double.parseDouble(JOptionPane.showInputDialog("Liquidificador\nMarca: " +liqui.getMarca()+
                            "\nVoltagem: " +liqui.getVoltagem()+ " V\n\nInforme o volume:")),
                            Double.parseDouble(JOptionPane.showInputDialog("Liquidificador\nMarca: " +liqui.getMarca()+
                            "\nVoltagem: " +liqui.getVoltagem()+ " V\n\nInforme a capacidade:")));
                            //-----------------------------tampa---------------------------------------
                            tampa.setCor(JOptionPane.showInputDialog("Informe a cor da tampa:"));
                            tampa.setDescricao(JOptionPane.showInputDialog("Informe a descrição da tampa:"));
                            liqui.setTampa(tampa);
                            //----------------------------------Resultado---------------------------------------
                            JOptionPane.showConfirmDialog(null, "Liquidificador\nMarca: " +liqui.getMarca()+
                            "\nVoltagem: " +liqui.getVoltagem()+ " V\nQuantidade média de litros"
                            + " que podem ser batidos por segundo: " +decimal.format(liqui.getQuantMLitroS())+ "\n\nTampa\nCor: " +liqui.getTampa().getCor()+
                            "\nDescrição: " +liqui.getTampa().getDescricao(), "Eletrodoméstico", JOptionPane.YES_OPTION);
                        }else{
                            //-----------------------------------Ferro de passar-----------------------------------
                            if(option[1].equals("Ferro de passar")){
                                ferro.setMarca(JOptionPane.showInputDialog("Informe a marca:"));
                                do{
                                    resposta = ferro.setVoltagem(JOptionPane.showInputDialog("Ferro de passar\nMarca: " +ferro.getMarca()+
                                    "\n\nInsira a voltagem:"));
                                    if(!resposta){
                                        JOptionPane.showConfirmDialog(null, "Voltagem Incompatível!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                    }
                                }while(resposta == false);
                                //----------------------------------Resultado---------------------------------------
                                JOptionPane.showConfirmDialog(null, "Ferro de passar\nMarca: " +ferro.getMarca()+   
                                "\nVoltagem: " +ferro.getVoltagem()+ " V", "Eletrodoméstico",JOptionPane.OK_OPTION);
                            }else{
                                //-----------------------------------Batedeira-----------------------------------
                                if(option[1].equals("Batedeira")){
                                    bate.setMarca(JOptionPane.showInputDialog("Informe a marca:"));
                                    bate.setQuantHelic(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de hélices:")));
                                    do{
                                        resposta = bate.setVoltagem(JOptionPane.showInputDialog("Batedeira\nMarca: " +bate.getMarca()+
                                        "\n\nInsira a voltagem:"));
                                        if(!resposta){
                                            JOptionPane.showConfirmDialog(null, "Voltagem Incompatível!", "ERRO", JOptionPane.WARNING_MESSAGE);
                                        }
                                    }while(resposta == false);
                                    bate.calcQuantLitroS(Double.parseDouble(JOptionPane.showInputDialog("Batedeira\nMarca: " +bate.getMarca()+
                                    "\nVoltagem: " +bate.getVoltagem()+ " V\n\nInforme o volume:")),
                                    Double.parseDouble(JOptionPane.showInputDialog("Batedeira\nMarca: " +bate.getMarca()+
                                    "\nVoltagem: " +bate.getVoltagem()+ " V\n\nInforme a capacidade:")));
                                    //----------------------------------Resultado---------------------------------------
                                    JOptionPane.showConfirmDialog(null, "Batedeira:\nMarca: " +bate.getMarca()+
                                    "\nVoltagem: " +bate.getVoltagem()+ " V\nQuantidade média de litros"
                                    + " que podem ser batidos por segundo: " +decimal.format(bate.getQuantMLitroS()), "Eletrodoméstico",JOptionPane.OK_OPTION);
                                }else{
                                    if(option[1].equals("Voltar")){
                                        break;
                                    }
                                }
                            }
                        }
                    }while(!option[1].equals("Voltar"));
                }else{
                    if(option[0].equals("Mudar mês")){
                        mes = JOptionPane.showInputDialog("Mudar mês para:");
                    }else{
                        if(option[0].equals("Sair")){
                            break;
                        }
                    }
                }
            }
        }while(!option[0].equals("Sair"));
    }    
}