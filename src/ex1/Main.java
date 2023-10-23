package ex1;

public class Main {
    public static void main(String[] args) {
        MotComparable un = new MotComparable("a");
        MotComparable deux = new MotComparable("aa");
        MotComparable trois = new MotComparable("aaa");
        MotComparable quatre = new MotComparable("aaaa");

        MotComparable[] mots = new MotComparable[4];
        mots[0] = un;
        mots[1] = deux;
        mots[2] = quatre;
        mots[3] = trois;
        SequenceMots s = new SequenceMots(mots);

        System.out.println(s.affiche());
        System.out.println(s.get(1));
        s.echange(1, 0);
        System.out.println(s.affiche());
        s.triBulles(s.getSequence());
        System.out.println(s.affiche());
    }
}