import java.util.Comparator;

public class IncomeComparator implements Comparator<Studente> {

    @Override
    public int compare(Studente primoStudente, Studente secondoStudente) {
        return Integer.compare(primoStudente.getReddito(), secondoStudente.getReddito());
    }
}