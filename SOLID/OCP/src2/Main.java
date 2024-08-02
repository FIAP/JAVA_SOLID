public class Main {
    public static void main(String[] args) {
        // Criar container e registrar serviços
        Container container = new Container();
        container.register("AcaoService", AcaoService.class);
        container.register("TituloService", TituloService.class);
        container.register("ImovelService", ImovelService.class);

        // Resolver serviços
        IInvestimentoService<Acao> acaoService = container.resolve("AcaoService");
        IInvestimentoService<Titulo> tituloService = container.resolve("TituloService");
        IInvestimentoService<Imovel> imovelService = container.resolve("ImovelService");

        // Criar instâncias de investimento
        Acao acao = new Acao("Empresa X", 5000, 100, 50, 5);
        Titulo titulo = new Titulo("Título do Governo", 10000, 5);
        Imovel imovel = new Imovel("Apartamento no Centro", 300000, 1000);

        // Usar os serviços
        System.out.println("Retorno anual da ação: R$ " + acaoService.calcularRetornoAnual(acao));
        System.out.println("Retorno anual do título: R$ " + tituloService.calcularRetornoAnual(titulo));
        System.out.println("Retorno anual do imóvel: R$ " + imovelService.calcularRetornoAnual(imovel));
    }
}
