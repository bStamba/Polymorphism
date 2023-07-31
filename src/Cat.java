public class Cat extends Animal implements Pet {

    @Override
    public void makeNoise() {
        System.out.println("Meoooow HISS");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void lickOwner() {
        System.out.println("Lick lick lick");
    }

    @Override
    public void askForFood() {
        System.out.println("Meow meow meow meow I want meow mix!");
    }
}
