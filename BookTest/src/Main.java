import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Math", "Ali", 8748228, true);
        Book b2 = new Book("Computer", "adeel", 736488903, true);
        Book b3 = new Book("English", "Aleem", 65486295, true);
        Book b4 = new Book("Urdu", "Naseem", 6596876, false);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of the book you want to deal with:");
        String name = input.nextLine();
        if (name.equals("Math")) {
            while (true) {
                System.out.println("Press 1 to display the status of the book:");
                System.out.println("Press 2 to borrow the book:");
                System.out.println("Press 3 to return the book:");
                System.out.println("Press 4 to exit:");
                int choice = input.nextInt();
                if (choice == 1) {
                    b1.display();
                } else if (choice == 2) {
                    b1.borrowingBooks();
                } else if (choice == 3) {
                    b1.ReturningBook();
                } else if (choice == 4) {
                    return;
                }
            }
        } else if (name.equals("Computer")) {
            while (true) {
                System.out.println("Press 1 to display the status of the book:");
                System.out.println("Press 2 to borrow the book:");
                System.out.println("Press 3 to return the book:");
                System.out.println("Press 4 to exit");
                int choice = input.nextInt();
                if (choice == 1) {
                    b2.display();
                } else if (choice == 2) {
                    b2.borrowingBooks();
                } else if (choice == 3) {
                    b2.ReturningBook();
                }
                else if(choice ==4){
                    return;
                }
            }
        } else if (name.equals("English")) {
            while (true) {
                System.out.println("Press 1 to display the status of the book:");
                System.out.println("Press 2 to borrow the book:");
                System.out.println("Press 3 to return the book:");
                System.out.println("Press 4 to exit:");
                int choice = input.nextInt();
                if (choice == 1) {
                    b3.display();
                } else if (choice == 2) {
                    b3.borrowingBooks();
                } else if (choice == 3) {
                    b3.ReturningBook();
                } else if (choice == 4) {
                    return;
                }
            }
        } else if (name.equals("Urdu")) {
            while (true) {
                System.out.println("Press 1 to display the status of the book:");
                System.out.println("Press 2 to borrow the book:");
                System.out.println("Press 3 to return the book:");
                System.out.println("Press 4 to exit:");
                int choice = input.nextInt();
                if (choice == 1) {
                    b4.display();
                } else if (choice == 2) {
                    b4.borrowingBooks();
                } else if (choice == 3) {
                    b4.ReturningBook();
                } else if (choice == 4) {
                    return;

                }
            }
        }
    }
}
