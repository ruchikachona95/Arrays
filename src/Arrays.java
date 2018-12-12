import java.util.Scanner;
import java.util.InputMismatchException;

public class Arrays {

	public static void main(String[] args) {

		Numbers num1 = new Numbers();
		int option = 0;
		boolean opt1 = false;
		boolean opt2 = false;
		Scanner input = new Scanner(System.in);

		do {
			try {
				System.out.println("1 ... Create array with new size");
				System.out.println("2 ... Generate random numbers and store it in the array");
				System.out.println("3 ... Search and display number of occurrences");
				System.out.println("4 ... Display array");
				System.out.println("5 ... Quit");

				option = input.nextInt();

				if(option == 1){
					System.out.println("Enter required size: ");
					num1 = new Numbers(input.nextInt());
					opt1 = true;
					opt2 = false;
				}

				else if(option == 2){
					if(opt1 == false){
						System.out.println("Please create an array. ");
						continue;
					}
					num1.generateNumbers();
					opt2 = true;
				}

				else if(option == 3){
					if(opt1 == false){
						System.out.println("Please create an array and generate random numbers first");
						continue;
					}
					else if(opt2 == false){
						System.out.println("Please generate random numbers first");
						continue;
					}
					int number;

					System.out.println("Enter the number to be searched: ");
					number = input.nextInt();

					System.out.println("Number of occurrences of " + number + " in the array is " + num1.count(number));				
				}

				else if(option == 4){
					if(opt1 == false){
						System.out.println("Please create an array and generate random numbers first");
						continue;
					}
					else if(opt2 == false){
						System.out.println("Please generate random numbers first");
						continue;
					}
					System.out.println(num1.toString());
				}

				else if (option == 5)
					continue;

				else
					System.out.println("Invalid choice.... try again");
			}

			catch(InputMismatchException inputMismatch){
				System.out.println("Error... Please try again. \nMain menu:");
				input.next();
			}

		} while(option != 5);

		System.out.print("See you again.");
	}		
}



