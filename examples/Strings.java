import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String str = "Hello, World!";  // simple string
        System.out.println(str);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str2 = in.nextLine();  // here nextLine() is used to read a string with spaces
        System.out.println("You entered: " + str2);
        // next() is used to read a string without spaces

        // 1.concatenation of two strings
        String concate = str +" "+ str2;
        System.out.println("Concatenated string: " + concate);

        // 2. length of a string
        System.out.println("Length of string: " + str.length());

        // 3. substring of a string
        System.out.println("Substring of string: " + str.substring(7, 12));

        // 4. replace a character in a string
        System.out.println("Replaced string: " + str.replace('o', 'a'));

        // 5. convert string to uppercase
        System.out.println("Uppercase string: " + str.toUpperCase());

        // 6. convert string to lowercase
        System.out.println("Lowercase string: " + str.toLowerCase());

        // 7. check if a string contains a substring
        System.out.println("Contains substring: " + str.contains("World"));

        // 8. check if a string is empty
        System.out.println("Is string empty: " + str.isEmpty());

        // 9. check if two strings are equal
        System.out.println("Are strings equal: " + str.equals(str2));

        // 10. check if two strings are equal ignoring case
        // equalsIgnoreCase() is used to compare two strings ignoring case
        //ignoring case means it will compare the strings without considering the case of the characters
        System.out.println("Are strings equal ignoring case: " + str.equalsIgnoreCase(str2));

        // 11. compare two strings
        // compareTo() is used to compare two strings
        // it returns 0 if both strings are equal
        // it returns a positive value if the first string is greater than the second string
        System.out.println("Compare strings: " + str.compareTo(str2));
        
        // 12. check if a string starts with a substring
        System.out.println("Starts with substring: " + str.startsWith("Hello"));

        // 13. check if a string ends with a substring
        System.out.println("Ends with substring: " + str.endsWith("World!"));

        // 14. find the index of a character in a string
        System.out.println("Index of character: " + str.indexOf('o'));

        // 15. find the index of a character in a string from a given index
        // indexOf() can also be used to find the index of a character from a given index
        System.out.println("Index of character from index: " + str.indexOf('o', 5));

        // 16. find the last index of a character in a string
        System.out.println("Last index of character: " + str.lastIndexOf('o'));


        // 17. find the last index of a character in a string from a given index
        // lastIndexOf() can also be used to find the last index of a character from a given index
        System.out.println("Last index of character from index: " + str.lastIndexOf('o', 5));

        // 18. split a string
        // split() is used to split a string into an array of substrings
        String[] arr = str.split(",");
        System.out.println("Splitted string: ");
        for (String s : arr) {
            System.out.println(s);
        }

        // 19. trim a string
        // trim() is used to remove leading and trailing whitespaces from a string
        String str3 = "   Hello, World!   ";
        System.out.println("Trimmed string: " + str3.trim());

        // 20. convert a string to an integer
        // parseInt() is used to convert a string to an integer
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println("Converted integer: " + n);

        // 21. convert an integer to a string
        // toString() is used to convert an integer to a string
        int num2 = 123;
        String s = Integer.toString(num2);
        System.out.println("Converted string: " + s);

        // 22. convert a string to a double
        // parseDouble() is used to convert a string to a double
        String num3 = "123.45";
        double d = Double.parseDouble(num3);
        System.out.println("Converted double: " + d);

        // 23. convert a double to a string
        // toString() is used to convert a double to a string
        double num4 = 123.45;
        String s2 = Double.toString(num4);
        System.out.println("Converted string: " + s2);

        // 24. convert a string to a character array
        // toCharArray() is used to convert a string to a character array
        char[] ch = str.toCharArray();
        System.out.println("Character array: ");
        for (char c : ch) {
            System.out.println(c);
        }

        // 25. convert a character array to a string
        // valueOf() is used to convert a character array to a string
        char[] ch2 = {'H', 'e', 'l', 'l', 'o'};
        String s3 = String.valueOf(ch2);
        System.out.println("Converted string: " + s3);

        // 26. check if a string is a palindrome
        // a palindrome is a string that reads the same forwards and backwards
        // to check if a string is a palindrome, we compare it with its reverse
        String str4 = "madam";
        String rev = new StringBuilder(str4).reverse().toString();
        if (str4.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        // 27. count the occurrences of a character in a string
        char c = 'l';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Occurrences of character: " + count);

        // 28. count the occurrences of a substring in a string
        String sub = "lo";
        int count2 = 0;
        for (int i = 0; i < str.length() - sub.length() + 1; i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count2++;
            }
        }
        System.out.println("Occurrences of substring: " + count2);

        // 29. remove all occurrences of a character from a string
        // replaceAll() is used to remove all occurrences of a character from a string
        char c2 = 'l';
        String str5 = str.replaceAll(String.valueOf(c2), "");
        System.out.println("Removed all occurrences of character: " + str5);

        // 30. remove all occurrences of a substring from a string
        // replaceAll() is used to remove all occurrences of a substring from a string
        String sub2 = "lo";
        String str6 = str.replaceAll(sub2, "");
        System.out.println("Removed all occurrences of substring: " + str6);

        // 31. remove leading and trailing whitespaces from a string
        // trim() is used to remove leading and trailing whitespaces from a string
        String str7 = "   Hello, World!   ";
        System.out.println("Trimmed string: " + str7.trim());

        // 32. remove leading whitespaces from a string
        // replaceAll() is used to remove leading whitespaces from a string
        String str8 = "   Hello, World!";
        String str9 = str8.replaceAll("^\\s+", "");
        System.out.println("Removed leading whitespaces: " + str9);

        // 33. remove trailing whitespaces from a string
        // replaceAll() is used to remove trailing whitespaces from a string
        String str10 = "Hello, World!   ";
        String str11 = str10.replaceAll("\\s+$", "");
        System.out.println("Removed trailing whitespaces: " + str11);

        // 34. remove all whitespaces from a string
        // replaceAll() is used to remove all whitespaces from a string

        String str12 = "   Hello, World!   ";
        String str13 = str12.replaceAll("\\s+", "");
        System.out.println("Removed all whitespaces: " + str13);

        // 35. remove all non-alphanumeric characters from a string
        // replaceAll() is used to remove all non-alphanumeric characters from a string
        String str14 = "Hello, World! 123";
        String str15 = str14.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Removed all non-alphanumeric characters: " + str15);

        

    }
}