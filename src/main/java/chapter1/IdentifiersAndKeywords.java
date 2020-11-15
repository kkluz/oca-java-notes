package chapter1;

public class IdentifiersAndKeywords {

  public static void main(String[] args) {
    //Legal identifiers
    //They must start with a letter, currency character or a connecting character
    int _a;
    int $c;
    int ___2_w;
    int _$;
    int detailed_identifier;

    //The ones above are legal identifiers, however SonarLint is showing that they are not matching the regular expression '^[a-z][a-zA-Z0-9]*$'.

    //Illegal identifiers
    /*int :b;
    int -d;
    int e#;
    int .f;
    int 7g;*/

    //Java Keywords which also cannot be used as identifiers
    /*abstract, assert,  boolean, break, byte, case, catch, char, class, const, continue,
    default, do, double, else, enum, extends, final, finally, float, for, goto, if, implements,
    import, instanceof, int, interface, long, native, new, package, private, protected, public,
    return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient,
    try, void, volatile, while*/

    //Naming standards:
    //Classes - CamelCase, typically nouns e.g. Account, PrintWriter
    //Interfaces - CamelCase, typically adjectives e.g. Runnable, Serializable
    //Methods - first letter lowercase, and then CamelCase, verb-noun pairs e.g. getBalance, doCalculation
    //Variables - first letter lowercase, and then CamelCase, short, meaningful names e.g. buttonWidth
    //Constants - created by making variables static and final, uppercase letters with underscore as separator e.g. MIN_HEIGHT

  }

}
