public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public  Basket(int totalPriceLimit){
        limit = totalPriceLimit;
    }

    public void add(String name, int price){
        if(contains(name)){
            return;
        }
        if (totalPrice + price >= limit){
            return;
        }
    items = items + "\n" + name + " - " + price;
    totalPrice = totalPrice + price;
    }

    public int getTotalPrice (){
        return totalPrice;
    }

    public void clear(){
        items = "";
        totalPrice = 0;

    }

    public boolean contains(String name){
        return (items.contains(name));
    }

    public void print(String title){
        System.out.println(title);
        if (items.isEmpty()){
            System.out.println("Basket is empty");
        }else{
            System.out.println(items);
        }
    }
}
