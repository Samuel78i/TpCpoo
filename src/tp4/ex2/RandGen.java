package tp4.ex2;

import java.util.Random;

public class RandGen implements Generateur{
    int max = 0;

    public void setMax(int m){
        max = m;
    }

    @Override
    public int suivant() throws Exception {
        Random rand = new Random();
        return rand.nextInt(max);
    }
}
