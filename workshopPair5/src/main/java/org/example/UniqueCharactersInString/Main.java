package org.example.UniqueCharactersInString;

public class Main {
    public static void main(String[] args) {
        String str  = args[0];

        for (int i = 0; i < str.length() ; i++)
        {
            for (int j = i+1; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    System.out.println("Stringde tekrar eden karakter var.");
                    return;
                }
            }
        }
        System.out.println("Stringde tekrar eden karakter yok.");
    }

}
