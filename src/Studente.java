public class Studente{
    private int matricola,reddito,età;

    public Studente(int matricola, int reddito, int età) {
        this.matricola = matricola;
        this.reddito = reddito;
        this.età = età;
    }

    public int getMatricola(){
        return matricola;
    }

    public void setMatricola(int m){
        matricola=m;

    }

    public int getReddito(){
        return reddito;
    }

    public void setReddito(int r){
        reddito=r;
    }

    public int getEtà(){
        return età;
    }

    public void setEtà(int e){
        età=e;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola=" + matricola +
                ", reddito=" + reddito +
                ", età=" + età +
                '}';
    }
}