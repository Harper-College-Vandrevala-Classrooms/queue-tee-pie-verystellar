package com.csc;
import java.util.ArrayList;
public class QueueTees {
ArrayList<Cutie> queue = new ArrayList<>();
int max_size = 50;
void enqueue(Cutie c) {
  if(queue.size() >=  max_size) {
    System.out.println("Queue is full");
    return;
  }
  queue.add(c);
}
Cutie dequeue() {
  Cutie c = queue.get(0);
  queue.remove(0);
  return c;
}

int size() {
  return queue.size();
}
  public static void main(String[] args) {
    // Create a bunch of objects that conform to the Cutie interface
    Puppy puppy = new Puppy();
    Kitty kitty = new Kitty();
    PygmyMarmoset marmoset = new PygmyMarmoset();

// Create a queue data structure
    QueueTees queue = new QueueTees();

// The size of the queue should equal zero since there are no objects in it
    int i = queue.size();
    System.out.println("Size: " + i);

// Add the cuties to the queue
    queue.enqueue(puppy);
    queue.enqueue(kitty);
    queue.enqueue(marmoset);

// The size of the queue should equal three since there are three objects in it
    i = queue.size();
    System.out.println("Size: " + i);

// The first dequeue should return the puppy
    Cutie a = queue.dequeue();
    System.out.println(a.description());

// The second dequeue should return the kitty
    Cutie b = queue.dequeue();
    System.out.println(b.description());

// The first dequeue should return the pygmy marmoset
    Cutie c = queue.dequeue();
    System.out.println(c.description());
    i = queue.size();
    System.out.println("Size: " + i);

    for (int j = 0; i < 50; i++){
      queue.enqueue(puppy);
    }
    System.out.println("Size: " + queue.size());
    //full list
    queue.enqueue(kitty);
    //should be full
  }
}
