public class Ingressovip extends Ingresso {
    private float valorAdicional;

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public Ingressovip(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public Ingressovip() {

    }

    public String toString() {
        return "O valor total é: " + (valorAdicional + getValor());
    }
}