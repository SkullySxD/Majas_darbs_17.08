public class Main {
    public static void main(String[] args) {

        for (int i=1; i<10; i += 2)
        {
            for (int a=0; a < (4 - i / 2); a++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}