
class Sub{
    private String name;
    private int age;
    void sbow(){
    System.out.println(name+" "+age );
    }
    public String setNAme(String name) {
    this.name = name;
    return this.name;
    }
    public int setAge(int age) {
    this.age = age;
    return this.age;
    }
    public String getName(){
    return this.name;
    }
    public void getAge(int age){
    System.out.println(this.age);
    }
    public String toString(){
    return name+" "+age;
    }


}

public class Day4Q1 {
    

public static void main(String[] args) {
    Sub sub = new Sub();
    sub.setNAme("Alice");
    sub.setAge(25);
    sub.sbow();
    System.out.println(sub.getName());
    sub.getAge(0);
    System.out.println(sub.toString());
}
}