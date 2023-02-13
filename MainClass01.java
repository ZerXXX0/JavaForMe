package MainClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Deque;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import Product.Artist;
import Product.Author;
import Product.Book;
import Product.Director;
//import Product.Director;
import Product.Game;
import Product.Magazine;
import Product.Movie;
import Product.Music;
import Product.Product;
//import arrays_01.CustomerAdministration;
import interfacenya.Vehicle;
import khususInterface9.Bus;
import khususInterface9.Car;
import khususInterface9.Truck;
import processing.ShoppingCart;
import user.Address;
import user.Customer;
//import user.CustomerStorage;
import user.PremiumMember;

public class MainClass01{
	public static void main(String[] args) {
		Author bookAuthor = new Author();
		bookAuthor.setAuthorName("GGG");
		
		
		Book theBook = new Book();
		theBook.setAuthor(bookAuthor);
		theBook.setProductNumber("6969; ");
		theBook.setManufacturer("Not A Company; ");
		theBook.setTitle("How to not give a shit; ");
		String theBookDescription = theBook.getDescription();
		System.out.println("Book description");
		System.out.println(theBookDescription);
		
		Author bookAuthor2 = new Author();
		bookAuthor2.setAuthorName("FMS ");
		Magazine magazineBook = new Magazine();
		magazineBook.setAuthor(bookAuthor2);
		magazineBook.setManufacturer("TMT ");
		magazineBook.setProductNumber("50-0 ");
		magazineBook.setTitle("How to make people sleep ");
		magazineBook.setsubject("Magazine");
		String magazineBookDescription = magazineBook.getDescription();
		System.out.println("Book description");
		System.out.println(magazineBookDescription);
		
		
//		Director movieDirector = new Director();
//		movieDirector.setDirectorName("JK Lol");
//		Movie theMovie = new Movie();
//		theMovie.setManufacturer("Sony ");
//		theMovie.setProductNumber("666 ");
//		theMovie.setTitle("Happy Rotter ");
//		String theMovieDescription = theMovie.getDescription();
//		System.out.println("Movie description");
//		System.out.println(theMovieDescription);
		
		Artist musicArtist1 = new Artist();
		musicArtist1.setArtistName("Lil Shitty");
		Music theMusic = new Music();
		theMusic.setManufacturer("Goin Platinum ");
		theMusic.setProductNumber("99999 ");
		theMusic.setTitle("Little Piece of Shit");
		String theMusicDescription = theMusic.getTwitterDescription();
		System.out.println(theMusicDescription);
		
		
		Author bookAuthor3 = new Author();
		bookAuthor3.setAuthorName("Kebob");
		Book theBook002 = new Book();
		theBook002.setAuthor(bookAuthor3);
		theBook002.setManufacturer("EFC");
		theBook002.setProductNumber("99099");
		theBook002.setTitle("How to smash");
		String theBook002_Description = theBook002.getTwitterDescription();
		
		Product product001 = new Book();
		product001.setManufacturer("Kamvreto");
		product001.setProductNumber("001");
		product001.setTitle("How to beat the shit of man");
		
		Product product002 = new Game();
		product002.setManufacturer("AYO Sport");
		product002.setProductNumber("002");
		product002.setTitle("NBA Skreeet bytch");
		
		Product product003 = new Movie();
		product003.setManufacturer("Columbian Cartel Picture");
		product003.setProductNumber("003");
		product003.setTitle("The Great Escobar and The Snitch");
		
		Product product004 = new Music();
		product004.setManufacturer("Death Hoe");
		product004.setProductNumber("004");
		product004.setTitle("Snoop goin double murder");
		
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(product001);
		productList.add(product002);
		productList.add(product003);
		productList.add(product004);
		
		for(Product currentProduct : productList){
			String currentProductDescription = currentProduct.getTwitterDescription();
			System.out.println("Twitter description of this product : " + currentProductDescription);
		}
		
		
		Customer customer01 = new Customer();
		System.out.println(customer01.getMinimumOrderValue());
		System.out.println(customer01.getShoppingCart());
		
		//standard constructor
		String firstName = "Joe";
		String lastName = "Mama";
		String birthdate = "6-9-1969";
		String gender = "Male";
		Customer customer02 = new Customer(firstName, lastName, birthdate, gender);
		System.out.println("first name : " + customer02.getFirstName());
		System.out.println("last name : " + customer02.getLastName());
		System.out.println("birthdate : " + customer02.getBirthdate());
		System.out.println("gender : " + customer02.getGender());
		System.out.println(customer02.getMinimumOrderValue());
		System.out.println(customer02.getShoppingCart());
		
		//overloaded constructor
		String fName03 = "Jack";
		String lName03 = "Sparrow";
		Customer customer03 = new Customer(fName03, lName03);
		System.out.println("first name : " + customer03.getFirstName());
		System.out.println("last name : " + customer03.getLastName());
		System.out.println("birthdate : " + customer03.getBirthdate());
		System.out.println("gender : " + customer03.getGender());
		System.out.println(customer03.getMinimumOrderValue());
		
		ShoppingCart shoppingCart01 = new ShoppingCart();
		shoppingCart01.setOrderValue(69);
		customer03.setShoppingCart(shoppingCart01);
		System.out.println(customer03.getShoppingCart().getOrderValue());
		
		//copy constructor
		Customer customer03_backupCopy = new Customer(customer03);
		System.out.println(customer03_backupCopy.getFirstName());
		System.out.println(customer03_backupCopy.getLastName());
		System.out.println(customer03_backupCopy.getBirthdate());
		System.out.println(customer03_backupCopy.getGender());
		System.out.println(customer03_backupCopy.getMinimumOrderValue());
		System.out.println(customer03_backupCopy.getShoppingCart());
		
		customer03_backupCopy.getShoppingCart().setOrderValue(6969);
		System.out.println(customer03.getShoppingCart().getOrderValue());
		System.out.println(customer03_backupCopy.getShoppingCart().getOrderValue());
		
		//constructor & inheritance
		String lname01 = "Depp";
		String fname01 = "Joni";
		PremiumMember premiumCustomer = new PremiumMember(lname01,fname01);
		System.out.println(premiumCustomer.getFirstName());
		System.out.println(premiumCustomer.getLastName());
		System.out.println(premiumCustomer.getBirthdate());
		System.out.println(premiumCustomer.getGender());
		System.out.println(premiumCustomer.getMinimumOrderValue());
		
		//exception handling
		String lname04 = "Depp";
		String fname04 = "Joni";
		String bday04 = "1/1/1911";
		String gender04 = "Alpha Male";
		
		Customer customer04 = new Customer(lname04, fname04, bday04, gender04);
		System.out.println("first name " + customer04.getFirstName());
		System.out.println("last name " + customer04.getLastName());
		System.out.println("birthdate " + customer04.getBirthdate());
		System.out.println("Gender " + customer04.getGender());
		
		ShoppingCart shoppingCart04 = new ShoppingCart();
		shoppingCart04.setOrderValue(99);
		shoppingCart04.setProductQuantity(0);
		customer04.setShoppingCart(shoppingCart04);
		System.out.println("Customer bought " + customer04.getShoppingCart().getProductQuantity());
		System.out.println("Product value " + customer04.getShoppingCart().getOrderValue());
		
		//1st way
//		double averagePricePerProduct = customer04.getShoppingCart().pricePerProduct();
//		System.out.println("average price/product " + averagePricePerProduct);
//		if(averagePricePerProduct == -1){
//			System.out.println("invalid");
//		}
//		else{
//			System.out.println("price " + averagePricePerProduct);
//		}
		
		//2nd way & 3rd way
		try{
			double averagePricePerProduct = customer04.getShoppingCart().pricePerProduct();
			System.out.println("Price/product " + averagePricePerProduct);
		}
		catch(ArithmeticException ex){
			System.out.println("Warning error");
			System.out.println("Exception in MainClass.main");
			System.out.println(ex.getMessage());
		}
		
		//part 2 multiple exception kinda
		String lname05 = "Depp";
		String fname05 = "Joni";
		String bday05 = "1/1/1911";
		String gender05 = "Alpha Male";
		
		Customer customer05 = new Customer(lname05, fname05, bday05, gender05);
		System.out.println("first name " + customer05.getFirstName());
		System.out.println("last name " + customer05.getLastName());
		System.out.println("birthdate " + customer05.getBirthdate());
		System.out.println("Gender " + customer05.getGender());
		
		ShoppingCart shoppingCart05 = new ShoppingCart();
		shoppingCart05.setOrderValue(99);
		shoppingCart05.setProductQuantity(0);
		customer05.setShoppingCart(shoppingCart05);
		System.out.println("Customer bought " + customer05.getShoppingCart().getProductQuantity());
		System.out.println("Product value " + customer05.getShoppingCart().getOrderValue());
		
		try{
			double averagePricePerProduct = customer05.getShoppingCart().pricePerProduct();
			System.out.println("Price/product " + averagePricePerProduct);
			int[] myArray = {77, 88, 99};
			System.out.println("Accessing element of array[2] " + myArray[2]);
		}
		catch(ArithmeticException ex){
			System.out.println("Arithmetic Exception in MainClass.main");
			System.out.println(ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ArrayIndexOutOfBoundsException in MainClass.main");
			System.out.println(ex.getMessage());
		}
		catch(Exception ex){
			System.out.println("General exception in MainClass.main");
			System.out.println(ex.getMessage());
		}
		finally{
			System.out.println("Finally block");
		}
		
		//interface
		Vehicle vehicle01 = new Bus();
		Vehicle vehicle02 = new Car();
		Vehicle vehicle03 = new Truck();
		System.out.println("Honk");
		vehicle01.honk();
		vehicle02.honk();
		vehicle03.honk();
		
		//interface that implements a lot of shit
		Bus vehicle001 = new Bus();
		Car vehicle002 = new Car();
		Truck vehicle003 = new Truck();
		System.out.println("Move!");
		vehicle001.move();
		vehicle002.move();
		vehicle003.move();
		
		
		//toString() method
		Customer customerBaru01 = new Customer("manusia", "nama akhir", "6 June 1969", "male");
		System.out.println(customerBaru01.toString());
		
		//equals() method
		Customer customerBaru02 = new Customer("manusia", "nama akhir", "6 June 1969", "male");
		Customer customerBaru03 = new Customer("manusia", "nama akhir", "6 June 1969", "male");
		customerBaru02.setMinimumOrderValue(10);
		customerBaru03.setMinimumOrderValue(10);
		System.out.println("comparison 1: " + customerBaru01.equals(customerBaru02));
		System.out.println("comparison 2: " + customerBaru02.equals(customerBaru03));
		System.out.println("comparison 3: " + customerBaru03.equals(customerBaru01));
		System.out.println("comparison 1: " + (customerBaru01 == customerBaru02));
		System.out.println("comparison 2: " + (customerBaru02 == customerBaru03));
		System.out.println("comparison 3: " + (customerBaru03 == customerBaru01));
		Customer customerBaru04 = new Customer("nama");
		Customer customerBaru05 = new Customer("nama");
		System.out.println("comparison 4: " + customerBaru05.equals(customerBaru04));
		//dahlah
		
		//hashCode() method
		int hashCust01 = customerBaru01.hashCode();
		int hashCust02 = customerBaru02.hashCode();
		if(hashCust01 == hashCust02){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
		//compareTo() method
		String example01 = "Aaa";
		String example02 = "aaa";
		int comparison1 = example02.compareTo(example01);
		int comparison2 = example02.compareToIgnoreCase(example01);
		if(comparison1 == 0){
			System.out.println("same");
		}
		else if(comparison1 < 0){
			System.out.println("under the alphabet");
		}
		else if(comparison1 > 0){
			System.out.println("above the alphabet");
		}
		if(comparison2 == 0){
			System.out.println("same");
		}
		else if(comparison2 < 0){
			System.out.println("under the alphabet");
		}
		else if(comparison2 > 0){
			System.out.println("above the alphabet");
		}
//		System.out.println(comparison1);
//		System.out.println(comparison2);
		
		//shallow copy deep copy clone() method
//		Customer cust01 =  new Customer("Paul", "Walker", "01.Jan.1991", "Male");
//		Customer cust02 =  new Customer("Alan", "Walker", "31.Dec.1999", "Male");
//		Address address01 = new Address(696969, "Sin City", "Mofo St", 69);
//		Address address02 = new Address(666999, "Some City", "Mike Ock St", 99);
//		
//		cust01.setAddress(address01);
//		cust02.setAddress(address02);
//		
//		Customer cust03 = cust02;
//		cust03.setBirthdate("9.Apr.1998");
//		
//		Customer cust04 = (Customer)cust03.clone();
//		cust04.setBirthdate("6.Sep.1945");
//		
//		System.out.println("\ncust 02\n" + cust02.toString());
//		System.out.println("\ncust 03\n" + cust03.toString());
//		System.out.println("cust 04" + cust04.toString());
//		
//		cust03.getAddress().setHouseNumber(69);
//		System.out.println("\ncust 02\n" + cust02.toString());
//		System.out.println("\ncust 03\n" + cust03.toString());
//		System.out.println("cust 04" + cust04.toString());
		
		//ArrayList
		//add method
		ArrayList<Integer> myArray01 = new ArrayList<Integer>();
		myArray01.add(1);
		myArray01.add(1);
		myArray01.add(2);
		myArray01.add(3);
		myArray01.add(4);
		myArray01.add(5);
		
		System.out.println("Printing myArrayList01");
		for(int currentElementInArrayList : myArray01){
			System.out.println("currentElementInArrayList: " + "\n" + currentElementInArrayList + "\n");
		}
		System.out.println("\n");
		
		//remove() method
		int removedNumber = myArray01.remove(1);
		System.out.println("removedNumber=" + removedNumber);
		System.out.println("Printing myArray01");
		for(int currentElementInArrayList : myArray01){
			System.out.println("currentElementInArrayList: " + "\n" + currentElementInArrayList + "\n");
		}
		System.out.println("\n");
		
		//get() method
		int elementAtIndex4 = myArray01.get(4);
		System.out.println("elementAtIndex4: " + elementAtIndex4);
		
		//set() method
		int elementRemovedAtIndex3 = myArray01.set(3, 69);
		System.out.println("elementRemovedFromIndex4=" + elementRemovedAtIndex3);
		System.out.println("Printing myArrayList01");
		for(int currentElementInArrayList : myArray01){
			System.out.println("currentElementInArrayList: " + "\n" + currentElementInArrayList + "\n");
		}
		
		//LinkedList
		LinkedList<Integer> myLinked01 = new LinkedList<Integer>();
		//add method
		myLinked01.add(1);
		myLinked01.add(1);
		myLinked01.add(2);
		myLinked01.add(3);
		myLinked01.add(5);
		myLinked01.add(8);
		myLinked01.add(13);
		myLinked01.add(21);
		
		System.out.println("Printing myLinkedList01");
		for(int currentElementInLinkedList : myLinked01){
			System.out.println("currentElementInArrayList: " + "\n" + currentElementInLinkedList + "\n");
		}
		
		//remove() method
		int removedNumber02 = myLinked01.remove(3);
		System.out.println("Printing removed number" + removedNumber02);
		System.out.println("Printing myLinkedList01");
		for(int currentElementInLinkedList : myLinked01){
			System.out.println("currentElementInArrayList: " + "\n" + currentElementInLinkedList + "\n");
		}
		
		//get() method
		int getElement05 = myLinked01.get(5);
		System.out.println("Printing Element 5: " + getElement05);
		
		//set() method
		int setNumber03 = myLinked01.set(3, 96);
		System.out.println("Set : " + setNumber03);
		System.out.println("Printing myLinkedList01");
		for(int currentElementInLinkedList : myLinked01){
			System.out.println("currentElementInArrayList: " + "\n" + currentElementInLinkedList + "\n");
		}
		//set
		//treeset
		TreeSet<Integer> myTreeSet01 = new TreeSet<Integer>();
		myTreeSet01.add(7);
		myTreeSet01.add(14);
		myTreeSet01.add(21);
		myTreeSet01.add(28);
		myTreeSet01.add(35);
		myTreeSet01.add(42);
		myTreeSet01.add(48);
		myTreeSet01.add(56);
		myTreeSet01.add(63);
		myTreeSet01.add(70);
		
		System.out.println("First printing of myTreeSet01");
		for(int currentNumberTreeSet : myTreeSet01){
			System.out.println("currentNumberTreeSet" + currentNumberTreeSet);
		}
		System.out.println("\n");
		
		myTreeSet01.add(35);
		myTreeSet01.add(35);
		myTreeSet01.add(35);
		myTreeSet01.add(35);
		
		System.out.println("2nd printing after adding 4 35: ");
		for(int currentNumberTreeSet : myTreeSet01){
			System.out.println("currentNumberTreeSet: " + currentNumberTreeSet);
		}
		System.out.println("\n");
		
		ArrayList<Integer> myArray02 = new ArrayList<Integer>();
		myArray02.add(222);
		myArray02.add(444);
		myArray02.add(666);
		myArray02.add(888);
		myArray02.add(0001);
		
		System.out.println("First print of arraylist");
		for(int currentNumberArray02 : myArray02){
			System.out.println("currentNumberTreeSet: " + currentNumberArray02);
		}
		System.out.println("\n");
		
		myArray02.add(666);
		myArray02.add(666);
		myArray02.add(666);
		
		System.out.println("2nd print of arraylist after 3 666");
		for(int currentNumberArray02 : myArray02){
			System.out.println("currentNumberTreeSet: " + currentNumberArray02);
		}
		System.out.println("\n");
		
		TreeSet<Integer> myTreeSet02 = new TreeSet<Integer>();
		myTreeSet02.add(7);
		myTreeSet02.add(14);
		myTreeSet02.add(21);
		myTreeSet02.add(28);
		myTreeSet02.add(35);
		myTreeSet02.add(42);
		myTreeSet02.add(48);
		myTreeSet02.add(56);
		myTreeSet02.add(63);
		myTreeSet02.add(70);
		
		System.out.println("comparing set 1 & 2");
		System.out.println("equals method: " + myTreeSet01.equals(myTreeSet02));
		
		//string
		TreeSet<String> myTreeSet03 = new TreeSet<String>();
		myTreeSet03.add("Shut");
		myTreeSet03.add("The");
		myTreeSet03.add("Hell");
		myTreeSet03.add("Up");
		myTreeSet03.add("Byach");
		
		System.out.println("Printing myTreeSet03");
		for(String currentStringInTree : myTreeSet03){
			System.out.println("Current String: " + currentStringInTree);
		}
		System.out.println("\n");
		
		//hashset
		Set<Integer> myHashSet01 = new HashSet<Integer>();
		myHashSet01.add(5);
		myHashSet01.add(10);
		myHashSet01.add(15);
		myHashSet01.add(20);
		myHashSet01.add(25);
		myHashSet01.add(30);
		myHashSet01.add(35);
		myHashSet01.add(40);
		myHashSet01.add(45);
		myHashSet01.add(50);
		
		for(int currentHashSet : myHashSet01){
			System.out.println("current hash set" + currentHashSet);
		}
		System.out.println("\n");
		
		//hash set implementation irl
		Product book01 = new Book("Heri Poter", 12.5);
		Product book02 = new Book("UnderCover", 9.99);
		book01.toString();
		book02.toString();
		
		Set<Product> product0001 = new HashSet<Product>();
		product0001.add(book01);
		product0001.add(book02);
		
		for(Product descriptionInProduct : product0001){
			System.out.println("Product description" + descriptionInProduct);
		}
		
		//map
		Map<Integer, String> userMap = new HashMap<Integer, String>();
		userMap.put(1, "Mike Ock");
		userMap.put(2, "Joe Mama");
		userMap.put(3, "Lee K M'bowl");
		userMap.put(4, "Keys Mayeas");
		
		//testing key set with keySet() method
		Set<Integer> keySet01 = userMap.keySet();
		System.out.println("user id" + keySet01);
		for(int currentKeySet : keySet01){
			System.out.println("User id key set: " + currentKeySet);
		}
		System.out.println("\n");
		//testing its value with values() method
		Collection<String> valuesOfMap = userMap.values();
		System.out.println("Customer description: ");
		for(String currentValueOfMap : valuesOfMap){
			System.out.println("current customer description: " + currentValueOfMap);
		}
		System.out.println("\n");
		//entry set with entrySet() method
		Set<Entry<Integer, String>> setOfEntry = userMap.entrySet();
		System.out.println("Printing entries in the map");
		for(Entry<Integer, String> currentEntry : setOfEntry){
			Integer keyOfCurrentEntry = currentEntry.getKey();
			String valueOfCurrentEntry = currentEntry.getValue();
			System.out.println("Key: " + keyOfCurrentEntry);
			System.out.println("Value: " + valueOfCurrentEntry);
		}
		System.out.println("\n");
		
		//adding existed element
		userMap.put(2, "Mike Eck");
		System.out.println("After element added");
		for(Entry<Integer, String> currentEntryOfUserMap : setOfEntry){
			Integer keyOfCurrentEntry = currentEntryOfUserMap.getKey();
			String valueOfCurrentEntry = currentEntryOfUserMap.getValue();
			System.out.println("Key of current entry: " + keyOfCurrentEntry);
			System.out.println("Value of current entry: " + valueOfCurrentEntry);
		}
		
		//stack (LIFO)
		//add
		Deque<String> myStack01 = new ArrayDeque<String>();
		myStack01.addFirst("this is the first");
		myStack01.addFirst("this is the second");
		myStack01.addFirst("this is the third");
		myStack01.addFirst("this is the fourth");
		myStack01.addFirst("this is the fifth");
		myStack01.addFirst("this is the sixth");
		
		System.out.println("Printing myStack01");
		for(String currentWordFromTheStack : myStack01){
			System.out.println(currentWordFromTheStack);
		}
		System.out.println("\n\n");
		//peek / calling a value
		String peekedWord01 = myStack01.peekFirst();
		System.out.println("peekedWord: " + peekedWord01);
		System.out.println("the stack after peekFirst()");
		for(String currentWordFromTheStack : myStack01){
			System.out.println(currentWordFromTheStack);
		}
		System.out.println("\n\n");
		//remove
		String removedWord01 = myStack01.removeFirst();
		System.out.println("removed word: " + removedWord01);
		System.out.println("the stack after removeFirst()");
		for(String currentWordFromTheStack : myStack01){
			System.out.println(currentWordFromTheStack);
		}
		System.out.println("\n\n");
		
		//queue
		Queue<String> myQueue01 = new ConcurrentLinkedQueue<String>();
		myQueue01.add("first");
		myQueue01.add("second");
		myQueue01.add("third");
		myQueue01.add("fourth");
		myQueue01.add("fifth");
		for(String currentWordFromQueue : myQueue01){
			System.out.println(currentWordFromQueue);
		}
		System.out.println("\n\n");
		//offer method
		myQueue01.offer("firstly");
		myQueue01.offer("secondly");
		for(String currentWordFromQueue : myQueue01){
			System.out.println(currentWordFromQueue);
		}
		boolean addedSuccessfully_02 = myQueue01.offer("thirdly");
		if(addedSuccessfully_02 == true){
			System.out.println("Number added with offer() success!!");
		}else {
			System.out.println("error");
		}
		for(String currentWordFromQueue : myQueue01){
			System.out.println(currentWordFromQueue);
		}
		System.out.println("\n\n");
//		//remove & removeAll method
//		boolean removedValue = myQueue01.removeAll(myQueue01);
//		System.out.println("removed value: " + removedValue);
//		System.out.println("the queue now: ");
//		for(String currentWordFromQueue : myQueue01){
//			System.out.println(currentWordFromQueue);
//		}
//		System.out.println("\n\n");
//		//poll method
//		String removedElement;
//		try{
//			removedElement = myQueue01.poll();
//			System.out.println("removed Element: " + removedElement);
//		}
//		catch(NullPointerException nullPointerException){
//			System.out.println("there was null pointer" );
//			System.out.println(nullPointerException.getMessage());
//			System.out.println(nullPointerException.getLocalizedMessage());
//			
//		}
//		catch(Exception exc){
//			System.out.println("there was exception");
//			System.out.println(exc.getClass());
//			System.out.println(exc.getMessage());
//		}
		
		//element() and peek()
		String elemente = myQueue01.element();
		System.out.println("who is on frontline : " + elemente);
		for(String currentWordFromQueue : myQueue01){
			System.out.println(currentWordFromQueue);
		}
		System.out.println("\n\n");
		String peek = myQueue01.peek();
		System.out.println("who is on frontline: " + peek);
		for(String currentWordFromQueue : myQueue01){
			System.out.println(currentWordFromQueue);
		}
		System.out.println("\n\n");
//implementation coming soon
		
		
		//String
		String greeting = "hello world!";
		greeting = greeting + ", ";
		String output = greeting + "there're " + args.length
				+ " Transferred parameter";
		System.out.println(output);
		
		String empty = new String();
		String copy = new String("ori");
		char[] c = {'c', 'h', 'a', 'r'};
		String ofChars = new String(c);
		
		System.out.println("Parameterless constructor created the string empty=" + empty);//add  + "|" to test 
		System.out.println("Copy-constructor created the string copy=" + copy);
		System.out.println("String instance from char-array is ofChars=" + ofChars);
		System.out.println("\n");
		
		//transformation of primitive data type to string
		int a = 12;
		float b = 6.9f;
		
		String aString1 = "" + a;
		String bString1 = "" + b;
		
		String aString2 = String.valueOf(a);
		String aString3 = Integer.toString(a);
		String bString2 = String.valueOf(b);
		
		System.out.println("aString1=" + aString1);
		System.out.println("aString2=" + aString2);
		System.out.println("aString3=" + aString3);
		System.out.println("bString1=" + bString1);
		System.out.println("bString2=" + bString2);
		
		//transformation string to primitive data type
		String boolString = "true";
		boolean bool = Boolean.parseBoolean(boolString);
		
		String byteString = "69";
		byte byt = Byte.parseByte(byteString);
		
		String shortStr = "255";
		short shortString = Short.parseShort(shortStr);
		
		String intStr = "696969";
		int intString = Integer.parseInt(intStr);
		
		String floatStr = "6.969";
		float fStr = Float.parseFloat(floatStr);
		
		String doubStr = "69.69696969696969";
		double dStr = Double.parseDouble(doubStr);
		
		String noNumber = "aaaaa4612";
		
		try{
			int number = Integer.parseInt(noNumber);
		}catch(Exception exc){
			System.out.println("\nEXCEPTION!!");
			System.out.println("There is an exception!!");
			System.out.println("The exc.toString()=" + exc.toString());
			System.out.println("The exc.getMessage()=" + exc.getMessage());
			System.out.println("The exc.getLocalizedMessage()=" + exc.getLocalizedMessage());
			System.out.println("The exc.getClass()=" + exc.getClass());
			System.out.println();
		}
		
		System.out.println("Boolean parsed result bool=" + bool);
		System.out.println("Byte parsed result byt=" + byt);
		System.out.println("Short parsed result s=" + shortString);
		System.out.println("Integer parsed result i=" + intString);
		System.out.println("Float parsed result fl=" + fStr);
		System.out.println("Double parsed result d=" + dStr);
		
		//partial string comparation
		String fileName = "_2021123456781695.pdf_";
		if(fileName.endsWith(".pdf") == true){
			System.out.println("the format is pdf");
		}
		
		String currentYear = "2021";
		if(fileName.startsWith(currentYear) == true){
			System.out.println("The file name \"" + fileName + "\" starts with the current year " + currentYear);
		}
		
		String versionNumber = "1695";
		if(fileName.contains(versionNumber) == true){
			System.out.println("The file name \"" + fileName + "\" contains the version number " + versionNumber);
		}
		
		if((fileName.endsWith(".pdf") == true) 
				&& (fileName.startsWith(currentYear) == true)
				&& (fileName.contains(versionNumber) == true)){
			System.out.println("\n\n All three conditions are TRUE!! \n\n");
		}else{
			System.out.println("it aint true");
		}
		
		
		//partial String position
		int manufacturerStart = fileName.indexOf("_");
		int manufacturerEnd = fileName.lastIndexOf("_");
		System.out.println("manufacturerStart=" + manufacturerStart);
		System.out.println("manufacturerEnd=" + manufacturerEnd);
		
		//extracting a partial string with substring()
		int titleStart = fileName.indexOf("_");
		int titleEnd = fileName.lastIndexOf("_");
		System.out.println("titleStart=" + titleStart);
		System.out.println("titleEnd=" + titleEnd);
		String manufacturerName = fileName.substring(titleStart +1, titleEnd);
		System.out.println("manufacturerName=" + manufacturerName);
		
		//replacing partial string with replace
		String realManufacturerName = manufacturerName.replace("_", "");
		System.out.println("realManufacturerName=" + realManufacturerName);
		
		System.out.println("still manufacturerName=" + manufacturerName);
		
		//application of method equalsIgnoreCase()
		int pointPosition = fileName.lastIndexOf('.');
		//System.out.println(pointPosition);
		
		String fileEnding = fileName.substring(pointPosition +1);
		System.out.println(fileEnding);
		if(fileEnding.equalsIgnoreCase("pdf_") == true){
			System.out.println("The file ending is .pdf");
		}else{
			System.out.println("The file ending is not .pdf");
		}
		
		//comparison method of the string class
		String name1 = "doni";
		String name2 = "Dono";
		
		if(name1.compareToIgnoreCase(name2) < 0){
			System.out.println(name1 + " is located before " + name2 + " in the phone book");
		}
		else if(name1.compareTo(name2) > 0){
			System.out.println(name1 + " is located after " + name2 + " in the phone book");
		}
		else{
			System.out.println(name1 + " & " + name2 + "is the same");
		}
		
		
		//string buffer
		String salutation = "Mr. ";
		String lastName01 = "Joni";
		String greeting01 = "Welcome back, " + salutation + " " + lastName01;
		System.out.println("greetings sire " + greeting);
		
		String sectionDefinition = "XsectionDefinition, ";
		String sectionServiceDescription = "sectionServiceDescription, ";
		String sectionApplicationPermission = "sectionApplicationPermission, ";
		String sectionRestrictions = "sectionRestrictions, ";
		String sectionReservsations = "sectionReservsations, ";
		
		StringBuffer licenceAgreement = new StringBuffer();
		licenceAgreement.append(sectionDefinition);
		licenceAgreement.append(sectionServiceDescription);
		licenceAgreement.append(sectionApplicationPermission);
		licenceAgreement.append(sectionRestrictions);
		licenceAgreement.append(sectionReservsations);
		String eula = licenceAgreement.toString();
		System.out.println("eula = " + eula);
		
		//checking the capacity of string buffer
		int capacity = licenceAgreement.capacity();
		System.out.println("capacity=" + capacity);
		
		//extending the string buffer
		String extension = "This is an extension and it is very very fucking long ";
		licenceAgreement.append(extension);
		String secondEula = licenceAgreement.toString();
		System.out.println("secondEula = " + secondEula);
		capacity = licenceAgreement.capacity();
		System.out.println("after extension capacity=" + capacity);
		
		//testing other method
		char firstChar = licenceAgreement.charAt(0);
		System.out.println("firstChar= " + firstChar);
		
		//splitting string with split()
		String sentence = "'boom','bam','badabing','boom','bam','pow'";
		String[] separation = sentence.split("','");
		for(String value : separation){
			System.out.println(value);
		}
		
		//extended processing of csv line
		String center = sentence.substring(sentence.indexOf('\'') + 1, sentence.lastIndexOf('\''));
		System.out.println("center= " + center);
		System.out.println("\n");
		//another way
		int indexOfFirstQuotationMark = sentence.indexOf('\'');
		int indexOfLastQuotationMark = sentence.lastIndexOf('\'');
		String center01 = sentence.substring(indexOfFirstQuotationMark + 1, indexOfLastQuotationMark);
		System.out.println("center01= " + center01);
		
		String[] separation02 = center.split("','");
		for(String value : separation02){
			System.out.println(value);
		}
		
		System.out.println("\n");
		
		String firstSpell = separation02[0];
		String secondSpell = separation02[1];
		String thirdSpell = separation02[2];
		String fourthSpell = separation02[3];
		String fifthSpell = separation02[4];
		String sixthSpell = separation02[5];
		
		System.out.println(firstSpell);
		System.out.println(secondSpell);
		System.out.println(thirdSpell);
		System.out.println(fourthSpell);
		System.out.println(fifthSpell);
		System.out.println(sixthSpell);
		
		
		//date and time
		Date date01 = new Date();
		Date date02 = new Date(169,6,9,6,9,0);
		System.out.println(date01);
		System.out.println(date02);
		
		date01.setMonth(date01.getMonth() + 6);
		System.out.println("after 6 month: " + date01);
		
		long currentTimeMilisecond = System.currentTimeMillis();
		System.out.println("currentTimeMilisecond: " + currentTimeMilisecond);
		Date date03 = new Date(currentTimeMilisecond);
		System.out.println("date03: " + date03);
		
		//utilization of simple date format
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		
		String formattedDate = sdf.format(date01);
		System.out.println("new format: " + formattedDate);
		
		//parsing a date with SimpleDateFormate.parse() method
		String dateString = "06.09.2069";
		try{
			Date date = sdf.parse(dateString);
			String formatedDate01 = sdf.format(date);
			System.out.println("date after parsing date= " + date);
			System.out.println("before parsing/Test in class formated output formatedDate_01= " + formatedDate01);
		} catch(ParseException e){
			System.out.println("An exception occurred!!");
			System.out.println("e.getClass()=" + e.getClass());
			System.out.println("e.getMessage()=" + e.getMessage());
			System.out.println("e.getLocalizedMessage()=" + e.getLocalizedMessage());
		}
		
		//formatting with existing predefined instances
		Date date04 = new Date();
		DateFormat df;
		
		df = DateFormat.getDateInstance();
		System.out.println("Output 1=> df.format(date)=" + df.format(date04));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Output 2=> df.format(date)=" + df.format(date04));
		
		df = DateFormat.getTimeInstance();
		System.out.println("Output 3=> df.format(date)=" + df.format(date04));
		df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		System.out.println("Output 4=> df.format(date)=" + df.format(date04));
		
		df = DateFormat.getDateTimeInstance();
		System.out.println("Output 5=> df.format(date)=" + df.format(date04));
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.FULL);
		System.out.println("Output 6=> df.format(date)=" + df.format(date04));
		
		
		//calendar
		GregorianCalendar calendar01 = new GregorianCalendar();
		GregorianCalendar calendar02 = new GregorianCalendar(2069, 6, 9, 6, 9, 1);
		System.out.println(calendar01);
		System.out.println(calendar02);
		
		//setting attribute of GregorianCalendar objects
		calendar01.set(Calendar.YEAR, 2018);
		calendar01.set(Calendar.MONTH, Calendar.JUNE);
		calendar01.set(Calendar.DAY_OF_MONTH, 6);
		
		calendar02.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		calendar02.set(Calendar.HOUR_OF_DAY, 23);
		calendar02.set(Calendar.MINUTE, 59);
		calendar02.set(Calendar.SECOND, 59);
		
		System.out.println("calendar01: " + calendar01);
		System.out.println("Output 01 => calendar2=" + calendar02);
		System.out.println("Output 02 => calendar2=" + calendar02);
		System.out.println("Output 03 => calendar2=" + calendar02);
		
		//querying attribute of it
		int year = calendar01.get(Calendar.YEAR);
		int month = calendar01.get(Calendar.MONTH);
		int dayInMonth = calendar01.get(Calendar.DAY_OF_MONTH);
		System.out.println("\n\nBreakpoint 01 BEFORE calling the getter ==> calendar2=" + calendar02  + "\n\n");
		int weekday = calendar02.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n\nBreakpoint 02 AFTER calling the getter ==> calendar2=" + calendar02  + "\n\n");
		int hour = calendar02.get(Calendar.HOUR_OF_DAY);
		int minute = calendar02.get(Calendar.MINUTE);
		int second =calendar02.get(Calendar.SECOND);
		
		System.out.println("calendar1 year=" + year);
		System.out.println("calendar1 month=" + month);
		System.out.println("calendar1 dayInMonth=" + dayInMonth);
		System.out.println("calendar2 weekday=" + weekday);
		System.out.println("calendar2 hour=" + hour);
		System.out.println("calendar2 minute=" + minute);
		System.out.println("calendar2 second=" + second);
		
		//rolling forward single attributes of a GregorianCalendar
		GregorianCalendar dateLastPassChange = new GregorianCalendar();
		Date now = dateLastPassChange.getTime();
		System.out.println("Before rolling dateLastpasswordChange=> now=" + now);
		dateLastPassChange.roll(Calendar.MONTH, 10);
		Date nowPlusSixMonths = dateLastPassChange.getTime();
		System.out.println("After rolling dateLastpasswordChange=> nowPlusSixMonths=" + nowPlusSixMonths);
		
		int monthsToRollForward = -5;
		int yearsToBeRolledForward = 5;
		//step 1 get current month
		int currentMonth = dateLastPassChange.get(Calendar.MONTH);
		System.out.println("currentMonth: " + currentMonth);
		//step 2 add (totalAmountOfMonths + currentMonth)
		int totalAmountOfMonths = currentMonth + monthsToRollForward;
		//step 3 calculate the index of the target month
		int monthWhichWeReached = totalAmountOfMonths % 12;
		System.out.println("monthWhichWeHaveReached=" + monthWhichWeReached);
		//step 4 calculate the target year
		yearsToBeRolledForward = totalAmountOfMonths / 12;
		System.out.println("Calculated yearsToBeRolledForward=" + yearsToBeRolledForward);	
		if(monthWhichWeReached < 0){
			System.out.println("We are rolling back !! BEFORE adjustment yearsToBeRolledForward=" + yearsToBeRolledForward);
			yearsToBeRolledForward = yearsToBeRolledForward - 1;
			System.out.println("We are rolling back !! AFTER adjustment yearsToBeRolledForward=" + yearsToBeRolledForward);
		}
		//step 5: do the rolling
		dateLastPassChange.roll(Calendar.MONTH, monthsToRollForward);
		dateLastPassChange.roll(Calendar.YEAR, yearsToBeRolledForward);
		//step 6
		Date correctlyRolledDate = dateLastPassChange.getTime();
		System.out.println("After rolling the correctlyRolledDate=" + correctlyRolledDate);
		System.out.println("\n");
		
		//file system
		//enumerating root folder
		File[] roots = File.listRoots();
		for(File root: roots){
			System.out.println("Next root is:" + root);
		}
		
		//enumerating the content of folder
		for(File root: roots){
			System.out.println("Next root is:" + root);
			File[] files = root.listFiles();
			if(files != null){
				for(File file : files){
					System.out.println("file: " + file);
				}
			}else{
				System.out.println("no files in: " + root);
			}
		}
		
		//platform independent separator for directory hierarchy
		String sep = File.separator;
		String path = "C:" + sep + "folder name" + sep + "folder name" + sep;
		String path01 = "Flo Rida";
		System.out.println("the path is path: " + path);
		
		//method for querying file info
		File directory = new File(path);
		System.out.println(path + " exists: " + directory.exists());
		System.out.println(path + " isDirectory: " + directory.isDirectory());
		System.out.println(path + " isFile:  " + directory.isFile());
		System.out.println(path + " canRead: " + directory.canRead());
		System.out.println(path + " canWrite: " + directory.canWrite());
		System.out.println(path + " length: " + directory.length());
		System.out.println(path + " lastModified: " + (new Date(directory.lastModified())));
		
		File directory01 = new File(path01);
		System.out.println(path01 + " exist: " + directory.exists());
		System.out.println(path01 + " isDirectory: " + directory.isDirectory());
		System.out.println(path01 + " isFile:  " + directory.isFile());
		System.out.println(path01 + " canRead: " + directory.canRead());
		System.out.println(path01 + " canWrite: " + directory.canWrite());
		System.out.println(path01 + " length: " + directory.length());
		System.out.println(path01 + " lastModified: " + (new Date(directory.lastModified())));
		
		//generating the directories
		boolean success = processingdirectoryCreation();
		if(success == true){
			System.out.println("Directory created success");
		}else{
			System.out.println("failed");
		}
		
		//moving files with renameTo()
		File fileToMove = new File("C:\\file\\Moved.txt");
		boolean moved = moveImported(fileToMove);
		if(moved == true){
		System.out.println("File moved successfully");
		}else{
			System.out.println("failed");
		}
		
		//reading files
		String sep01 = File.separator;
		String path001 = "C:" + sep01 + "file" + sep01 + "Moved.txt";
		//Here is an illustration:
		//Stage 1          	Stage 2            Stage 3				Stage 4
		//{Input file} ==> {FileReader} ==> {BufferedReader} ==> {Your program}
		//stage 1
		File file = new File(path001);
		
		try{
			FileReader fileReader = new FileReader(file);//stage 2
			BufferedReader bufferedReader = new BufferedReader(fileReader);//stage 3
			
			//stage 4
			for(String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
				System.out.println("next line: " + line);
			}
			bufferedReader.close();
			fileReader.close();
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		//write
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String sep02 = File.separator;
		String path002 = "C:" + sep02 + "file" + sep + dateFormat.format(new Date()) + ".log";
		File file02 = new File(path002);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		LocalDateTime now02 = LocalDateTime.now();
		System.out.println(dtf.format(now02));  
		String reportdata ="This is a test for writing in a file current system time is:" + now;
		
//		try{
//			FileWriter fileWriter = new FileWriter(file02);
//			fileWriter.write(reportdata);
//			fileWriter.close();
//			
//			String path003 = "C:" + sep02 + "file" + sep + "counting star.txt";
//			File file03 = new File(path003);
//			FileWriter fileWriter01 = new FileWriter(file03);
//			for(int counter = 1 ; counter<=5000000 ; counter++){
//				String written = "star no. " + counter + "\n";
//				fileWriter01.write(written);
//			}
//			
//			fileWriter01.close();
//		}catch(IOException ex){
//			ex.printStackTrace();
//		}
		
		//copy before overwrite
		try{
			if(file.exists() == true){
				String pathOf_FileCopy = file.getAbsolutePath() + ".copy";
				File fileCopy = new File(pathOf_FileCopy);
				
				FileReader original = new FileReader(file);
				FileWriter copy01 = new FileWriter(fileCopy);
				
				//original.read()  - this method returns an integer 
				for(int character = original.read() ; character != -1 ;character = original.read()){
					System.out.println("Next character is:" + character);
					copy01.write(character);
				}//for
				
				copy01.close();
				original.close();
			}//if
			
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(reportdata);
			fileWriter.close();
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		
		
		//storing reading compressed
		try{
			BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(new File("compressed.txt") ))));
			for (int i = 0; i < 10; i++){
				w.write("hello no. " + i + "\n");
			}
			w.close();
			System.out.println("Compression END");
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		//decompressed reading
		try{
			System.out.println("Decompression START");
			BufferedReader x = new BufferedReader(new InputStreamReader(new InflaterInputStream(new FileInputStream(new File("compressed.txt")))));
			
			for(String s = x.readLine(); s != null ; s = x.readLine()){
				System.out.println(s);
			}
			
			x.close();
			System.out.println("Decompression END");
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		
		
	}//main
	private static boolean moveImported(File file){
		// TODO Auto-generated method stub
		String sep = File.separator;
		String path = "C:" + sep + "file" + sep;
		path = path + file.getName();
		
		File newLocation = new File(path);
		return file.renameTo(newLocation);
	}

	private static boolean processingdirectoryCreation(){
		// TODO Auto-generated method stub
		String sep = File.separator;
		String path = "C:" + sep + "file";
		File directory = new File(path);
		if(directory.exists() && directory.canWrite()){
			return true;
		}else{
			return directory.mkdirs();
		}
	}	
}//class