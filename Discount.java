public class Discount extends Product {
  double discount;

  Discount(String name, int cost, int itemsLeft, double discount){
    super(name,cost,itemsLeft);
    this.discount = discount;
  }

  double getDiscount() {
    double returnDisc = getCost() - (getCost() * discount);
    return returnDisc;
  }
}
