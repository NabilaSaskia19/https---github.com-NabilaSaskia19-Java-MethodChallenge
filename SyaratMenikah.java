public class SyaratMenikah{

public static void Syaratmenikah(int umur) {

        if (umur < 12) {
          System.out.println("Anda Tidak Layak Menikah"); 
          
        } else {
          System.out.println("Anda Layak Menikah"); 
        }
        
      } 
      public static void main(String[] args) { 
        Syaratmenikah(21); 
      }
    }