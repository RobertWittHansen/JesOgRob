
public class GroceryItem
{
    private int id;
    private int price;
    private String itemName;

    // Construckter.
    public GroceryItem(int id, int price, String itemName)
    {
        this.id = id;
        this.price = price;
        this.itemName = itemName;
    }
    // Method id.
    public int getId() { return id; }
    public void setId() { this.id = id; }

    // Method price.
    public int getPrice() { return price; }
    public void setPrice() { this.price = price; }

    // Method itemName.
    public String getItemName() { return itemName; }
    public void setItemName() { this.itemName = itemName;}


    @Override
    public String toString()
    {
        return "Id: " + id + "Price: " + price + "ItemName: " + itemName;
    }

}
