public class InvestimentoService {
    
    public double calcularRetornoAnual(Investimento investimento) {
        switch (investimento) {
            case Acao acao -> {
                return acao.calcularRetornoAnual();
            }
            case Titulo titulo -> {
                return titulo.calcularRetornoAnual();
            }
            case Imovel imovel -> {
                return imovel.calcularRetornoAnual();
            }
            default -> {
            }
        }
        throw new IllegalArgumentException("Tipo de investimento desconhecido");
    }
}
