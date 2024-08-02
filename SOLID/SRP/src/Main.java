//package SOLID.SRP.src;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("Empresa X", 5000.0, 100, 50.0, 5.0);
        AcaoService acaoService = new AcaoService();

        System.out.println(acaoService.descrever(acao));
        System.out.println("Retorno anual: R$ " + acaoService.calcularRetornoDividendos(acao));
        acaoService.save(acao);
    }
}
