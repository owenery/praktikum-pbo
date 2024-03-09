//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 6 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk class mengaplikasikan ExceptionOnArray

public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[3] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("Clean up code...");
        }
    }
}
