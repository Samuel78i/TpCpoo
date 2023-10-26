package tp4.ex1;

public class SequenceMots implements Sequencable {

    MotComparable[] mots = null;

    public SequenceMots(MotComparable[] mots) {
        this.mots = mots;
    }

    @Override
    public int longeur() {
        return mots.length;
    }

    @Override
    public Comparable get(int i) {
        return mots[i];
    }

    @Override
    public void echange(int i, int j) {
        MotComparable temp = mots[j];
        mots[j] = mots[i];
        mots[i] = temp;
    }

    @Override
    public String affiche() {
        return Sequencable.super.affiche();
    }

    @Override
    public void triBulles(Comparable[] tab) {
        Sequencable.super.triBulles(tab);
    }

    public Comparable[] getSequence() {
        return mots;
    }
}
