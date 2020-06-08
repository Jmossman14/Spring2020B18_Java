package Day47_Abstraction;

public class ClassNotes {/*

OOP Abstraction:
        Abstract method
        Abstract class
        Interface

Abstraction: hiding the implementation detail
        The method you created does not have any body (no statement in { })
        - you do this by creating an abstract method
        - You know the functionalities of a method, but you do not know how it will be executed

Abstract method: method without a body & meant to be overridden (allows sub classes to use this method how they see fit)
    AccessModifier abstractKEYWORD returnType methodName(); // there is no { code }
   ex:  public abstract void method1();

Selenium example (RemoteWebDriver example):
        you have seperate examples of browsers = Chrome,Firefox, Opera
        use abstract method in Super Class to allow subclasses flexibility with methods in Super Class
        precondition: abstract method must be created in Super class and inherited by sub classes

        RemoteWebDriver: (Super class) - this class will allow its subclasses to open and close browsers
              get(URL):

        Chrome extends RemoteWebDriver:
            get(URL): what is the functionality? - To open the Chrome Browser
            quit(): what is the functionality? - quits the Chrome Browser

       FireFox extends RemoteWebDriver:
            get(URL): what is the functionality? - To open the FireFox Browser
            quit(): what is the functionality? - quits the FireFox Browser

       Opera extends RemoteWebDriver:
            get(URL): what is the functionality? - To open the Opera Browser
            quit(): what is the functionality? - quits the Opera Browser

      If you create a new browser (class), do you need to create new methods?
            - No, you can inherit (extend) the super class and use the abstract methods that are in that class
            - Allows you to apply different functionalities/implementations to the abstract methods in super class
      Do you need to create these steps for every single Browser? NO; you can apply inheritance and method overriding


There are only 2 ways to achieve abstract method:
       1: Abstract class;   meant to be inherited & will not

        2: the Interface;

1: Abstract class;
        - Using the Abstract keyword in the Class signature line
            public abstract class  RemoteWebDriver
        - a class that we cannot create objects in
            cannot create
          When abstract class is extended by regular class:
                you MUST override the abstract methods of super class
          When abstract class is extended by abstract class:
                No need to override any abstract methods


* Do not mix FINAL & ABSTRACT = it does not work!
            - Abstract indicates that it will be inherited at some point
            - Final, restricts a class from being inherited
            * 2 different concepts; they do not MIX

Abstract class vs. non abstract class (regular class)

       non abstract:
            can not: abstract methods
            can: instance method/block/variable, static method/block,variable, constructors

        abstract:
            can not: cannot creat object
                    Cannot be final
            can: instance method/block/variable, static method/block,variable, constructors




























*/
}
