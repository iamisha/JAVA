![CHEESE!](isha11.jpg)

There are two types of packaged used in java

1.  AWT (Abstract Window Toolkit)
2.  Swing

#

3.  **AWT(Abstract Window Toolkit)** :-

           **Java AWT Hierarchy**

    ![CHEESE!](awt.png)

---> AWT is an API(Application Programming Interface) for creating Graphical User Interface(GUI) that allows programmers to develop window-based applications.

---> Java AWT components are platform dependent i.e components are displayed according to the view of OS.

---> AWT is heavyweight i.e its components are using the resources of OS.

---> java.awt package is used.

                              **Components**
            => All the elements like button, textfields, scroll bars are called components.

            =>In java awt, there are classes for each components as shown in above AWT Hierarchy.

            => In order to place every component in a particular position on a screen, we need to add them in a container.

#

                                **Container**

    => The container is the component in AWT that can contain another components like buttons, textfields, labels etc.

    => The class that extends Container class are also known as container such as frame, dialog and panel.

    => Types of containers :-

    a. Window
    b. Frame
    c. Dialog
    d. Panel
                                **Window**
    a.The window is the container that have no borders and menu bars.
    b. Must have to use frame, dialog or another window for creating a window.

                                **Frame**
    a. Frame is the container that contain the title bars. It can have other components like buttons, textfields, etc.

    b. Frame has maximaize and minimize buttons.

                                 **Dialog**
    a. It contains a top level window with a border and a title used to take some form of inputs from the user.

    b. It inherits the window class.

    c. It doesn't have maximize and minimize buttons.

- Here, `First.java` and `Second.java` program file fulfils the following requirements :-

![CHEESE!](awt1st.png)

- Here, `ActionListener1.java` program file fulfils the following requirements :-

![CHEESE!](actionlistner.png)

- Here, `ActionListener1.java` program file fulfils the following requirements :-

![CHEESE!](act22.png)
