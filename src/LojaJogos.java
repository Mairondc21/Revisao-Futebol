import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LojaJogos {
    public static void main(String[] args) {
        List<Ingresso> ingressos = new ArrayList<>();

        try{
            String nome = JOptionPane.showInputDialog(null,"Informe o nome do cliente", "nome",
                    JOptionPane.PLAIN_MESSAGE);

            String jogoNome = JOptionPane.showInputDialog(null,"Informe o nome do cliente", "jogo",
                    JOptionPane.PLAIN_MESSAGE);

            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor do jogo ","valor",
                    JOptionPane.PLAIN_MESSAGE));

            String qtoIngresso = JOptionPane.showInputDialog(null,"Informe a quantidade de ingressos", "ingressos",
                    JOptionPane.PLAIN_MESSAGE);

            Cliente cliente = new Cliente();

            List<Ingresso> ingresso = new ArrayList<>();

            Pedido pedido = new Pedido();




        } catch (Exception ex){
            System.out.println("error");
        }

    }
}
