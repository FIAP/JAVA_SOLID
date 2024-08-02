public class Acao extends Investimento {
    private int quantidade;
    private double precoPorAcao;
    private double dividendoAnual;

    public Acao(String nome, double valorInvestido, int quantidade, double precoPorAcao, double dividendoAnual) {
        super(nome, valorInvestido);
        this.quantidade = quantidade;
        this.precoPorAcao = precoPorAcao;
        this.dividendoAnual = dividendoAnual;
    }

    @Override
    public double calcularRetornoAnual() {
        return quantidade * dividendoAnual;
    }
   

    public double buscarPrecoPorAcao() {
        return precoPorAcao;
    }
    
    public String getNome() {
        return nome;
    }

    public int buscarQuantidade(){
        return quantidade;
    }

    public double buscarDividendoAnual(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "nome='" + nome + '\'' +
                ", valorInvestido=" + valorInvestido +
                ", quantidade=" + quantidade +
                ", precoPorAcao=" + precoPorAcao +
                ", dividendoAnual=" + dividendoAnual +
                '}';
    }
}

