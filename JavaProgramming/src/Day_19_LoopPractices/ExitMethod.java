package Day_19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            if(i==3){
               // break;
                System.exit(0);
            }
            System.out.println(i);
        }

        System.out.println("Fatih Balcı");
    }



}
