package Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Float> floatList = new ArrayList<>();

        float[] floatArr = new float[5];
        double[][] multArray = {
                {1.0, 0.9, 0.8},
                {0.7, 0.6, 0.5, 0.4},
                {0.12},
        };
        float a = 1;

        for(int i = 0;i<floatArr.length;i++){
            floatArr[i] = a;
            floatList.add(a);
            a = a / 2;
        }

        System.out.println("\nFloat array");
        for (float num:floatArr) {
            System.out.print(num+", ");
        }

        System.out.println("\n\nFloat ArrayList");
        System.out.println(floatList);

        System.out.println("\nMultidimensional Array");
        for (int i = 0; i < multArray.length; ++i) {
            for(int j = 0; j < multArray[i].length; ++j) {
                for (int k = 0; k <= j; k++) {
                    System.out.println("intArray [" + i
                            + "][" + j + "][" +k +"] = " + multArray[i][j]);
                }
            }

        }


    }
}
