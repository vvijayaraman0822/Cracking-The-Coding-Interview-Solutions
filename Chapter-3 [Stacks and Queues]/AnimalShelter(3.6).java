/* An animal shelter, which holds only dogs and cats, operates
 * on a strictly "first in, first out" basis. People must adopt
 * either the "oldest" (based on arrival time) of all animals at
 * the shelter, or they can select whether they would prefer a dog
 * or a cat (and will receive the oldest animal of that type). They
 * cannot select which specific animal they would like. Create a data
 * structure to maintain this system and implement operations such as
 * enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the
 * built in linked list data structure.
*/

import java.util.LinkedList;

public abstract class AnimalShelter {
    private static Integer order = 0;

    private static LinkedList<Dog> dogs = new LinkedList<>();
    private static LinkedList<Cat> cats = new LinkedList<>();

    public void enque(Animal animal) {
        if (animal != null) {
            animal.setOrder(order);
            order++; // keep incrementing order
        }

        // check which linkedlist it should go to and add appropriately
        if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        } else if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        }
    }

    public Animal dequeAny() {
        if (dogs.size() == 0) {
            dequeCat();
        }

        if (cats.size() == 0) {
            dequeDog();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlder(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    public Animal dequeDog() {
        return dogs.poll();
    }

    public Animal dequeCat() {
        return cats.poll();
    }

    public static class Animal {
        public Integer order;
        public String name;

        public Animal(String name) {
            this.name = name;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public boolean isOlder(Animal animal) {
            return this.order < animal.getOrder();
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }
    }
}


