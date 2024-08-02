public class Main {
    public static void main(String[] args) {
        Investimento acao = new Acao("Empresa Adriano's SA", 5500, 100, 50, 5);
        Investimento titulo = new Titulo("Título do Governo", 10000, 5);
        Investimento imovel = new Imovel("Apartamento no Centro", 300000, 2000);

        InvestimentoService investimentoService = new InvestimentoService();

        System.out.println("Retorno anual: R$ " + investimentoService.calcularRetornoAnual(acao));
        System.out.println("Retorno anual: R$ " + investimentoService.calcularRetornoAnual(titulo));
        System.out.println("Retorno anual: R$ " + investimentoService.calcularRetornoAnual(imovel));
    }
}
