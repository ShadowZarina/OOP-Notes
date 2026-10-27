import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Hello! " + name);

        System.out.println("Guess a number (1-10): ");
        int number = scanner.nextInt();

        System.out.println("You inputted: " + number);
        Double luckyNumber = Math.random() * 10;
        int luck = luckyNumber.intValue();
        // type casting doesn't work due to loss of fractional precision
        // (in the compiler not the code)
        System.out.println("The lucky number is " + luck);

        if (number == luck) {
            System.out.println("Congratulations! You now have a flat 1 grade in OOP");
        } else {
            System.out.println("Yikes, " + name + ", wrong guess");
        }

        scanner.close();

        // FILE HANDLING

        try(BufferedWriter bw = new BufferedWriter(
                new FileWriter("sampleText.txt")
                // Makes a file called sampleText.txt
        )){
            bw.write("Rannzel, Grade 1.0");
            // writes the text on the file
        }catch (IOException ioException){
            System.out.println("ERROR  OCCURRED: " + ioException.getMessage());
        }

        try(BufferedReader br = new BufferedReader(
                new FileReader("sampleText.txt")
                // opens the text file
        )){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
                // prints out the line read from the file
            }
        }catch (IOException ioException){
            System.out.println("ERROR  OCCURRED: " + ioException.getMessage());
        }
        // sout + TAB = shortcut for output

        // WRITE TO AN OBJECT STREAM

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("testSerializedFile.ser"))){

            ArrayList<String> animalArrayList = new ArrayList<>();
            animalArrayList.add("Duck");
            animalArrayList.add("Lion");
            animalArrayList.add("Frog");

            oos.writeObject(animalArrayList);
        } catch (IOException fileNotFoundException) {
            System.out.println("Error Occurred: " + fileNotFoundException.getMessage());
        }

        // READ TO AN OBJECT STREAM

        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("testSerializedFile.ser"))){

            ArrayList<String> animalArrayListFromSerializedFile = new ArrayList<>();
            animalArrayListFromSerializedFile = (ArrayList<String>) ois.readObject();
            System.out.println(animalArrayListFromSerializedFile);
        } catch (Exception leNotFoundException){
            System.out.println("Error Occurred: " + leNotFoundException.getMessage());
        }

    }
}
