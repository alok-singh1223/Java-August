public class Animal {
  private  int ears;
public Animal(){
    System.out.println("Animal is Born!!!");
}
public Animal(int ears){
    this.ears=ears;
}

public void randomFun(){
    System.out.println("This is a Random Function");
}
  public void setEars(int e){
      ears=e;
  }
  public int getEars(){
      return ears;
  }
}
