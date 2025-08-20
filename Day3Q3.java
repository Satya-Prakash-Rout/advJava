class Sub {
    int a = 10; 
    void show() {
        System.out.println( this.a);
    }
}

class Superclass extends Sub {
    void display() {
        super.show(); 
    }

    int add(final int x, final int y) {  
        return x + y;
    }
}

public class Day3Q3 {
    public static void main(String[] args) {
        final Superclass obj = new Superclass(); 
        obj.display(); 
        int result = obj.add(5, 10);
        System.out.println( result);
    }
}
