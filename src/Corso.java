import java.util.*;

public class Corso {
    private Studente[] studentes;

    public Corso(Studente[] studentes) {
        this.studentes = studentes;
    }
    public Studente min(Comparator<Studente> comparator) {
        int temp = 0;
        for (int i = 0; i < this.studentes.length -1; i++) {
            if (comparator.compare(studentes[temp], studentes[i + 1]) > 0) {
                temp = i + 1;
            }
        }
        return this.studentes[temp];
    }
    public Studente max(Comparator<Studente> comparator) {
        int temp = 0;
        for (int i = 0; i < this.studentes.length -1; i++) {
            if (comparator.compare(studentes[temp], studentes[i + 1]) < 0) {
                temp = i + 1;
            }
        }
        return this.studentes[temp];
    }
}
