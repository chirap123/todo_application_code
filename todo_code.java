import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private static List<String> currentList = new ArrayList<String>();

//initializing the cases

    public static void main(String[] args) {

        int menu1 = -1;
        while (menu1 != 0) {
            menu1 = menu();
            switch (menu1) {
            case 1:
                viewlist();
                break;
            case 2:
                addItem();
                break;
            case 3:
                removeItem();
                break;
            case 0:
                break;
            default:
                System.out.println("Enter your option");
            }
        }
    }

//options to be selected in the application

    public static int menu() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------");
        System.out.println("0. Exit from the program");
        System.out.println("1. View to-do list");
        System.out.println("2. Add item to the list");
        System.out.println("3. Remove item from the list");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        return choice;
    }

    //inializing the viewlist option

    public static void viewlist() {
        System.out.println();
        System.out.println("----------------------");       
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");


    }

    //inializing the adding option

    public static void addItem() {
        System.out.println("Add Item");
        System.out.println("----------------------");
        System.out.print("Enter an item: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        viewlist();
    }

    //inializing the removing option 

    public static void removeItem() {
        System.out.println("Remove Item");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to remove?");
        int index = scanner.nextInt();
        if((index-1)<0 || index>currentList.size()) {
            System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());            
        }else {
            currentList.remove(index-1);
        }
        System.out.println("----------------------");
        viewlist();


    }
}