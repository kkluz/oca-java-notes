## Chapter1: Declarations and Access Control
### Identifiers and Keywords
**Legal identifiers**  
The rules the compiler uses to determine whether a name is legal.  

**Oracle's Java Code Conventions**  
Oracle's recommendations for naming classes, variables, and methods.  

### Define Classes
**Source File Declaration Rules**
1. There can be only one public class per source code file.
1. Comments can appear at the beginning or end of any line in the source code
  file; they are independent of any of the positioning rules discussed here.
1. If there is a public class in a file, the name of the file must match the name
  of the public class.For example, a class declared as public class Dog
   { } must be in a source code file named Dog.java.
1. If the class is part of a package, the package statement must be the first line
  in the source code file, before any import statements that may be present.
1. If there are import statements, they must go between the package statement (if there is one) and the class declaration. If there isn't a package statement, then the import statement(s) must be the first line(s) in the source code file. If there are no package or import statements, the class
  declaration must be the first line in the source code file.
  import and package statements apply to all classes within a source code
  file. In other words, there's no way to declare multiple classes in a file and
  have them in different packages or use different imports.
1. A file can have more than one non-public class.
1. Files with no public classes can have a name that does not match any of the classes in the file.
