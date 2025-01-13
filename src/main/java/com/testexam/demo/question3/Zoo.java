package com.testexam.demo.question3;

import java.util.List;

interface Animal {
    public void eat();
}

class Zoo {
    public Zoo(AnimalGroup animalGroup) {
        animalGroup.eat();
    }
}

class AnimalGroup {
    private List<Animal> animals;

    public void eat() {
        animals.forEach(Animal::eat);
    }

    public void add(Animal animal) {
        animals.add(animal);
    }
}

class Giraffe implements Animal {
    public void eat() {
        System.out.println("Giraffe eat grass.");
    }
}

class Panda implements Animal {
    public void eat() {
        System.out.println("Panda eat bamboo.");
    }
}
