import java.util.*;

public class ConvertionOfList {

public static void main(String[] args) {

ArrayList<String> myList = new ArrayList<String>();
myList.add("Grocery");
myList.add("Sleep");

LinkedList<String> convertedList = convertToLinkedList(myList);
System.out.print(convertedList.getFirst());

}

public static <T> LinkedList<T> convertToLinkedList(ArrayList<T> myList){
LinkedList<T> myLinkList = new LinkedList<>(myList);
return myLinkList;
} 

}