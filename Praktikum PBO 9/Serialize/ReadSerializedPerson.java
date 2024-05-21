/*
Nama        : David Nugroho
NIM         : 24060122130074
File        : ReadSerializedPerson
Deskripsi   : Program untuk serialisasi objek person
 */

 import java.io.*;

 public class ReadSerializedPerson {
     public static void main(String[] args) {
         Person person = null;
         try {
             FileInputStream f = new FileInputStream("person.ser");
             ObjectInputStream s = new ObjectInputStream(f);
             person = (Person)s.readObject();
             s.close();
             System.out.println("serialized person name = "+person.getName());
         } catch (IOException ioe) {
             ioe.printStackTrace();
         } catch (ClassNotFoundException cnfe) {
             cnfe.printStackTrace();
         }
     }
 }