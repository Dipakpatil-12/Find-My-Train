package Java_programming;

public class CWH_15_ps3 {
    public static void main(String[] args) {

//         problem-1: Write a java program to convert a Spark_2_0_Java_Full_Stack_.string to lowercase

        String name = "Jack Parker";
        // not only print, they said convert the Spark_2_0_Java_Full_Stack_.string into new lowercase Spark_2_0_Java_Full_Stack_.string
        name = name.toLowerCase();
        System.out.println(name);

//         problem-2: write a java program to replace spaces with underscores

        String text = "To lower case";
        text = text.replace(" ","_");
        System.out.println(text);
        System.out.println(name.replace(' ' ,'_'));

//         problem-3: write a java program to fill in letter template which looks like below:
//         letter = "Dear <|name|>, Thanks a lot"
//         Replace <|name|> with a Spark_2_0_Java_Full_Stack_.string (some name)

        String letter = "Dear <|name|>, Thanks a lot!!";
        letter = letter.replace("<|name|>","Dipak");
        System.out.println(letter);

//         problem-4: Write a java program to detect double and triple spaces in Spark_2_0_Java_Full_Stack_.string

        String myString = "This Spark_2_0_Java_Full_Stack_.string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
//         you can also do this with if else but by this also happen
//        if -1 is output then there is no double/triple space

//         problem-5: write a java program to format the following letter using escape sequence character
//         letter = "Dear Harry, This java course is nice. Thanks!!"

        String myletter = "Dear Harry,\n\tThis java course is nice.\n\tThanks!!";
        System.out.println(myletter);

    }
}
