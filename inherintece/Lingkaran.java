
package inherintece;

public class Lingkaran extends BangunDatar{
    float r;
    float keliling;
    
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    
    float keliling(){
        float luas = (float) (2* Math.PI * r);
        System.out.println("Keliling lingkaran: " + keliling);
        return keliling;
    }
}
