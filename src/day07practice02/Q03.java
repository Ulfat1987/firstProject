package day07practice02;

public class Q03 {
    public static void main(String[] args) {
     /*
       String shirtPrice= "$ 12.99";
       String bookPrice= "$ 35.99";
       Type a code to find the sum of the shirt and book prices.
     */
    String shirtPrice = "$ 12.99";
    String bookPrice = "$ 35.99";
    String shirt = shirtPrice.replace("$","");//12.99
    String book = bookPrice.replace("$","");//35.99
  //How can i convert String to Double ?We should use Double Wrapper class and put dot.
  // We can convert Strings to Double numeric values because it is not possible to operate math operations with Strings.
        System.out.println(shirt+book);
        double sd = Double.valueOf(shirt);//==>double
        double bd = Double.valueOf(book);
        System.out.println(sd + bd);//48.980000000000004












    }
}
