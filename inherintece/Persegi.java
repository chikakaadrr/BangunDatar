
package inherintece;


public class Persegi extends BangunDatar {
    float sisi;  
    
    float luas(){
    float luas = sisi * sisi;
    System.out.println("Luas Persegi: " + luas);
    return luas;
    }
    
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling: " + keliling);
        return keliling;
    }
}

