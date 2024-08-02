public class AcaoRetornoService {
    public double calcularRetornoDividendos(Acao acao) {
        return acao.buscarQuantidade() * acao.buscarDividendoAnual();
    }
}
