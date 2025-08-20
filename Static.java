 public class Static {
    void show() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Static a = new Static();  
        a.show();
    }
}
