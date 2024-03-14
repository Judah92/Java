import java.util.Scanner;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.awt.Color;


public class Assi4Java
{
    public static void main (String[]args)
    {
        double x = 0.1111111;
        double y = 0.2222222;
        final double EPSILON = 10E-7;

        if (Math.abs (y - x) <= EPSILON)
        {
            System.out.println ("X is approximately equal to Y");
        }
        else 
        {
            System.out.println ("X is not approximately equal to Y");
        }

        //////////////////////////////////////////////////////////////
        String string1 = "non";
        String string2 = "NON";

        if(string1.equals(string2))
        {
            System.out.println ("True: non is equal to NON");
        }
        else
        {
            System.out.println ("False: non is not equal to NON");
        }

        //////////////////////////////////////////////////////////////
        Scanner stringInput = new Scanner(System.in);

        System.out.println("Enter a word for comparison: ");
        String string3 = stringInput.nextLine();

        System.out.println("Enter the next word for comparison: ");
        String string4 = stringInput.nextLine();

        if (string3.compareTo(string4) < 0) // < 0 = string3 comes before string4, > 0 means string3 comes after string4, == 0 means string3 is equal to string4
        {
            System.out.println (string3 + " " + "Comes before " + string4 + " "+"in the dictionary");
        }
        else if (string3.compareTo(string4) > 0)
        {
            System.out.println (string4 + " " + "Comes before " + string3 + " "+"in the dictionary");  
        }
        else
        {
            System.out.println (string3 + " " + "is equal to " + string4 + "and thus inhabits ");
        }

        //////////////////////////////////////////////////////////////
        Map <String, Color> favoriteColors = new HashMap<>();
        Map <String, Color> sameFavoriteColors = new HashMap<>();
        Map <String, Color> otherFavColors = new HashMap<>();

        favoriteColors.put("Matthew", Color.BLUE);
        favoriteColors.put("James", Color.GREEN);
        sameFavoriteColors.put("Matthew", Color.BLUE);
        sameFavoriteColors.put("James", Color.GREEN);

        otherFavColors.put("Alex", Color.RED);
        otherFavColors.put("Plato", Color.BLACK);

        if (favoriteColors.equals(sameFavoriteColors))
        {
            System.out.println("True: FavoriteColors is Equal to sameFavoriteColors");
        }
        else
        {
            System.out.println("False: FavoriteColors is Not Equal to sameFavoriteColors");
        }

        if (favoriteColors.equals(otherFavColors))
        {
            System.out.println("True: FavoriteColors is Equal to otherFavColors");
        }
        else 
        {
            System.out.println("False: FavoriteColors is Not Equal to otherFavColors");
        }

        if (sameFavoriteColors.equals(otherFavColors))
        {
            System.out.println("True: sameFavoriteColors is Equal to otherFavColors");
        }
        else
        {
            System.out.println("False: sameFavoriteColors is Not Equal to otherFavColors");
        }

    }
}