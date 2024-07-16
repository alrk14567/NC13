package types;

public class Cow implements IAnimal{
    @Override
    public void info(){
        System.out.println("소는 한우가 맛있습니다.");
    }
    @Override
    public void makeSound() {
        System.out.println("음메");
    }
    @Override
    public void move() {
        System.out.println("소가 움직입니다.");
    }
}
