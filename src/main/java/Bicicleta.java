public class Bicicleta {
    private String tipo;
    private boolean ativa;

    public Bicicleta(String tipo, boolean ativa) {
        this.tipo = tipo;
        this.ativa = ativa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
