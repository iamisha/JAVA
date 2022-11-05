# Constructors in java

A member function used to initialize an object while creating it. It's the main purpose of the Constructors in Java.

# why we need to difine the default constructor even if it is automatically defined by the compiler ?

okay!, the main reason we define the default constructor in code even it is automatically defined by the compiler is that we can assign any value to the instance variable ourselves.
if we dont define the default constructor, compiler will automatically assign the 0 or the null value to the instace variable that we have declared inside the class name.

# Parameterized constructor

A constructor throught which we can pass one or more parameters is called the parameterized constructor.

---> we can have more than one constructor in a class.

# Copy constructor

whenever we pass object reference to the constructor then it is called the copy constructor.

it's main purpose is that it copies all the contents of one object to another object.

# Private Constructor

in java, it is possible to write a constructor as private but acc to the rule we can't access private member outside of class.
Object should be created in same class.

syntax:-
class Class-Name{
privat Class-Name{
//code must be written here.
}
}

# this keyword in java

---> this keyword is the keyword in java which refers to the same current object inside a method or a constructor.
for example refer the ThisKey.java file

---> Whenever the name of instance and local vars both are same then our runtime environment JVM gets confused that which one is local var and which one is instance var, to avoid this problem we use this keyword.
for example: -
you can refer to the types of the javaconstructor fiels that are ParameterizeConst.java, CopyConst.java, PrivateConst.java, etc.

---> it is also used when we want to call the default constructor of it's own class
for example:-
refer the ThisKey_02.java file.

---> this keyword is also used when we want to call the parameterized constructor of it's own class.
for example: -
refer the Thiskey_03.java file.
