
public class Main{

    public static void main(final String[] args){
        Studente c[] = new Studente[5];

        Studente s1=new Studente(1,15,1000);
        Studente s2=new Studente(2,10,800);
        Studente s3=new Studente(3,18,3700);
        Studente s4=new Studente(4,19,2300);
        Studente s5=new Studente(5,9,3500);

        c[0]=s1;
        c[1]=s2;
        c[2]=s3;
        c[3]=s4;
        c[4]=s5;

        Corso corso = new Corso(c);

        System.out.println("Lo studente con l'età minore è: " + corso.min(new AgeComparator()));
        System.out.println("Lo studente con il reddito minore è: " + corso.min(new IncomeComparator()));
        System.out.println("Lo studente con l'età maggiore è: " + corso.max(new AgeComparator()));
        System.out.println("Lo studente con reddito maggiore è: " + corso.max(new IncomeComparator()));




    }
}