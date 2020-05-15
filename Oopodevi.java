
package oopodevi;
//problemimizin çözümü için sınıfımızı tanımladık
class Hedefalgoritmadangeçmek
{
       //sınıfımızın özelliklerini tanımladık
    
       private String mayıntarlasıoyunu;
       String banagörealgoritma;                  
       String banagöreoop;
       int puan;
       String ozelllik5;
       
       //ana yapıcı metodumuzu tanımladık özelliklere varsayılan değerler atandı
       Hedefalgoritmadangeçmek()
       {
    
       }
        //parametre alan yapıcı metodunu tanımladık 
       Hedefalgoritmadangeçmek(String banagörealgoritma,String banagöreoop)//yapıcımız 2 parametre almaktadır.
       {
         //thisle sınıfımızın özelliklerine eriştik
        this.banagörealgoritma=banagörealgoritma;
        this.banagöreoop=banagöreoop;
        System.out.println(banagörealgoritma+" "+banagöreoop);
     
       }
       //banagörealgoritma metodu(fonksiyonu)
       public String banagörealgoritma(boolean kontrol)
       {
           //eğer ödevi yaptıysa +40 puan ekledik
           if(kontrol==true)
           {
               puan+=40;
               System.out.println("toplam puanınız : "+puan);
               
           }
           //yapmadıysa 0 puan ekledik
           else 
           {
               puan+=0;
              System.out.println("toplam puanınız : "+puan);
           }
           return "";//boş bi değer dönderdik
       }
       //banagöreoop metodu(fonksiyonu)
       public String banagöreoop(boolean kontrol)
       {
           //eğer ödevi yaptıysa +30 puan ekledik
           if(kontrol==true)
           {
               puan+=30;
               System.out.println("toplam puanınız : "+puan);
               
           }
           //yapmadıysa 0 puan ekledik
           else 
           {
               puan+=0;
               System.out.println("toplam puanınız : "+puan);
           }
           return "";
           
       }
       //polymorphisim(çok biçimlilik) özelliği sağlandı 
        public String banagöreoop(boolean kontrol,String projeismi)
       {
           
           //eğer ödevi yaptıysa +30 puan ekledik
           if(kontrol==true)
           {
               puan+=30;
               System.out.println(projeismi+" isimli ödevinizi yaptığınız için puanınıza 30 puan eklendi Puanınız : "+puan);
               
           }
           //yapmadıysa 0 puan ekledik
           else 
           {
               puan+=0;
               System.out.println(projeismi+" isimli ödevinizi yapmadığınız için puanınıza 0 puan eklendi Puanınız : "+puan);
           }
           return "";
           
           
       }
       //private özelliğimize erişmek için get set metotlarını tanımladık
       public String getmayıntarlasıoyunu()
       {
           return mayıntarlasıoyunu="";
       }
       public void setmayıntarlasıoyunu(boolean kontrol)
       {
           //eğer ödevi yaptıysa +30 puan ekledik
           if(kontrol==true)
           {
               puan+=30;
               System.out.println("toplam puanınız : "+puan);
               
           }
           //yapmadıysa 0 puan ekledik
           else 
           {
               puan+=0;
               System.out.println("toplam puanınız : "+puan);
           }
       }
       private String ozelllik5(String değer)
       {
           return "private erişim belirleyiciyle tanımlanmıştır";
       }
      
        
    
}
// kalıtımla yeni bir sınıf oluşturduk olusturlan sınıf Hedefalgoritmadangeçmek sınıfının bütün özellik ve fonksiyonlarından faydalanır
class Türetilensınıf extends Hedefalgoritmadangeçmek
{
    
    
}


public class Oopodevi 
{


    public static void main(String[] args)
    {
      //hesaplap1 isimli nesne oluşturup parametre alan yapıcımızı çağırdık 
      Hedefalgoritmadangeçmek  hesapla1=new  Hedefalgoritmadangeçmek ("banagörealgortima odevini yaptım","banagöreoop odevini yapmadım")  ;
      //hesapla isimli nesnemizi oluşturduk
      Hedefalgoritmadangeçmek hesapla=new Hedefalgoritmadangeçmek();
      
      /*hesaplama yapmak için eğer ödevi yaptıysanız parametreyi true olarak
        eğer yapmadıysanız false olarak giriniz
      */
      hesapla.banagörealgoritma(true);
      hesapla.banagöreoop(true);
      hesapla.banagöreoop(true, "algoritma programlama 2");
      hesapla.getmayıntarlasıoyunu();
      hesapla.setmayıntarlasıoyunu(true);
      
      Türetilensınıf yeni=new Türetilensınıf();
      System.out.println(yeni.ozelllik5="türetildi");
      
      
    }
    
}
