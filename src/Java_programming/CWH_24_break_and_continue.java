package Java_programming;

public class CWH_24_break_and_continue {
    public static void main(String[] args) {
// Break and continue using loops
        for (int i=0; i<=5; i++){
            System.out.println(i);
            System.out.println("Java is great!!");
            if(i==2){
                System.out.println("ending the loop!!");
                break;
            }
         }
        System.out.println("Loops ends here!!");

        // Using while / do-while loop we can use break
        int i1 = 0;
        do{
            System.out.println(i1);
            System.out.println("Java is great");
            if(i1==2){
                System.out.println("Loops ends here!!");
                break;
            }
            i1++;
        }while(i1<5);
        System.out.println("END");

       // continue statement using for loop
        for (int i2=0; i2<=5; i2++){
            if(i2==2){
                System.out.println("ending the loop!!");
               continue;
            }
            System.out.println(i2);
            System.out.println("Java is great!!");
         }
        System.out.println("Loops ends here!!");

        // continue statement using do-while loop
        int i3 = 0;
        do{
            i3++;
            if(i3==2){
                System.out.println("Loops ends here!!");
               continue;
            }
            System.out.println(i3);
            System.out.println("Java is great");

        }while(i3<5);
        System.out.println("END");
    }
}

