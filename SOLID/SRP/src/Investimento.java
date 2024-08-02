public abstract class Investimento {
    protected String nome;
    protected Double valorInvestido;

    public Investimento(String nome, double valorInvestido) {
        this.nome = nome;
        this.valorInvestido = valorInvestido;
    }

    public abstract double calcularRetornoAnual();

    public String descrever() {
        return "Investimento: " + nome + ", Valor Investido: R$ " + valorInvestido;
    }
}