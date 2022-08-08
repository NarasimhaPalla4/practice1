import java.util.*;
public class Lab {

    public static void main(String[] args){
        int x,y,z,n,x1,y1,z1;
        Scanner s= new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        n=s.nextInt();
        x1=x-n;
        y1=y-n;
        z1=z-n;
        if(x1>=0 && x1<y1 && x1<z1){
            System.out.println("L1");
        }
        else if(y1>=0 && y1<x1 && y1<z1){
            System.out.println("L2");
        }
        else if(z1>=0){
            System.out.println("L3");
        }
    }
}
