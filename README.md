# 8.1-ShoppingCart



In this exercise you will create a class that implements a shopping cart as an array of items. The file Item.java contains the definition of a class named Item that models an item one would purchase. An item has a name, price, and quantity (the quantity purchased). The file ShoppingCart.java implements the shopping cart as an arraylist of Item objects.

1. Complete the ShoppingCart class by doing the following:
- Declare an instance variable cart to be an arraylist of Items and instantiate cart in the constructor to be an array holding capacity Items.
- Fill in the code for the increaseSize method. Your code should double the size just increase it by 3 elements.
- Fill in the code for the addToCart method. This method should add the item to the cart and update the totalPrice instance variable (note this variable takes into account the quantity).
- Compile your class.
<br></br>
<br></br>
2. Write a program that simulates shopping. The program should have a loop that continues as long as the user wants to shop. Each time through the loop read in the name, price, and quantity of the item the user wants to add to the cart. Shoppers should be given the option to remove items from the cart. After adding or removing an item to the cart, the cart contents should be printed. After the loop print a "Please pay ..." message with the
total price of the items in the cart. 
  
  
