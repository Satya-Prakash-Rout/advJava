class Supperclass{
    void display(){
        System.out.println("supper class");
    }
}

class Subclass extends Supperclass{
    void show(){
        System.out.println("Sub class");

    }
}
class childclass extends Subclass{
    void know(){
        System.out.println("child class");
    }
}
public class Advsjava{
    public static void main(String[] args){
        Supperclass sc= new Supperclass();
        Subclass sb= new Subclass();
        childclass cb= new childclass();
        sb.show();
        sb.display();
        cb.know();
    }
}