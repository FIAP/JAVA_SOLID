public class Main {
    public static void main(String[] args) {
        Investimento acao = new Acao("Empresa X", 5000, 100, 50, 5);
        Investimento titulo = new Titulo("Título Y", 10000, 7);
        Investimento imovel = new Imovel("Apartamento Z", 300000, 1500);

        InvestimentoPrinter.imprimirRetornoAnual(acao);
        InvestimentoPrinter.imprimirRetornoAnual(titulo);
        InvestimentoPrinter.imprimirRetornoAnual(imovel);
    }
}
