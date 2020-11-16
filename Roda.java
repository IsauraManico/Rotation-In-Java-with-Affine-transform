
package CarroNovo;

import java.awt.Image;

/**
 *
 * @author isaura
 */
public class Roda 
{
    
   private Image roda;
   
   private int posx,posy,largura,altura;
   
  
   private int raio =10;

    public Roda(int posx, int posy, int largura, int altura) 
    {
        this.posx = posx;
        this.posy = posy;
        this.largura = largura;
        this.altura = altura;
    }

    public Image getRoda() {
        return roda;
    }

    public void setRoda(Image roda) {
        this.roda = roda;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

  
    
   
   
   
   
   
    
}
