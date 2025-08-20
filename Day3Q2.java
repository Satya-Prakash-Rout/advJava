
class Sup {
    void show() {
        System.out.println("Car started");
    }
}

class SupperClass extends Sup {
    void display() {
        super.show();
        System.out.println("Car Stopped");
    }
}

public class Day3Q2 {
    public static void main(String[] args) {
        SupperClass sc = new SupperClass();
        sc.display();
    }    
}
