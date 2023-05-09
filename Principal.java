public class Principal {
    public static void main(String[] args) {
        Ingresso valor = new Ingresso(45.50f);
        Ingressovip valorAdicional = new Ingressovip(valor.getValor(),50f);

        System.out.println(valor.toString());
        System.out.println(valorAdicional.toString());
    }
}
