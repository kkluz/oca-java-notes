package chapter3;

import java.util.Date;

public class GarbageCollection {

//  A small flaw in the logic that manually empties or deletes the collection data structures can
//  allow small amounts of memory to be improperly reclaimed or lost forever. These small losses are called memory leaks,
//  and over many thousands of iterations they can make enough memory inaccessible that programs will eventually crash.

//  Java's garbage collector provides an automatic solution to memory management.
//  In most cases it frees you from having to add any memory management logic to your application.
//  The downside to automatic garbage collection is that you can't completely control when it runs and when it doesn't.

//  Whenever a software program executes (in Java, C, C++, Lisp, Ruby, and so on), it uses memory in several different ways.
//  It's typical for memory to be used to create a stack, a heap, in Java's case constant pools and method areas.
//  The heap is that part of memory where Java objects live,
//  and it's the one and only part of memory that is in any way involved in the garbage collection process.

//  So all garbage collection revolves around making sure the heap has as much free space as possible.
//  When the garbage collector runs, its purpose is to find and delete objects that cannot be reached.

//  When Does the Garbage Collector Run?

//  the JVM decides when to run the garbage collector.
//  the JVM will typically run the garbage collector when it senses that memory is running low.

//  How Does the Garbage Collector Work?
//  When does an object become eligible for garbage collection?

//  an object is eligible for garbage collection when no live thread can access it.

//  If our Java program has a reference variable that refers to an object
//  and that reference variable is available to a live thread, then that object is considered reachable.

//  Garbage collection cannot ensure that there is enough memory,
//  only that the memory that is available will be managed as efficiently as possible.

  public static void main(String[] args) {

//    Nulling a Reference
    StringBuffer sb = new StringBuffer("hello");
    System.out.println(sb);
    // The StringBuffer object is not eligible for collection
    sb = null;
    // Now the StringBuffer object is eligible for collection


//    Reassigning a Reference Variable
    StringBuffer s1 = new StringBuffer("hello");
    StringBuffer s2 = new StringBuffer("goodbye"); System.out.println(s1);
// At this point the StringBuffer "hello" is not eligible
    s1 = s2;
// Redirects s1 to refer to the "goodbye" object
// Now the StringBuffer "hello" is eligible for collection

//    When a method is invoked, any local variables created exist only for the duration of the method.
//    Once the method has returned, the objects created in the method are eligible for garbage collection.
//    There is an obvious exception, however. If an object is returned from the method,
//    its reference might be assigned to a reference variable in the method that called it;
//    hence, it will not be eligible for collection.
    Date d = getDate();
    System.out.println("d = " + d);
  }

  public static Date getDate() {
    Date d2 = new Date();
    StringBuffer now = new StringBuffer(d2.toString()); System.out.println(now);
    return d2;
  }

//  Forcing Garbage Collection
//  Garbage collection cannot be forced.
//  However, Java provides some methods that allow you to request that the JVM perform garbage collection.
//  The simplest way to ask for garbage collection (remember— just a request) is:
//  System.gc();
}
