public class AcaoDescricaoService {
    public String descrever(Acao acao) {
        return "Ação: " + acao.getNome() + 
               ", Quantidade: " + acao.buscarQuantidade() + 
               ", Preço por Ação: R$ " + acao.buscarPrecoPorAcao() + 
               ", Dividendo Anual: R$ " + acao.buscarDividendoAnual();
    }
}
