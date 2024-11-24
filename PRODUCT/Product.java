package PRODUCT;

public class Product {
    private String ProductID;
    private String Name;
    private String TypeofProduct;
    private int Quantity;
    private String ExpiredDate;
    private static int count = 1;
    public Product() {
    }

    public Product(String name, String TypeofProduct, int Quantity, String ExpiredDate) {
        this.Name = name;
        this.TypeofProduct = TypeofProduct;
        this.ExpiredDate = ExpiredDate;
        this.Quantity = Quantity;
        this.ProductID = createProductID();
    }
    public String getProductID() {
        return ProductID;
    }

    public String getName() {
        return Name;
    }

    public String getTypeofProduct() {
        return TypeofProduct;
    }

    public String getExpiredDate() {
        return ExpiredDate;
    }

    public int getQuantity() {
        return Quantity;
    }

    
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTypeofProduct(String TypeofProduct) {
        this.TypeofProduct = TypeofProduct;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setExpiredDate(String ExpiredDate) {
        this.ExpiredDate = ExpiredDate;
    }

    public String createProductID() {
        return "PD" + (count++);
    }


    @Override
    public String toString() {
        return String.format("ProductID: %s, NameProduct: %s, Type: %s, Quantity: %d, Expried Date: %s",getProductID(), Name, TypeofProduct, Quantity, ExpiredDate);
    }
    
}
