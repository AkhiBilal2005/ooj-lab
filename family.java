import java.util.*;
class father{
    String name;
    int age;
    public father(String name,int age){
        this.name = name;
        this.age = age;
        try{
            if(age<0){
                throw new IllegalArgumentException("Age can't be negative!");
            }
        }
            catch(IllegalArgumentException e){
                System.out.println("Age can't be negative!!");
            }
            finally{
                System.out.println("age is always positive");
            }
    }
}
class son extends father{
    String na;
    int ag;
    public son(String name,int age,String na,int ag){
        super(name,age);
        this.na = na;
        this.ag = ag;
        try{
            if(age<=ag){
                throw new IllegalArgumentException(" son's age should be less than father's age");
            }
        }
            catch(IllegalArgumentException e){
                System.out.println("Son's age not equal or greater than father's age");
            }
            finally{
                System.out.println("Son's age is less than father's age");
            }
    } 
}
public class family {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter father's name: ");
        String n = s.nextLine();
        System.out.print("Enter father's age: ");
        int a = s.nextInt();
        s.nextLine();
        System.out.print("Enter son's name: ");
        String nam = s.nextLine();
        System.out.print("Enter son's age: ");
        int x = s.nextInt();
        s.nextLine();
        father f = new father(n,a);
        son so = new son(n,a,nam,x);
    }
}
