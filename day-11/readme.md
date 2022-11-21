# JAVA I/O

![CHEESE!](javaio1st.jpg)

![CHEESE!](javaio.jpg)

![CHEESE!](java2nd.jpg)

**Streams in java are the sequence of bytes of undetermined length. It can be compared to water streams**

# FileInputStream and FileOutputStream class

**InputStream class can be used to read the data from a data file.**

**OutputStram class are used to write the data in a data file**
a. Used to read and write data in a file.
b. Prefer this when primitive datatype values are to be written.
c. For character oriented data, it's prefer to use FileReder and FileWriter class
d. For Byte oriented data, it's prefer to use FileOutputStram class and FileInputStream.

**e.Now let's see how we can read bytes from the file using the FileInputStream**

Solution see in **["FileInputStreamExample.java"]**

f. FileInputStream class doesn't make a new file for us if there is not present of the accessed file name.

g. FileOutputStrem class creates the new file for us if there is not present of the accessed file name.

**Question imp for exam:- Write a java program to read form one file and writes it's content to another file using the FileInputStream/FileOutputStream as well as the FileReader and FileWriter class.**

Solution see in **["ReadFromOneAndWriteInAnother.java"]** using FileInputStream/FileOutputStream

Solution see in **["ReadFromOneAndWriteInAnother2.java"]** using FileReader/FileWriter
