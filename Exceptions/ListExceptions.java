import java.util.ArrayList;

public class ListExceptions {

    public static void main(String[] args) { 
            ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("hello world");
            myList.add(48);
            myList.add("Goodbye World");
            for(int i = 0; i < myList.size(); i++) {
                //Exception Error
                try{Integer castedValue = (Integer) myList.get(i);
                    System.out.println("Try!");
                }
                catch (ClassCastException a){
                    System.out.println("Catch!");
                }
                } 
            
        }
    }

