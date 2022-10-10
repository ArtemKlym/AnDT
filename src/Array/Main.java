package Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Float> floatList = new ArrayList<>();

        float[] floatArr = new float[5];
        float x = 1;


        for(int i = 0;i<floatArr.length;i++){
            floatArr[i] = x;
            floatList.add(x);
            x = x/2;
        }

        System.out.println("Float array");
        for (float num:floatArr) {
            System.out.print(num+", ");
        }

        System.out.println("\nFloat ArrayList");
        System.out.println(floatList);
    }
}
