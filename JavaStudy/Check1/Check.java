public class Check {
    public static void main(String[] args) {
        int [] data = {3, 1, 2, 7, 5};
        for (int i =0;i<data.length;i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < data.length-1; i++) {
            for (int j = data.length-1; j > i; j--) {
                /*
                 * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[j-1] > data[j]){
                  int box = data[j-1];
                  data[j-1] = data[j];
                  data[j] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }

    }
}
