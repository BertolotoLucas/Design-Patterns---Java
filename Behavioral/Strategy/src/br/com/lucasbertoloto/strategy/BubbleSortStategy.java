package br.com.lucasbertoloto.strategy;

public class BubbleSortStategy implements Strategy {

    @Override
    public void order(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            boolean ordered = true;
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    ordered = false;
                }
            }
            if (ordered)
                break;
        }
    }
}
