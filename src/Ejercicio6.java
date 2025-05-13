
public class Ejercicio6 {

    public static void main(String[] args) {
//      Scanner input = new Scanner(System.in);
//      System.out.print("Introduce una frase en mayusculas: ");
      String text = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
      String textLowerCase;
      textLowerCase = text.toLowerCase();
//        System.out.println(textLowerCase);
      String substringLowerCase = textLowerCase.substring(13);
        System.out.println(substringLowerCase);
      String text2 = textLowerCase.substring(0, 10);
      String text3 = textLowerCase.substring(21, 37);
        System.out.println(text2 + text3);

    }
}