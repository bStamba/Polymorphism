public class Cat extends Animal implements Pet {

    public Cat(int age, String name){
        super(age, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meoooow HISS");
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getAge() { return age; }

    @Override
    public void lickOwner() {
        System.out.println("Lick lick lick");
    }

    @Override
    public void askForFood() {
        System.out.println("Meow meow meow meow I want meow mix!");
    }
}
