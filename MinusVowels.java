
import java.util.Scanner;

class MinusVowels {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings \n");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter the strings \n");
        for(int i=0; i<n; i++){
         s[i] = sc.nextLine();
         String v = "";
         for(int j=0; j<s[i].length(); j++){
             if(!(s[i].charAt(j)=='a' || s[i].charAt(j)=='e' ||s[i].charAt(j)=='i' ||s[i].charAt(j)=='o' ||s[i].charAt(j)=='u')){
                 v=v+s[i].charAt(j);
             }
         }
         System.out.println(v);

        }

    }
}

/*4. Write a program to set up an array of places, Loop round and remove the vowels. Display the
new words in console
Input:
India
United States
Germany
Egypt
czechoslovakia*/
