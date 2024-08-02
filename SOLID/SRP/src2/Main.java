public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("Empresa X", 5000.0, 100, 50.0, 5.0);
        ServiceConfiguration serviceConfig = new ServiceConfiguration();
  
        AcaoRetornoService acaoRetornoService = serviceConfig.buscarAcaoRetornoService();
        AcaoDescricaoService acaoDescricaoService = serviceConfig.buscarAcaoDescricaoService();
        IRepository<Acao> repository = serviceConfig.buscarRepository();

        System.out.println(acaoDescricaoService.descrever(acao));
        System.out.println("Retorno anual: R$ " + acaoRetornoService.calcularRetornoDividendos(acao));
        repository.save(acao);
    }
}
