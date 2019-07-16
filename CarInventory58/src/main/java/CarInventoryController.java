import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public abstract class CarInventoryController {

    public static void main(String[] args) {


        //adding our ArrayList
        List<Car> cars = new ArrayList<Car>();


        //adding the default cars into the array list under the class Car
        cars.add(new Car("Gertrude", "Toyota", "Corrolla", 1999, "Red", 190000));
        cars.add(new Car("Jim", "Jeep", "Wrangler", 2008, "Red", 143000));
        cars.add(new Car("Timothy", "Jeep", "Patriot", 2011, "Green", 100000));
        cars.add(new Car("Old Betti", "Compad", "Thessalonika", 2000, "Purple", 25000));

        //opening message & opening menu
        System.out.println("Welcome to Alison's Car Inventory, the 2016 Runner Up for Worst Car Inventory Created On a Deadline! What would you like to do first?");
        System.out.println("1) I'd like to see all your cars.");
        System.out.println("2) Search the database by car.");
        System.out.println("3) I'd like to delete a car.");
        System.out.println("4) I'd like to add a car!");

        //main menu loop
        while (1 == 1) {
            Scanner scanner = new Scanner(System.in);
            int input45 = scanner.nextInt();


            if (input45 == 1) { //selection: see all cars

                //print out all cars in ArrayList, print main menu, exit loop and enter menu loop again :)
                System.out.println("Honestly, it's not that many cars, but here you go.." + "\n" + cars);
                System.out.println("\n" + "You've seen every car I have to offer you. What do you want to do now?");
                seeOptions();

            }

            if (input45 == 2) {
                System.out.println("Would you like to search by: ");
                System.out.println("1) MAKE");
                System.out.println("2) MODEL");
                System.out.println("3) COLOR");
                System.out.println("3) YEAR");
                System.out.println("5) MILES");

                Scanner scanner45 = new Scanner(System.in);
                int input49 = scanner45.nextInt();

                switch (input49) {
                    case 1:
                        System.out.println("Enter the make you are searching for: ");

                        //adds search term
                        Scanner scannerMake = new Scanner(System.in);
                        String makeSearched = scannerMake.next();

                        //goes through entire list
                        for (int i = 0; i < cars.size(); i++) {
                            //for (Object car : cars) {

                            if (cars.get(i).getMake().equals(makeSearched)) {
                                System.out.println(cars.get(i));

                            } else {
                                System.out.println(" ");
                                // do things
                            }
                        }
                        seeOptions();
                        break;
                    case 2:

                        System.out.println("Enter the model you are searching for:  ");

                        //adds search term
                        Scanner scannerModel = new Scanner(System.in);
                        String modelSearched = scannerModel.next();

                        //goes through entire list
                        for (int i = 0; i < cars.size(); i++) {
                            //for (Object car : cars) {

                            if (cars.get(i).getModel().equals(modelSearched)) {
                                System.out.println(cars.get(i));

                            } else {
                                System.out.println(" ");
                                // do things
                            }
                        }
                        seeOptions();
                        break;

                    case 3:
                        System.out.println("Enter the color you are searching for: ");

                        //adds search term
                        Scanner scannerColor = new Scanner(System.in);
                        String colorSearched = scannerColor.next();

                        //goes through entire list
                        for (int i = 0; i < cars.size(); i++) {
                            //for (Object car : cars) {

                            if (cars.get(i).getColor().equals(colorSearched)) {
                                System.out.println(cars.get(i));

                            } else {
                                System.out.println(" ");
                                // do things

                            }
                        }
                        seeOptions();
                        break;
                    case 4:
                        System.out.println("Enter the year you are searching for: ");

                        //adds search term
                        Scanner scannerYear = new Scanner(System.in);
                        int yearSearched = scannerYear.nextInt();

                        //goes through entire list
                        for (int i = 0; i < cars.size(); i++) {
                            //for (Object car : cars) {

                            if (cars.get(i).getYear() == yearSearched) {
                                System.out.println(cars.get(i));

                            } else {
                                System.out.println(" ");
                                // do things

                            }
                        }
                        seeOptions();
                        break;
                    case 5:
                        System.out.println("Enter the amount of milage on the inventory item you are searching for: ");

                        //adds search term
                        Scanner scannerMiles = new Scanner(System.in);
                        int milesSearched = scannerMiles.nextInt();

                        //goes through entire list
                        for (int i = 0; i < cars.size(); i++) {
                            //for (Object car : cars) {

                            if (cars.get(i).getMiles() == milesSearched) {
                                System.out.println(cars.get(i));

                            } else {
                                System.out.println(" ");
                                // do things
                            }
                            seeOptions();
                            break;

                            //finish input option 2 by directing back to main menu
                        }
                }
            }



            if (input45 == 3) { //deleting a car -- note, it lets me delete all but one car and then throws exception

                System.out.println("Please enter the ID number of the car you would like to delete.");

                //prints all cars currently in the array with their ID number, for loop includes any added cars :)
                for (int x = 0; x < cars.size(); x++) {

                    System.out.println("ID: " + x + cars.get(x));
                }
                //accepts ID number to delete car
                Scanner scanner1 = new Scanner(System.in);
                int k = scanner1.nextInt();
                cars.remove(k);

                //prints the car ID you chose to remove and then prints the list of remaining cars
                System.out.println("You chose to remove ID " + k + ". Here are your remaining cars:" + "\n" + cars);

                seeOptions();


            }

            if (input45 == 4) { //Selection from main menu: Add a new car
                Scanner scanner2 = new Scanner(System.in);

                //creates a new Car object
                Car car2 = new Car();

                //collects and assigns data to each Car property
                System.out.println("What is the make of this car?");
                String make = scanner2.nextLine();
                car2.setMake(make);

                System.out.println("What is the model of this car?");
                String model = scanner2.nextLine();
                car2.setModel(model);

                System.out.println("What is the year of this car?");
                int year = scanner2.nextInt();
                car2.setYear(year);

                System.out.println("What is the color of this car?");
                scanner.nextLine();
                scanner.nextLine();
                String color = scanner2.nextLine();
                car2.setColor(color);

                System.out.println("What are the miles traveled on this car?");
                int miles = scanner2.nextInt();
                car2.setMiles(miles);

                //prints out all the properties of the car you've added
                System.out.println("YOUR ADDED CAR: " + "MAKE: " + make + "MODEL: " + model + "YEAR: " + year + "COLOR: " + color + "MILES: " + miles);

                //adds your car to the ArrayList!
                cars.add(car2);

                //prints out your new car just to show that it's now added
                System.out.println("All cars in inventory:  " + "\n" + cars);

                //goes back to options, closes out of if and returns to run "while" loop again to continue the main menu options!
                seeOptions();


            }
            if (input45 > 4) { //if the user at the main menu inputs anything except for the four options given, they get sent right back.
                System.out.println("You definitely didn't enter a number in the list...try again." + "\n");
                seeOptions();
            }
        }
    }


    public static void seeOptions() {

        //The options:
        System.out.println("ALISON'S CAR INVENTORY");
        System.out.println("*** YOUR OPTIONS *** ");
        System.out.println("1) I'd like to see all your cars.");
        System.out.println("2) Search the database by car.");
        System.out.println("3) I'd like to delete a car.");
        System.out.println("4) I'd like to add a car!");

    }


}
