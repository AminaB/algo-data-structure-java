--- inheritance
parent = new child();
nb : method will call on the object. Here on the child class. But method has to be defined in parent

---- polymorphism
    mean same name, different actions.
    it achieves using overloading (compile time polymorphism, decision take in compile time) 
    and overriding (inheritance, run time polymorphism)

---- abstract class, concrete class
    we cannot create object of abstract class, but we can use it as reference.
    if class have at least one abstract method, this class has to be abstract.
    abstract method : no body for this method.
    sub class must override all abstract method in the parent.

--------- interface  ----   
    interface can have static method with body or default method
    we can define private method, to use it inside default method.    
    interface can extend another interface

----  Inner class -----------
    nested inner class : inner class can access element of outer class directly without creating an object, opposite is not allowed
    local inner class : class inside method 
    anonymous inner class : define class content when we create the object (new class(){}), those classes are usually abstract
    static inner class : can access only static member of outer class

----------static --------
    static bloc use when we want to initialise something : static{}
    static methods can only access static members

-------singleton ----------
    class which can create just a single object.

----- Multi Threading -------
    in fact, processor cannot execute things at same time, but alternatively, user feel like there are running simultaneously
    
    Multi programming : multiple users use same computer
    Multi tasking : running multiple task for one user
    Multi threading : things working simultaneously inside a SINGLE Application

    To achiev multithreading in java we use : extend thread class or implement Runnable Interface

    Thread can have priority (1 to 10 in java)
    Daemon thread : is backgroud thread with least priority. ex : garbage collector
    Synchronisation : fix probleme of ressource sharing in multi threading
    communication : use flag variable, wait() and notify() methods

--- java.lang package ------

    primitive : 
    int
    bool
    double
    char
    byte
    long
    float
    short

    String Buffer vs String builder:
    String buffer : you can add more char with append() or insert() in particular position, have some capacity.
                    Thread safe (cannot use by two thread simultaneously). slower
    String Builder : same as string builder, but not thread safe. faster

    Maths : https://github.com/mohammedabdulbari/Java-SE/blob/master/MathDemo.java

    Enum : content predefined final.

----------Annotation-------
    annotation can be used at class level, or method level
    In-Built Annotations

    @Override :
    @Deprecated : on a methode, it's mean this methode is deprecated

    @FunctionalInterface : if a interface content one method, it is called as functional interface
    if an interface content only one single method, it can be used to defined lambda exp

    @SuppressWarning : delete warning, ex: @SuppressWarning("deprecation")

    @SafeVarargs : on private and final method, it is for warning on a variable arguments of method
    Others : @Retention, @Documented :java doc, @target : where the nnotaton will be used, @Inherited, @Repeatbale
    Defined annotaions
    @interface MyAnno{
    }

-----Lambda exp--------------

    Lamnda cannot modify local variables of the method of the lambda.
    Lamnda can access and modify the variables of his class .

    we can user reference to defined a lambda. ex : System.out::println, String::compareTo

---- IO Stream---------

    buffer: is temporary memory area, buffering data somewhere, it is very useful, for exemple if receiver and sender don not have same speed.
    java.io
    Byte stream : InputSream, outPutStream
    character stream (2 bytes) : Reader, writer

    InputStream method : read, available, skip, mark, close,..
    OutputStream method : write, flush, close,...

    InputSequencestream : to use two file inputstream, data are from both. SIS= new  InputSequence(fis1, fis2)
    other stream : ByteArrayInputStream= new ByteArrayInputStream(byte[]);
                    ByteArrayOutputStream= new ByteArrayOutputStream(20);
                    CharArrayReader = new CharArrayReader(char[])
                    PipedStream : consumer and producer (like in multi threading sharing ressources)
    BufferedStreams :                