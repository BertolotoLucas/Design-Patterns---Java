package br.com.lucasbertoloto.strategy;

public class QuickSortStategy implements Strategy {

    @Override
    public void order(int[] v) {
        quickSort(v, 0, v.length - 1);
    }

    private void quickSort(int[] v, int begin, int end) {
        if(end > begin) {
            int pivot = divide(v, begin, end);
            quickSort(v, begin, pivot - 1);
            quickSort(v, pivot + 1, end);
        }
    }

    private int divide(int[] v, int begin, int end) {
        int pivot, left, right = end;
        left = begin + 1;
        pivot = v[begin];

        while(left <= right) {
            while(left <= right && v[left] <= pivot) {
                left++;
            }
            while(right >= left && v[right] > pivot) {
                right--;
            }
            if(left < right) {
                change(v, right, left);
                left++;
                right--;
            }
        }

        change(v, begin, right);
        return right;
    }

    private void change(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

}
