class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override   // annotation (optional but recommended)
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Dog();  
        a.sound();             
    }
}
