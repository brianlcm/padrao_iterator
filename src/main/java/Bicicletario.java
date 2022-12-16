import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Bicicletario implements Iterable<Bicicleta>{

    private List<Bicicleta> bicicletas = new ArrayList<Bicicleta>();

    public Bicicletario(Bicicleta... bicicletas) {
        this.bicicletas = Arrays.asList(bicicletas);
    }

    @Override
    public Iterator<Bicicleta> iterator() {
        return bicicletas.iterator();
    }

}
