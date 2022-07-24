import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, ArrayList<Integer>> vehicles = new HashMap<String, ArrayList<Integer>>();

        // Vehicles
        vehicles.put("Mercedez-Benz AMG", new ArrayList<Integer>(Arrays.asList(2018, 2019, 2020)));
        vehicles.put("Toyota Supra", new ArrayList<Integer>(Arrays.asList(2008, 2015)));
        vehicles.put("Lamborghini Gallardo", new ArrayList<Integer>(Collections.singletonList(2019)));
        vehicles.put("Bugatti Veyron", new ArrayList<Integer>(Arrays.asList(2017, 2018, 2019)));
        vehicles.put("Infinity G35", new ArrayList<Integer>(Arrays.asList(2006, 2012, 2021)));
        
        Scanner scan = new Scanner(System.in);
        System.out.printf("Hello! Welcome to Lee's AutoDealer. What vehicles make/model are you looking for today?\n");
        String data = scan.nextLine();

        if(vehicles.containsKey(data)) {
            System.out.println("Oh, you're looking for a " + data + "?");
            System.out.println("Here are our vehicles. Each one costs a million dollars!");
            ArrayList<Integer> list = vehicles.get(data);

            for (Integer make : list) {
                System.out.println("Make/Model: " + data + " year: " + make);
            }
        }else {
            System.out.println("Sorry we currently do not have any " + data + " vehicle");
            System.out.printf("Are there any other vehicles that you might be interested in?");
        }
	}
	
}
