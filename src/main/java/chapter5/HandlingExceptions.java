package chapter5;

public class HandlingExceptions {

  public static void main(String[] args) {

//    The term exception means "exceptional condition"
//    and is an occurrence that alters the normal program flow.
//    When an exceptional event occurs in Java, an exception is said to be "thrown."
//    The code that's responsible for doing something about the exception
//    is called an "exception handler," and it "catches" the thrown exception.

//    The try is used to define a block of code in which exceptions may occur.
//    One or more catch clauses match a specific exception (or group of exceptions)
//    This block of code is called a "guarded region"

//    try {
//      getTheFileFromOverNetwork
//          readFromTheFileAndPopulateTable
//    }
//    catch(CantGetFileFromNetwork) {
//      displayNetworkErrorMessage
//    }

//    This pseudocode demonstrates how you typically work with exceptions.
//    Code that's dependent on a risky operation (as populating a table
//    with file data is dependent on getting the file from the network)
//    is grouped into a try block in such a way that if, say, the first operation fails,
//    you won't continue trying to run other code that's also guaranteed to fail.
//    In the pseudocode example,
//    you won't be able to read from the file if you can't get the file off
//    the network in the first place.

//    One of the benefits of using exception handling is that code to handle any particular exception
//    that may occur in the governed region needs to be written only once.

//    A finally block encloses code that is always executed at some point after the try block,
//    whether an exception was thrown or not. Even if there is a return statement in the try block,
//    the finally block executes right after the return statement is encountered and before the return executes.

//    1: try {
//      2: // This is the first line of the "guarded region". 3: }
//      4: catch(MyFirstException) {
//          5: // Put code here that handles this exception
//      6: }
//      7: catch(MySecondException) {
//          8: // Put code here that handles this exception
//      9: }
//      10: finally {
//        11:   // Put code here to release any resource we
//        12:   // allocated in the try clause
//        13: }
//      14:
//      15:   // More code here

//    finally clause is needed mostly for cleaning up resources e.g. closing files,
//    releasing sockets or any other clean-up

//    The following legal code demonstrates a try with a finally but no catch:
//    try {
//      // do stuff
//    } finally {
//      // clean up
//    }

//    The following legal code demonstrates a try, catch, and finally:
//    try {
//      // do stuff
//    } catch (SomeException ex) {
//      // do exception handling
//    } finally {
//      // clean up
//    }

//    The following ILLEGAL code demonstrates a try without a catch or
//finally:
//    try {
//      // do stuff
//    }
//    System.out.println("out of try block");

//    The following ILLEGAL code demonstrates a misplaced catch block:
//    try {
//      // do stuff
//    }
//    // can't have code between try/catch
//    System.out.println("out of try block");
//    catch(Exception ex) { }

//    A try clause by itself will result in a compiler error.

//    If a method doesn't provide a catch clause for a particular exception,
//    that method is said to be "ducking" the exception (or "passing the buck").

//    Method stack or a call stack:
//    The call stack is the chain of methods that your program executes to get
//    to the current method. If your program starts in method main()
//    and main() calls method a(), which calls method b(), which in turn calls method c(),
//    the call stack consists of the following:
//    c
//    b
//    a
//    main

//    Uncaught (ducked) exception drops down to the previous methods until it is caught
//    or until it reaches the very bottom of the call stack.
//    This is called "exception propagation."

//    Exceptions are always some subclass of java.lang.Exception
//    When an exception is thrown, an object of a particular Exception subtype is instantiated
//    and handed to the exception handler as an argument to the catch clause.

//    An actual catch clause looks like this:
//    try {
//      // some code here
//    }
//    catch (ArrayIndexOutOfBoundsException e) {
//      e.printStackTrace(); }

//    Exception class derives from the class Throwable
//    There are two subclasses that derive from Throwable: Exception and Error.
//    Classes that derive from Error represent unusual situations that are not caused by program errors
//    and indicate things that would not normally happen during program execution, such as the JVM running out
//    of memory. Generally, your application won't be able to recover from an Error,
//    so you're not required to handle them.

//    If the class specified in the catch clause does have subclasses,
//    any exception object that subclasses the specified class will be caught as well.

//    A single catchall exception leads to a situation when an exception is caught
//        that the handler does not know how to handle.
//    try {
//      // some code
//    }
//    catch (Exception e) {
//      e.printStackTrace(); }
//  }

//    When an exception is thrown, Java will try to find (by looking at the available catch clauses from the top down)
//    a catch clause for the exception type.
//    If it doesn't find one, it will search for a handler for a supertype of the exception. If
//    it does not find a catch clause that matches a supertype for the exception,
//    then the exception is propagated down the call stack.
//    This process is called "exception matching."

//    The handlers for the most specific exceptions must always be placed above those for more general (exceptions)
//    e.g. FileNotFoundException has to be listed before IOException.

//    Each method must either handle all checked exceptions by supplying a catch clause or list each unhandled checked exception as a thrown exception.
//    This rule is referred to as Java's "handle or declare" requirement (sometimes called "catch or declare").

//    RuntimeException, Error, and all their subtypes are unchecked exceptions, and unchecked exceptions do not have to be specified or handled.
//    Because RuntimeException is the superclass of NullPointerException, it is an unchecked exception and need not be declared.
//    Runtime exceptions are referred to as unchecked exceptions.
//    If you invoke a method that throws a checked exception but you don't catch the checked exception somewhere, your code will not compile.
//    That's why they're called checked exceptions: the compiler checks to make sure they're handled or declared.

//    To create your own exception, you simply subclass Exception (or one of its subclasses) as follows:
//    class MyException extends Exception { }
//    And if you throw the exception, the compiler will guarantee that you declare it as follows:
//    class TestEx {
//      void doStuff() throws MyException {
//        throw new MyException();  // Throw a checked exception
//      }
//    }

//    It is possible to catch an Error, but there is no action that can be done to fix it.
//    Errors do not have to be declared, but they can be,

//    After writing a code like this, you won't be able to even tell if the exception occurred,
//    because you will not see the stack trace.

//    Exceptions can be rethrown in the catch clause.
//    In this case you must handle and declare, as opposed to handle or declare.

//    Where Exceptions Come from
//    JVM exceptions - Those exceptions or errors that are either exclusively or most logically thrown by the JVM
//    Programmatic exceptions - Those exceptions that are thrown explicitly by application and/or API programmers

//    1.JVM-Thrown Exceptions

//    NullPointerException occurs when you attempt to access an object using a reference variable with a current value of null.
//    There's no way that the compiler can hope to find these problems before runtime. Take a look at the following:

//    class NPE {
//      static String s;
//      public static void main(String [] args) {
//        System.out.println(s.length()); }

//    The code will compile just fine, and the JVM will throw a NullPointerException when it tries to invoke the length() method.

//    It's possible to grow the stack so large that the OS runs out of space to store the call stack.
//    When this happens, you get a StackOverflowError.
//    The most common way for this to occur is to create a recursive method.
//    A recursive method invokes itself in the method body. Although that may sound weird,
//    it's a very common and useful technique for such things as searching and sorting algorithms.
//    Take a look at this code:
//
//    void go() {    // recursion gone bad
//      go();
//    }

//    Again, only the JVM knows when this moment occurs, and the JVM will be the source of StackOverflowError.

//    2. Programmatically Thrown Exceptions (Created by an application and/or API developer)

//    At some point long ago, some programmer wrote the java.lang.Integer class and created methods like parseInt() and valueOf().
//    That programmer wisely decided that if one of these methods was passed a String that could not be converted into a number,
//    the method should throw a NumberFormatException.

//    Exception,Description,Typically Thrown
//
//    "ArrayIndexOutOfBoundsException (this chapter)",Thrown when attempting to access an array with an invalid index value (either negative or beyond the length of the array).,By the JVM
//
//    "ClassCastException (Chapter 2)",Thrown when attempting to cast a reference variable to a type that fails the IS-A test.,By the JVM
//
//    IllegalArgumentException,Thrown when a method receives an argument formatted differently than the method expects.,Programmatically
//
//    IllegalStateException,"Thrown when the state of the environment doesn't match the operation being attempted—for example, using a scanner that's been closed.",Programmatically
//
//    "NullPointerException (Chapter 3)","Thrown when attempting to invoke a method on, or access a property from, a reference variable whose current value is null.",By the JVM
//
//    "NumberFormatException (this chapter)",Thrown when a method that converts a String to a number receives a String that it cannot convert.,Programmatically
//
//    ArithmeticException,Thrown when an illegal math operation (such as dividing by zero) is attempted.,By the JVM
//
//    "ExceptionInInitializerError (Chapter 2)",Thrown when attempting to initialize a static variable or an initialization block.,By the JVM
//
//    "StackOverflowError (this chapter)",Typically thrown when a method recurses too deeply. (Each invocation is added to the stack.),By the JVM
//
//    NoClassDefFoundError,"Thrown when the JVM can't find a class it needs, because of a command-line error, a classpath issue, or a missing .class file.",By the JVM



  }
}