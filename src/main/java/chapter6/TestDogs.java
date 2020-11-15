package chapter6;

// create and populate an ArrayList of Dog objects
// invoke a few "queries" on the ArrayList
// declare a couple of "query" methods

import java.util.*;
import java.util.function.Predicate;

public class TestDogs {

  public static void main(String[] args) {
    ArrayList<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("boi", 30, 6));
    dogs.add(new Dog("tyri", 40, 12));
    dogs.add(new Dog("charis", 120, 7));
    dogs.add(new Dog("aiko", 50, 10));
    dogs.add(new Dog("clover", 35, 12));
    dogs.add(new Dog("mia", 15, 4));
    dogs.add(new Dog("zooey", 45, 8));
    // run a few "queries"
    System.out.println("all dogs " + dogs);
    System.out.println("min age 7 " + minAge(dogs, 7).toString());
    System.out.println("max wght. " + maxWeight(dogs, 40).toString());

//    When we say d -> d.getAge() < 9—THAT is the lambda expression.
//    The d represents the argument, and then the code must return a boolean.
    dogQuerier(dogs, d -> d.getAge() < 9);

  }

  // declare "query" methods
  static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor) {
    ArrayList<Dog> result1 = new ArrayList<>(); // do a minimum age query
    for (Dog d : dogList) {
      if (d.getAge() >= testFor) // the key moment!
      {
        result1.add(d);
      }
    }
    return result1;
  }

  static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList, int testFor) {
    ArrayList<Dog> result1 = new ArrayList<>(); // do a max weight query
    for (Dog d : dogList) {
      if (d.getWeight() <= testFor) // the query expression
      {
        result1.add(d);
      }
    }
    return result1;
  }

/*//  We want to have a single querying method with a query expression passed in as an argument:
static ArrayList<Dog> dogQuerier(ArrayList<Dog> dogList,  *//*query expression*//*) {
  // do an "on the fly" query
  ArrayList<Dog> result1 = new ArrayList<>();
  for (Dog d : dogList) {
    if (  *//*query expression*//*) //the key moment!
    {
      result1.add(d);
    }
  }
  return result1;
}*/

//  Lambdas let us passing code as an argument.
//  java.util.function.Predicate interface has one nonconcrete method called test()
//  that returns a boolean.

  static ArrayList<Dog> dogQuerier(ArrayList<Dog> dogList, Predicate<Dog> expr) { // do an "on the fly" query
    ArrayList<Dog> result1 = new ArrayList<>();
    for (Dog d : dogList) {
      if (expr.test(d)) // the key moment!
      {
        result1.add(d);
      }
    }
    return result1;
  }
}


