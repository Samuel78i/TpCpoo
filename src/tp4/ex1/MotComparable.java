package tp4.ex1;

public class MotComparable implements Comparable{
    String mot ="";

    public MotComparable(String mot) {
        this.mot = mot;
    }

    @Override
    public Object value() {
        return mot;
    }

    @Override
    public boolean estPlusGrand(Comparable i) {
        if(!(i.value() instanceof String test)){
            throw new IllegalArgumentException();
        }else {
            return mot.length() > test.length();
        }
    }

    public String toString(){
        return mot;
    }
}
