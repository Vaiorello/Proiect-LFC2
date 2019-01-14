public class Productie implements Comparable {
    private char stg;
    private String dr;

    Productie(char stg, String dr) {
        this.stg = stg;
        this.dr = dr;
    }

    public char getStg() {
        return this.stg;
    }

    public String getDr() {
        return this.dr;
    }

    public String toString() {
        return this.stg + "->" + this.dr;
    }

    public int compareTo(Object o) {
        Productie p = (Productie) o;
        if(p.getStg() == stg && p.getDr().equals(dr))
            return 0;
        if(p.getStg() > stg)
            return 1;

        if(p.getStg() < stg)
            return -1;

        return 1;
    }
}