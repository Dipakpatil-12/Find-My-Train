package Java_programming;

public class CWH_14_String_methods {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "  Harry  ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("rry", "ier"));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("rry"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(1));
        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("r"));

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        // it checks starting occurence index in Spark_2_0_Java_Full_Stack_.string
        System.out.println(modifiedName.indexOf("rry",4));

        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry",4));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("hArRy"));

        // Escape sequence character
        // System.out.println("I am escape sequence character" double quote");
        // for this above Spark_2_0_Java_Full_Stack_.string we have to use escape sequence character backward slash \\ or \n for new line
        System.out.println("I am escape sequence character \\ double quote");
        // with only single backward slash n \n for new line print
        System.out.println("I am escape sequence character \n double quote");


    }
}