
public class Tarea1 {

    public static void main(String[] args)
    {
        int i,n = 0,z,y = 1;
        int[] Lista = new int[10];

        Lista[0] = 2;
        Lista[1] = 5;
        Lista[2] = 2;
        Lista[3] = 4;
        Lista[4] = 9;
        Lista[5] = 5;
        Lista[6] = 1;
        Lista[7] = 2;
        Lista[8] = 34;
        Lista[9] = 9;


        while(n<= Lista.length)
        {
            for(z = 0; z <= y - 1; z++)
            {
                System.out.println(Lista[n + z]);
                if (z == y - 1)
                {
                    n += z;
                }
                n += y;
                y++;
            }
            n++;
        }
    }
}
