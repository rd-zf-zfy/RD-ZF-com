public class test1 {
  public static void main(String args[]){
  new Thead(new Connet()).start();
  }
}
class Connet extends Runnable{
  public void run(){
    System.out.println("Hello World！")；
    System.out.println("大家好！")；
  }
}
