class Customer extends Product {
  int itemsBought;
  double totalCost;

  Customer (int itemsBought) {
    this.itemsBought = itemsBought;
    this.totalCost = totalCost;
  }

  int itemsBought() {
    itemsBought += 1;
    return itemsBought;
  }

  void get_itemsBought() {
    System.out.println("Items bought: " + itemsBought);
  }

  double addToCart(double inCartCost) {
    totalCost +=inCartCost;
    return totalCost;
  }

  void addToCartSum() {
    System.out.println("Money spent: " + totalCost);
  }
}
