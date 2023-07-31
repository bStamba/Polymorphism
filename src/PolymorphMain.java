
public class PolymorphMain {
    public static void main(String[] args) {

        Cat kitty = new Cat();
        Dog doggy = new Dog();
        Horse horsey = new Horse();

        //Let's mess around with our cat methods.
        kitty.setAge(7);
        kitty.setName("DJ");
        kitty.sleep();
        kitty.makeNoise();
        kitty.askForFood();
        kitty.lickOwner();
        System.out.println("Our cat is named " + kitty.getName() + " and is " + kitty.getAge() + " years old.");
        System.out.println();

        //Let's mess around with our dog methods.
        doggy.setAge(5);
        doggy.setName("Flo");
        doggy.sleep();
        doggy.makeNoise();
        doggy.askForFood();
        doggy.lickOwner();
        System.out.println("Our dog is named " + doggy.getName() + " and is " + doggy.getAge() + " years old.");
        System.out.println();

        //Let's mess around with our horse methods.
        horsey.setAge(12);
        horsey.setName("Bulldozer");
        horsey.sleep();
        horsey.makeNoise();
        horsey.askForFood();
        horsey.lickOwner();
        System.out.println("Our horse is named " + horsey.getName() + " and is " + horsey.getAge() + " years old.");
    }
}