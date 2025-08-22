public class Day3Q6 {
    interface Printable {
        void print();
    }

    interface Showable {
        void show();
    }

    class Demo implements Printable, Showable {
        public void print() {
            System.out.println("Printing...");
        }
        public void show() {
            System.out.println("Showing...");
        }
    }
}
