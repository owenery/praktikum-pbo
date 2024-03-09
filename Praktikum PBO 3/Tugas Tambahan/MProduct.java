public class MProduct {
    public static void main(String[] args) {
        Product produk = new Product("Asus ROG Phone 5", 2, 10000000);

        System.out.println("Nama Produk     : " + produk.getName());
        System.out.println("Stok Produk     : " + produk.getStock());
        System.out.println("Harga Produk    : " + produk.getPrice());

        produk.purcaseProduct(1);
        produk.purcaseProduct(2);
        System.out.println("Stok Produk     : " + produk.getStock());
        produk.addStock(4);
        System.out.println("Stok Produk     : " + produk.getStock());
    }
}
