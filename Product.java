class Product {
  private String name;
  private int cost;
  private int itemsLeft;

  Product(String name,int cost, int itemsLeft) {
    this.name = name;
    this.cost = cost;
    this.itemsLeft = itemsLeft;
  }
  //Customer using this one
  Product(){
  }
  int itemsLeft() {
    if (itemsLeft > 0) {
      itemsLeft -= 1;
    }
    else if (itemsLeft == 0) {
      System.out.println("Out of stock");
    }
    return this.itemsLeft;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }
  public int getCost() {
    return this.cost;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setItemsLeft(int itemsLeft) {
    this.itemsLeft = itemsLeft;
  }

  public int getItemsLeft() {
    return this.itemsLeft;
  }
}
