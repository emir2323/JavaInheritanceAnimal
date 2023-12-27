
import java.util.*;

class Hayvan {


    private String ad;
    private int yaş;
    private String türü;
    private double Kilo;
    private boolean evcilleştirilmiş;


    public Hayvan(String ad, int yaş, String türü, double Kilo, boolean evcilleştirilmiş) {
        this.ad = ad;
        this.yaş = yaş;
        this.türü = türü;
        this.Kilo = Kilo;
        this.evcilleştirilmiş = evcilleştirilmiş;
    }


    public void makeSound() {
        System.out.println("Ben " + türü + " ve ben ses çıkarırım " + Sesyapması());
    }


    abstract String Sesyapması();


    public void besin() {
        System.out.println(ad + " yiyiyor.");
    }

    public void uyku() {
        System.out.println(ad + " uyuyor.");
    }

    public void oyun() {
        System.out.println(ad + " oynuyor.");
    }


    public String toString() {
        return "Animal{" +
                "Adı='" + ad + '\'' +
                ", Yaşı=" + yaş +
                ", Türü='" + türü + '\'' +
                ", Kilosu=" + Kilo +
                ", Evcilleşmesi=" + evcilleştirilmiş +
                '}';
    }
}


public class Köpek extends Hayvan {

    // Constructor method
    public Köpek(String ad, int yaş, double Kilo, boolean evcilleştirilmiş) {
        super(ad, yaş, "Köpek", Kilo, evcilleştirilmiş);
    }

    // Method
    @Override
    public String Ses() {
        return "Woof!";
    }

    // Other methods
    public void havlamak() {
        System.out.println(ad + " havlıyor.");
    }

    public void gidipgetirmek() {
        System.out.println(ad + " getiriyor.");
    }

    // Add new methods specific to dogs
    public void yuvarlanmak() {
        System.out.println(ad + " yuvarlanıyor.");
    }

    public void oturmak() {
        System.out.println(ad + " oturuyor.");
    }

    public void durmak() {
        System.out.println(ad + " duruyor.");
    }
}


public class Kuş extends Hayvan {

    // Constructor method
    public Kuş(String ad, int yaş, double Kilo, boolean evcilleştirilmiş) {
        super(ad, yaş, "Kuş", Kilo, evcilleştirilmiş);
    }


    @Override
    public String Sesyapması() {
        return "Cikcik!";
    }


    public void konmak() {
        System.out.println(ad + " konuyor.");
    }

    public void uçmak() {
        System.out.println(ad + " uçuyor.");
    }


    public void süzülmek() {
        System.out.println(ad + " süzülüyor.");
    }

    public void kovalamak() {
        System.out.println(ad + " kovalıyor.");
    }

}
