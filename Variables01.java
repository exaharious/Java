package day01variables;

public class Variables01 {

                              //Variable nasil oluşturulur?

    //1)Acces Modifier  2)Data Type  3)Variable ismi  4)=    5)Deger  6);
    // Java'da ";" ingilizcedeki "." gibidir
    // İngilizce'de "cümle" deriz, Java'da "statement" deriz

    //"=" sembolu "Assigment(Atama)Operotor" olarak adlandırılır
    //"Assigment(Atama) Operator" sağdaki değeri alır soldaki variablenin içine koyar
    public int age = 13;
    public int height = 183;

                   //Java'da Data Type'leri

    /*
                          Pirimitive Data Types
    1)İnt: İnteger'in kisaltmasi. Integer tam  sayi demektir. 32 bit kullanır
           Matematikte tam sayıların başi ve sonu yoktur fakat Javada tamsayilarin başi ve sonu vardır
           En kucuk int = -2,147,483,648
           En büyük int =  2,147,483,647


     2)byte: Tamsayıklar için kullanilir. 8 bit kullanir.
             En küçük byte = -128
             En buyuk byte =  127


     3)short: Tam sayilar icin. 16 bit kullanir.
              En kucuk short = - 32768
              En büyük short =   32767


     4)long: Tam sayilar icindir. 64 bit kullanir.
             En kucuk long = -9,223,372,036,854,755,887
             En buyuk long = 9,223,372,036,854,755,887


     5)float: Ondalikli sayilar icindir 32 bit kullanilir
             "float" virgülden sonra 7 basamak icerir
             "float" degerlerinde sonuna f ve F koymamiz gerekir

     6)double:Ondalikli sayilar icindir   64 bit kullanilir.
              "double virgulden sonra 16 basamak icerebilir.

     7)boolean: true veya false degerleri icin kullaniilir. 1 bit kullanir.

     8)char: Tek karakterler icin kullanilir. 16 bit kullanir.
            A,c,2,?,-,=
            Note: "char" lara deger verirken, degeri tek tirnak arasinakoyunuz yoksa hata verir.

            Note: Java buyuk ve kucuk harflere duyarlidir.
                  Java icin TRUE ile true tamamen farklıdır

            Note: Numeric Data Types: byte < short < int < long < float < double
                  Numaric Olmayan Data Types: boolean - char

                                               Non-Pirimitive Data Types
        String: İsim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir
                String degerleri mutlaka cift tirnak kullanilmalidir.
                String non-primitive dir. yani bir String olusturdugumuzda Java size bir suru method verir.


                Primitive ile Non-Primitive lerin farki nedir?
                1)Non-Primitive data type'larinda degerin yaninda method'lar vardir.
                  Primitive data type'larinda ise sadece deger vardir, method yoktur
                2)Primitive data type'lari Java tarafindan olusturulmustur, toplam 8 tanedir, biz Primitive data olusturamayiz.
                  Non-Primitive data type'lari  Java tarafından da olusturulmustur,biz de olusturabiliriz. Non-Primitive sayilmayacak
                  kadar coktur , cunku her developer Non-Primitive data type olusturabilir
                3)Primitive data type isimleri kucuk harflerle baslar
                  Non-Primitive data type isimleri buyuk harfle baslar
                4)Primitive data type'lar memory'de farkli buyuklukte yerler kullanir.
  Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.


     */
    public byte price = 12;

    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.0000458;
    // siz "long" demenize ragmen java veriken sayiyi "int" kabul eder.
    // Bu yuzden "long" bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka l veyaL koyunuz.
    public long populationOfWorld = 7593959863L;

    // Burada "L" koymadigimiz halde problem yok cunku "1234" araligina uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial ='s';

    public String name = "Tom Hanks";

    //Note: "main method" arabanin motoru gibidir.
    //      "main method" calismadan hicbirsey calismaz.
    public static void main(String[] args) {


    }
}
