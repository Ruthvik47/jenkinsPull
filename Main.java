public class Main{


    public int addition(int a, int b){
        return a+b;
    }


    public class SubMain{

    }

    public static void main(String[] args) {

        System.out.println("Hello world");
        Main main = new Main();
        Main.SubMain subMain =  main.new SubMain();


    }
}