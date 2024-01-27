package Assignment3;
import java.util.Scanner;
public class Word_Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=sc.nextLine();
        System.out.println("Number of words="+str.length());
        int vc=0,cc=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
                    str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vc++;
            }
            else {
                cc++;
            }
        }
        System.out.println("Number of vowels= "+vc);
        System.out.println("Number of consonants= "+cc);
        String s=" ";
        for(int i=str.length()-1; i>=0; i--){
            s=s+str.charAt(i);
        }
        System.out.println("Reversed sentence is= "+s);

    }
}

