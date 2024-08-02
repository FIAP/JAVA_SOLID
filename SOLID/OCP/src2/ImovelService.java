public class ImovelService implements IInvestimentoService<Imovel> {
    @Override
    public double calcularRetornoAnual(Imovel imovel) {
        return imovel.calcularRetornoAnual();
    }
}
