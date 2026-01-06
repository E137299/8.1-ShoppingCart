# 8.1-ShoppingCart

In this exercise, you will design and use a **ShoppingCart class** that manages a collection of `Item` objects. Instead of manipulating an `ArrayList` directly in `main`, your program will interact with a shopping cart object through well-defined methods.

The file **Item.java** is provided and models an item that can be purchased. Each `Item` has:

* a name
* a price
* a quantity

You will create a new class called **ShoppingCart**, then modify **Main.java** to use it.



## Part 1: Create the `ShoppingCart` Class

Create a file named **ShoppingCart.java** with the following requirements:

### Attributes

* An `ArrayList<Item>` to store the items in the cart

### Constructor

* A constructor that initializes the cart as an empty `ArrayList<Item>`

### Methods

Implement the following methods:

1. `public void addItem(Item item)`

   * Adds an item to the cart

2. `public void removeItem(String itemName, int quantity)`

   * Reduces the quantity of an item in the cart
   * If the quantity reaches 0, remove the item from the cart entirely

3. `public double getTotalCost()`

   * Returns the total cost of all items in the cart
   * Use the `getPrice()` and `getQuantity()` methods from the `Item` class

4. `public void printCart()`

   * Prints each item in the cart in a readable format
   * Prints the total cost at the end

---

## Part 2:`Main.java`

### Required Behavior

1. Instantiate a `ShoppingCart` object.
2. Use the `Scanner` class to allow the user to:

   * Add items to the cart
   * Remove items from the cart
3. After each action, display the current contents of the cart and their price.
4. Continue until the user chooses to stop shopping.




  
