public class ServiceConfiguration {
    public AcaoDescricaoService buscarAcaoDescricaoService() {
        return new AcaoDescricaoService();
    }

    public AcaoRetornoService buscarAcaoRetornoService() {
        return new AcaoRetornoService();
    }

    public IRepository<Acao> buscarRepository() {
        return new Repository<>();
    }
}
