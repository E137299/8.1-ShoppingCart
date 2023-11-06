import java.util.ArrayList;
// **********************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// **********************************************************************
import java.text.NumberFormat;

public class ShoppingCart{
	/*
	ATTRIBUTES: 
	- itemCount: total number of items in the cart
	- totalPrice: total price of items in the cart
	- capacity: current cart capacity
	- cart: an ArrayList holding Item objects
	*/

	/*
	CONSTRUCTOR: Creates an empty shopping cart with a capacity of 5 items.
	*/



	
	/*
	addToCart: Adds an item to the shopping cart.
	*/




	
	/*
	removeFromCart: Removes an item to the shopping cart.
	*/




	


	/*
 	increaseSize: Increases the capacity of the shopping cart by 3
  	*/





	

	/*
	toString: Returns the contents of the cart together with
	summary information. 
	*/
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String contents = "\nShopping Cart\n";
		contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
		for (int i = 0; i < itemCount; i++)
			contents += cart.get(i).toString() + "\n";
			contents += "\nTotal Price: " + fmt.format(totalPrice);
			contents += "\n";
		return contents;
	}
}