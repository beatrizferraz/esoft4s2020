package beatriz_ferraz.aula20201020.ModeloOOMercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private double valorTotal;
    private List<ItemPedido> itens = new ArrayList<>();
    private List <Pessoa> pessoas = new ArrayList<>();

    public Pedido() {
        
    }

    public Pedido (double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // public double getValorTotal() {
    //     return valorTotal;
    // }

    // public ItemPedido getItemPedido() {
    //     for (ItemPedido : itens) {
    //         if (itens instanceof ItemPedido) {
    //             return (ItemPedido) itens;
    //         }
    //     }
    //     return null;
    // }
    private double unitario;
    private int quant;
    
    public double getValorTotal() {

        for (ItemPedido item : itens) {
            unitario = item.getValorUnitario();
            quant = item.getQuantidade();
            valorTotal = quant * unitario;
        }
        return valorTotal;
    }
}
