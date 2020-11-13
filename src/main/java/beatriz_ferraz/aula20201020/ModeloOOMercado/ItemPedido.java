package beatriz_ferraz.aula20201020.ModeloOOMercado;

public class ItemPedido {
    private int quantidade;
    private double valorUnitario;
    private double valorTotal;

    public ItemPedido(int quantidade, double valorUnitario)  {
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
