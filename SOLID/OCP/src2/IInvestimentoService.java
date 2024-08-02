public interface IInvestimentoService<T extends Investimento> {
    double calcularRetornoAnual(T investimento);
}
