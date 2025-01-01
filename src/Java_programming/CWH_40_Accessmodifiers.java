package Java_programming;
/*
Access Modifiers specify where a property/method is accessible. There are four types of access modifiers in java :

private
default
protected
public


Access Modifier       	within class	    within package	outside package by subclass only	outside package
public	                    Y	              Y	                Y	                                Y
protected	                Y	              Y	                Y	                                N
Default	                    Y	              Y             	N	                                N
private	                    Y                 N             	N                               	N
 */

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class CWH_40_Accessmodifiers {
    public static void main(String[] args) {
      MyEmployee obj = new MyEmployee();
      obj.setName("Dipak");
        System.out.println(obj.getName());
      obj.setId(007);
        System.out.println(obj.getId());
    }
}
