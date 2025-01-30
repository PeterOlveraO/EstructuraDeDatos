import java.io.*;

public class EjemploMatriz {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0, y = 0;
        System.out.println("Ingresa el ancho de la matriz: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Ingresa la altura de la matriz: ");
        int m = Integer.parseInt(br.readLine());

        String[][] matriz = new String[m][n];
        matriz[y][x] = "*";

        abajo(m,n,y,x,matriz);
        //lo mas bajo que se puede es 2x3 0 3x1

    }

    public static void abajo(int m,int n,int y, int x,String[][] matriz) {
        y++;
        matriz[y][x] = "*";
        if(x!=n-1){
            if(y!=m-1){
                x++;
                matriz[y][x] = "*";
                abajo(m,n,y,x,matriz);
            } else {
                arriba(m,n,y,x,matriz);
            }
        } else {
            imprimir(m,n,matriz);
        }
    }

    public static void arriba(int m,int n,int y, int x,String[][] matriz){
        y--;
        matriz[y][x] = "*";
        if(x!=n-1){
            if(y!=0){
                x++;
                matriz[y][x] = "*";
                arriba(m,n,y,x,matriz);
            } else {
                abajo(m,n,y,x,matriz);
            }
        } else {
            imprimir(m,n,matriz);
        }
    }

    public static void imprimir(int m,int n,String[][] matriz){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] == null){
                    matriz[i][j] = "-";
                }
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }
}