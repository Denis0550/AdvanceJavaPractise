package SDA_Generic_types_Tasks;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        Animal[] animal = {new Cat("Persian", 9), new Dog("German Shepard", "beef")};

        AnimaHouse<Animal> animals = new AnimaHouse<>(animal);
        System.out.println(Arrays.toString(animals.getAnimals()));

    }
}

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    private String favoriteFood;

    public Dog(String name, String favoriteFood) {
        super(name);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "favoriteFood='" + favoriteFood + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal {
    private int numberOfLives;

    public Cat(String name, int numberOfLives) {
        super(name);
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numberOfLives=" + numberOfLives +
                ", name='" + name + '\'' +
                '}';
    }
}

class AnimaHouse<T extends Animal> {
    T[] animals;

    public AnimaHouse(T[] animals) {
        this.animals = animals;
    }

    public T[] getAnimals() {
        return animals;
    }

    public void setAnimals(T[] animals) {
        this.animals = animals;
    }
}