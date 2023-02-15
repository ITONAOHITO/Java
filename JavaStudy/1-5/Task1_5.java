public class Task1_5{
    public static void main(String[] args){
        String [] fruits = {"みかん","りんご","ぶどう","メロン"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // int型変数iに1を代入。while文で1〜100の整数を連続して改行せずに表示。最後に改行。
        int i = 1;
        while(i <= 100) {
          System.out.print(i);
          i++;
        }
        System.out.println();

        for (int j=1;j<=9;j++) {
            System.out.print(j + "||");
            for (int g=1;g<=9;g++) {
                System.out.print((j*g) + "|");
            }
            System.out.println();
        }
    }
}