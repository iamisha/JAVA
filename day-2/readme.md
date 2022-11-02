# Datatypes in java programming

Data types are of two different types

1. Primitive datatypes:- Primitive datatypes are those datatyeps that are already declared. There are 8 primitive datatypes supported by java that are:-

   a. byte
   --> value ranges from -128 to 127
   --> takes 1 byte
   --> default value is 0

   b. short
   --> value ranges from (-2^16)/2 to 2^16-1
   --> takes 2 byte
   --> default value is 0

   c. int
   --> value ranges from (-2^32)/2 to 2^32-1
   --> takes 4 byte
   --> default value is 0

   d. float
   --> value ranges is beyound our discussion
   --> takes 4 byte
   --> default value is 0.0f

   e. long
   --> value ranges from (-2^64)/2 to 2^64-1
   --> takes 8 byte
   --> default value is 0

   f. double
   --> value ranges is beyond our discussion
   --> takes 8 bytes
   --> default value is 0.0d

   g. bool
   --> value can be true or false
   --> size depends on java virtual machine
   --> default value is false.

   h. char
   --> value ranges from 0 to 65535(2^16-1)
   --> takes 2 bytes in this case because it supports unicode i.e ASCII code.
   --> default value is 0.

2. Non-Primitive datatypes: Non primitive datatypes are those datatypes that are derived from the primitive datatypes.

# Question of the day

Write a java program to add three numbers
(answer is in addthreenum.java)

# variable

definition:-
A variable is a container that stores a value.These values can be changed during the execution of the program

there are rules for declaring a variable name that are very common as we read in c and c++.

# Literals

A constant value which can be assigned to the variable is called as a literal.
101 --> integer literal
10.1f --> float literal
10.f --> double literal by default
'A' --> character literal
true --> boolean literal
"Isha" --> string literal

# keywords

words that are reserved and used by the java compiler. They can't be used as an identifier.

# Reading data from the keyboard

In order to read the data from keyboard, java has the class called 'Scanner'. It has the method to read the data from teh keyboard.

for example:- Scanner s = new Scanner(System.in)-> System.in reads from the keyboard

int a = s.nextInt();-> method to read integer fromt the keyboard.
