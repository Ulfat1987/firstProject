package day11constructorsmethodcallstatickeyword;

public class Test {
    public static void main(String[] args) {
        double num = 75.4238;
        String str = String.valueOf(num);
        String s = "";
        int i = 0;
        String decPart = str.split("\\.")[1];
        System.out.println(decPart);
        do {
            String r = decPart.substring(i,i+1);
            s = s + "*" + r;
            i++;
        }while(i< decPart.length());
        System.out.println(s);
        }
    }







































