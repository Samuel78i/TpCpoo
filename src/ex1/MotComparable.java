package ex1;

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
        if(!(i.value() instanceof String)){
            throw new IllegalArgumentException();
        }else {
            String test = (String) i.value();
            return mot.length() > test.length();
        }
    }

    public String toString(){
        return mot;
    }
}
