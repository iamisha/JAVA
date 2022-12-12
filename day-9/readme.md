# CustomException / UserDefinedException

Question;- How can you create your own Exception in JAVA ? explain with program
Stepst to create a CustomException in JAVA:-

1. Make CustomException class extends from Exception class.

2. To store the Exception message locally in the class object, create one local variable message.

3. We are passing a String argument to the Constructor of the CustomException object.
   The Constructor set the argument String to the private String message.
4. toString() method is used to printout the Exception message.
5. Throw a UserDefinedException using try-catch block in the main method.
6. Exception program :- CustomException.java

# Question:- Create a class Student with name and semester as instance variable, also create CustomException class called SemesterException which will be thrown when the value assigned to the semester invalid.

answer:- in Test.java file in day-9 folder
