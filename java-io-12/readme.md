### [THEORY](https://github.com/markdown-it/markdown-it-abbr)

_Java Buffered Streams_

===> It uses the Internal buffer to store the data.

===> It is fast and more efficient.

===> It lies under the java.io package.

===> It is of two different types

a. BufferedInputStream

b. BufferedOutputStream

===> Example program:- **<u>Copy2.java</u>**

_Serializable and Deserializable_

1.  The process of storing the data object data into the file is called the serialization and the reverse is called the deserialization.

2.  The class must implement the Serializable interface to write it's objects into file.

3.  ObjectInputStream class with it's method readObject() along with ObjecOutputStream class with it's method writeObject() is used.

4.  Example program:- **<u>SerializeAndDeserialize.java</u>**

#

**DataInputStream and DataOutputStream**

- DataInputStream is used to read the primitive datatypes from an input source.
- DataOutputStream is used to write the primitive datatypes to an output source.

* We use the writeUTF() function to write a string to the output stream using UTF-8 encoding in portable manner.

- We use the readUTF() function to read a string of an input stream where UTF-8 encoding is used.

* These streams are located in java.io package.

- Example programs:- **<u>Student.java</u>** and **<u>Student2.java</u>**.
