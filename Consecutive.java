
import java.util.Arrays;
import java.util.Scanner;

class Consecutive {

    public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers: ");

            String s = sc.nextLine();
            String[] d = s.split(",");
            int size = d.length;
            int [] arr1 = new int [size];
            for(int i=0; i<size; i++) {
                 arr1[i] = Integer.parseInt(d[i]);
        }
            Arrays.sort(arr1);
            int flag = 0;
            for(int i=0; i<size-1; i++){
                if(!(arr1[i+1]-arr1[i] == 1)){
                    System.out.println("Not Consecutive");
                    flag=1;
                    break;
                }
            }
            if(flag==0) System.out.println("Consecutive");


        }

        }





