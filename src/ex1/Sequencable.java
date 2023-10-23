package ex1;

public interface Sequencable {
    public int longeur(); // Renvoie la longueur de la sequence

    public Comparable get(int i); // Renvoie le ieme objet de la sequence

    public void echange(int i, int j); // Echange le ieme object avec le jieme objet

    default String affiche(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i< longeur(); i++){
            result.append(get(i).toString() + " | ");
        }
        return result.toString();
    }

    default void triBulles(Comparable[] tab) {
        boolean change = false;
        do {
            change = false;
            for (int i=0; i<tab.length - 1; i++) {
                if (tab[i].estPlusGrand(tab [i+1])) {
                    Comparable tmp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = tmp;
                    change = true;
                    }
                }
            } while (change);
        }
}