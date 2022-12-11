package Java_Programs_Assignment;

abstract class Animal {
    protected int legs;

    protected Animal() {
    }

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    void walks() {
        if (legs < 1)
            System.out.println("This animal cannot walk");
        else
            System.out.println("Animal walks with " + legs);
    }
}

class Spider extends Animal {

    protected Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Spider eats insects and bugs");
    }
}

interface Pet {
    public String getName();

    public void setName(String name);

    public void play();
}

class Cat extends Animal implements Pet {
    String name;

    Cat(String name) {
        super(4);
        this.name = name;
    }

    Cat() {
        this("");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat plays with its owner");
    }

    @Override
    void eat() {
        System.out.println("Cat eats Rat");
    }
}

class Fish extends Animal implements Pet {
    String name;

    Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish plays with water");
    }

    @Override
    void eat() {
        System.out.println("Fish eats aquatic insects");
    }

}

public class programming_exersice_4 {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.setName("fish_mahesh");
        System.out.println("Name of the fish: " + d.getName());
        d.play();
        d.walks();
        d.eat();

        System.out.println("Name of the Cat: " + c.getName());
        c.eat();
        c.play();
        c.walks();

        a.walks();
        a.eat();
        e.eat();
        e.walks();
        p.play();
    }
}
