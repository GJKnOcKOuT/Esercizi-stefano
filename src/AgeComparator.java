import java.util.Arrays;
import java.util.Comparator;

public class AgeComparator implements Comparator<Studente> {

    @Override
    public int compare(Studente primoStudente, Studente secondoStudente) {
        return Integer.compare(primoStudente.getEtà(), secondoStudente.getEtà());
    }
}