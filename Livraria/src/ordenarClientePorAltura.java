import java.util.Comparator;

public class ordenarClientePorAltura implements Comparator <Cliente>  {

    @Override
    public int compare(Cliente c1, Cliente c2) {
        return Double.compare(c1.getAltura(), c2.getAltura());
    }
}
