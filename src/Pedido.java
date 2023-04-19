import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Ingresso ingresso;

    public double calculaPedido(double valor){
        return ingresso.getValor() + valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

}
