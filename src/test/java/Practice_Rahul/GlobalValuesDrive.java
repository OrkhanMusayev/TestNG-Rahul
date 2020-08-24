package Practice_Rahul;

import java.io.*;
import java.util.Properties;

public class GlobalValuesDrive {

    public static void main(String[] args) throws IOException {

        // Properties it is a class and comes from java
        Properties properties = new Properties(); // first need to create object of properties class
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Orkhan\\IdeaProjects\\TestNG_Rahul\\src\\test\\java\\Data.properties");
        // this class will take this path,FileInputStream needs to know where exactly file is located

        properties.load(fileInputStream); // this is basically doing connection between,loading
        System.out.println("properties.get(\"browser\") = " + properties.get("browser"));
        // read as chrome

        System.out.println("properties.get(\"url\") = " + properties.get("url"));
        // if we pass for example url it will read web site

        properties.setProperty("browser","firefox");
        // here we set the browser manually(i didn't go to the properties file)
        System.out.println("properties.get(\"browser\") = " + properties.get("browser"));
        // read as chrome

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Orkhan\\IdeaProjects\\TestNG_Rahul\\src\\test\\java\\Data.properties");
        // this class will go back to file, same class name just change from input to output
        properties.store(fileOutputStream,null); // to write note
        // what updates i did in code above will return back to file
        // as long as run the code will update in properties file,after run check properties file to understand


    }
}
