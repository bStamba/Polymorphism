public class Dog extends Animal implements Pet{

    //Constructor to initialize our pet with age and name.
    public Dog(int age, String name){
        super(age, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void lickOwner() {
        System.out.println("Lick lick lick");
    }

    @Override
    public void askForFood() {
        System.out.println("Woof woof woof woof gimme some canned food!");
    }
}
