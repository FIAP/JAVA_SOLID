public class InvestimentoPrinter {
    public static void imprimirRetornoAnual(Investimento investimento) {
        System.out.println(investimento.descrever());
        System.out.println("Retorno anual: R$ " + investimento.calcularRetornoAnual());
    }
}
