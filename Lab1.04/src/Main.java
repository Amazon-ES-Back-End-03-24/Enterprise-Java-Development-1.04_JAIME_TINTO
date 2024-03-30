import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] list = {4,1, 10, 3, 15,9,4,12,30,27};
        int may = list[0];
        int men = list[0];

//TAREA 1

        for (int i = 1; i < list.length; i++) {

            if (list[i] > may) {
                may = list[i];}






            if (list[i] < men) {
                men = list[i];
            }


        }
        int dif = may - men;

        //System.out.println("El numero mas alto es:\n" + may );
        //System.out.println("El numero mas bajo es:\n"+ men );

        System.out.println("TAREA 1\nLa diferencia entre el valor mas alto y el mas bajo es de: "+ dif);


//TAREA 2
        Arrays.sort(list);
        System.out.println("TAREA 2");
        System.out.println("El numero mas bajo es:"+ list[0]);
        System.out.println("El segundo numero mas bajo es:"+ list[1]);

//TAREA 3
 int X=3;
 int Y=10;
 int ec=((4*Y/5)-X);

 int Res= X*X+ec*ec;
        System.out.println("TAREA 3");
        System.out.println("El resultado de la variable es:"+Res);





    }

}
