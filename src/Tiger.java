public class Tiger extends Animal{

    public Tiger(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Roarrrr");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void hunt(){
        System.out.println("On the prowl.. hunting..");
    }
}
