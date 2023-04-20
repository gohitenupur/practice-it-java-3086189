package _01_04;

import java.util.ArrayList;

public class MenuBuilder {
  public static void main(String[] args) {

    // Create a variable called menuTitle of type String and assign it the value "My
    // Dream Menu:".
    String menuTitle="My Dream Menu";
    System.out.println(menuTitle);

    // Print the menuTitle variable to the console.
    ArrayList menuTitle;
    // Create a variable called menu of type ArrayList.

    // Create a variable called starter of type MenuItem and pass in the name of
    // your favourite starter.
    MenuItem starter;
    starter.setTitle(menuTitle);

    // Add the starter variable to the ArrayList called menu.
    menu.add(starter)

    // Create a variable called mainCourse of type MenuItem and pass in the name of
    // your favourite main course.
    MenuItem mainCourse;
    mainCourse.setTitle("papad")

    // Add the mainCourse variable to the ArrayList called menu.
    ArrayList menu;
    menu.add(mainCourse);

    // Create a variable called dessert of type MenuItem and pass in the name of
    // your favourite dessert.
    MenuItem dessert;
    dessert.setTitle(menuTitle);

    // Add the dessert variable to the ArrayList called menu.
      menu.add(dessert);
    // Print the menu variable to the console.
    System.out.println(menu);
  }
}
