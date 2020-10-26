import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please input your string. " );
        String string = scanner.nextLine();


        int width = string.length() + 6;

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= width; j++)
            {
                if (!(i==3 && j == width)&&(i == 1 || i == 5 || j == 1 || j == width))
                    System.out.print("*");// first line, last line , first column and last column will being put star,
                //except the point where i is 3 and j is width, we didn't put star here as we added by ourselves.
                else
                    System.out.print(" ");

                if (i == 3 && j ==3) {
                    System.out.print(string+"  *");
                }
            }
            System.out.println();
        }

    }


}
