public class AcaoService implements IInvestimentoService<Acao> {
    @Override
    public double calcularRetornoAnual(Acao acao) {
        return acao.calcularRetornoAnual();
    }
}
