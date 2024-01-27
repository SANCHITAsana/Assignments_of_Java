package Assignment3;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Sanchita");
        StringBuilder sb1=new StringBuilder("Sarkar");
        sb.append(sb1);
        System.out.println(sb);

        String s=" ";
        for(int i=sb.length()-1; i>=0; i--){
            s=s+sb.charAt(i);
        }
        System.out.println(s);
        sb.replace(6,14,"SUJATA");
        System.out.println(sb);
    }
}
