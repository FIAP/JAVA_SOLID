public class AcaoService {
    
    public double calcularRetornoDividendos(Acao acao) {
        return acao.buscarQuantidade() * acao.buscarDividendoAnual();
    }

    public String descrever(Acao acao) {
        return "Ação: " + acao.getNome() + 
               ", Quantidade: " + acao.buscarQuantidade() + 
               ", Preço por Ação: R$ " + acao.buscarPrecoPorAcao() + 
               ", Dividendo Anual: R$ " + acao.buscarDividendoAnual();
    }

    public void save(Acao acao) {
        System.out.println("Saving investment: " + acao.toString());
    }
}
