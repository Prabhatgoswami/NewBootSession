public class ReplaceString {
public static void main(String[] args){
    String name="Hello Prabhat ! That's Your New String"; // Original String
    //Firstly I am Replacing Hello with "Hey"
    System.out.println(name.replace("Hello","HEY"));

    //I am taking another string to replace all the strings
    String newname="hehehehe";
    System.out.println(newname.replaceAll("e","a"));
    //It Will replace the first occurence of "e" from "i"
    System.out.println("New String which will replace First occurrence : "+newname.replaceFirst("e","i"));

    //It will show that String.replace will not modify or change the original String
    System.out.println(name);
}
}

