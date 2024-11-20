public class Person implements Comparable<Person>
{
    public Person () {}

    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age;}

    public int compareTo (Person other) {
        return Integer.compare(this.age, other.age);
    }


    /* IF you want to sort by name

    public int compareTo (Person other) {
        return this.name.compareTo(other.name);
    }

    */



    public String toString()
    {
        return "name: " + name + "\n age: " + age;
    }



}
