import java.io.*;
import java.util.*;
public class sinosisinono {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arreglo = new int[20];
        int c = 1, i = 0;
        int n = arreglo.length;

        for(int y = 0; y<arreglo.length;y++){
            arreglo[y] = (int)(Math.random() * 100) + 1 ;

        }
        System.out.println(Arrays.toString(arreglo));
        foo(arreglo, c, i, n);
    }

    public static void foo(int[] arreglo, int c, int i,int n){

        for (int x = 0; x <= c-1; x++){
            System.out.println(arreglo[i]);
            i++;
        }
        i+=c;
        c++;
        if (i<=n-1){
            foo(arreglo, c, i, n);
        }
    }

}
