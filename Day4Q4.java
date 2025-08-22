

public class Day4Q4 {
    public static void main(String[] args) {
        int a = 10;
        String name = null;
        try{
            if(a>0){
                System.out.println(a/0);
                System.out.println(name.length());
            }
        }
        catch(Exception e){
            System.out.println("You can't devide");
        }
    }
    
}
