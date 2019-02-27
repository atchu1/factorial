public class Num {
public static void main(String[] args) {
String string = "2";
boolean numeric = true;
try {
Double num = Double.parseDouble(string);
} catch (NumberFormatException e) {
numeric = false;
 }
 if(numeric)
 System.out.println( " Yes");
 else
 System.out.println( " No");
 }
}
