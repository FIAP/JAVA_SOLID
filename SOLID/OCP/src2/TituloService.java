public class TituloService implements IInvestimentoService<Titulo> {
    @Override
    public double calcularRetornoAnual(Titulo titulo) {
        return titulo.calcularRetornoAnual();
    }
}
