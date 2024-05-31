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
    