public class Imovel extends Investimento {
    private double aluguelMensal;

    public Imovel(String nome, double valorInvestido, double aluguelMensal) {
        super(nome, valorInvestido);
        this.aluguelMensal = aluguelMensal;
    }

    @Override
    public double calcularRetornoAnual() {
        return this.aluguelMensal * 12;
    }

    public double calcularDepreciacao() {
        return valorInvestido * 0.05;
    }
}
