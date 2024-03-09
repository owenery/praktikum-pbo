public class Product {
    //atribut
    private String name;
    private Integer stock;
    private Integer price;

    //method
    public Product() {
        name = "";
        stock = 0;
        price = 0;
    }

    public Product(String name, Integer stock, Integer price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public Integer getStock(){
        return stock;
    }

    public Integer getPrice(){
        return price;
    }

    public void setName(String name){
        assert(this.name != ""): "Nama tidak boleh kosong";
        this.name = name;
    }

    public void setStock(Integer stock){
        assert(this.stock >= 0): "Stock tidak boleh negatif";
        this.stock = stock;
    }

    public void setPrice(Integer price){
        assert(this.price > 0): "Harga harus lebih dari 0";
        this.price = price;
    }

    public void purcaseProduct(Integer quantity){
        assert(this.stock >= quantity): "Jumlah kuantiti harus kurang dari atau sama dengan jumlah stok";
        this.stock -= quantity;
    }

    public void addStock(Integer quantity){
        assert(quantity > 0): "Jumlah kuantiti harus lebih dari 0 untuk menambahkan ke stok";
        this.stock += quantity;
    }
}
