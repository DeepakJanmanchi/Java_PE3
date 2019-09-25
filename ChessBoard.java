
import java.util.Scanner;

class ChessBoard {

    public static void main(String []args){
        int flag = 0;
        for(int i=0; i<8; i++){
            for(int j =0; j<8; j++){
                if(flag==0){
                    System.out.print("WW | ");
                    flag = 1;
                }
                else{
                    System.out.print("BB | ");
                    flag = 0;
                }
            }
            if(flag==0){flag=1;}
            else{flag=0;}
            System.out.println();
        }

        }

    }


/*Write a program to create a ChessBoard pattern with the help of multidimensional array,
where WWrepresents white color and BB represents Black color.
Output:
My Chess Board
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|*/
