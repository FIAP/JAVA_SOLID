public class Titulo extends Investimento {
    private double taxaDeJurosAnual;

    public Titulo(String nome, double valorInvestido, double taxaDeJurosAnual) {
        super(nome, valorInvestido);
        this.taxaDeJurosAnual = taxaDeJurosAnual;
    }

    @Override
    public double calcularRetornoAnual() {
        return this.valorInvestido * (this.taxaDeJurosAnual / 100);
    }
}
