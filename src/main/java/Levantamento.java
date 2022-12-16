import java.util.Iterator;

public class Levantamento {
    public static Integer contarBicicletasAtivasBicicletario(Bicicletario bicicletario) {
        int quantidade = 0;
        for (Bicicleta bicicleta : bicicletario) {
            if (bicicleta.isAtiva()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalBicicletasBicicletario(Bicicletario bicicletario) {
        int quantidade = 0;
        for (Iterator a = bicicletario.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
