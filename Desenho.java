
package CarroNovo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author isaura
 */
public class Desenho extends JPanel implements Runnable
{
    
    Roda carro = new Roda(100,200,400,400);
    
    
    private Thread thread = new Thread(this);
            
            public Desenho()
            {
                
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1000,1200);
                frame.add(this);
                frame.setTitle(" Rotation In java Graphics");
                thread.start();
                frame.setVisible(true);
                
                
                carro.setRoda(new ImageIcon(getClass().getResource("imagem.png")).getImage());
            }
            
            
            public void paint( Graphics g)
            {
                super.paint(g);
                
                Graphics2D g2d = ( Graphics2D)g;
                
              
                AffineTransform obj = g2d.getTransform();
                g2d.rotate(Math.toRadians(carro.getRaio()), carro.getPosx()+(carro.getAltura()/2), carro.getPosy()+(carro.getLargura()/2));
                
                g.drawImage(carro.getRoda(),carro.getPosx(), carro.getPosy(),carro.getLargura(),carro.getAltura(),this);
                  
                g2d.setTransform(obj); // Pega na posicao final e substirtui  transformacao inicial //desenha um retangulo com as mesmas caracteristicas
        
        
                obj = g2d.getTransform(); //posicaoo final Termino do affineTransform
                
                g.setColor(Color.yellow);
                g.fillRect(300, 600, 200, 200);//Ilustracao do objecto fora do AffineTransform
        
        
            }
        
            
            public void dormir()
             {
                try
                {
                    Thread.sleep(10);
                }
                catch (InterruptedException ex)
                {
                   ex.printStackTrace();
                }
            }
            
            
            

                @Override
                public void run()
                {
                        while( true)
                        {
                            
                            carro.setRaio(carro.getRaio()+1);
                            repaint();
                            dormir();
                        }
                }
    
}
