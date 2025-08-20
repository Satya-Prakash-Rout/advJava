class Sup {
    String name = "Default";
    int age = 0;
    int ph = 12;
    Sup(String name,int age){
        this.name = name ;
        this.age = age;
    }
    Sup(String name,int age,int ph){
        this.name = name;
        this.age = age;
        this.ph = ph;
    }
    void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", Phone: " + ph);
    }
}



public class Day3Q4 {
    public static void main(String[] args) {
        Sup sp=new Sup("Amazon",23);
        sp.show();
    }
}
