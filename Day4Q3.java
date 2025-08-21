class Sub{
    String name;
    int age;
    Sub(String name,int age)
    {
        this.name = name;
        this.age=age;
    }
    public String toString()
    {
        return name+" "+age;
    }
}
public class Day4Q3{
    public static void main(String[] args)
    {
      Sub sb =  new Sub("Amazon" , 20);
      System.out.println(sb);
    }
}