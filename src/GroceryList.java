import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();
    public void addGroceryItem(String items){
        groceryList.add(items);
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + "items in your grocery list");
        for(int i=0; i< groceryList.size(); i++){
            System.out.println((i+1) + "." + groceryList.get(i));
        }

}
    // to modify list or replace items to the list
    public void modifyGroceryItems(int position, String newItems){
        groceryList.set (position, newItems);
        System.out.println("Grocery item" + (position+1) + " has been modified.");
    }

    // to remove an item on the list. retrive the item first

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    //create another method to query the Arraylist to find an item in our grocery list
    public String findItem(String searchItem){
       // boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }




}
