import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Peyton", 30));
        people.add(new Person("Henrik", 15));
        people.add(new Person("Sumaya", 20));



        System.out.println("before sorting: \n");
        for(int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        Collections.sort(people);

        System.out.println("after sorting: \n");
        for(int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }








    }
}