/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;




import java.awt.*;

public class Percobaan extends Panel{

        Percobaan(){

            setBackground(Color.BLUE);

        }

    public void paint(Graphics g) {

        //buat badan

        g.drawLine(175, 280, 175, 160);

        //buatkaki

        g.drawLine(155, 280,175,250 );

        g.drawLine(195, 280,175,250 );

        

        //buattangan

       g.drawLine(140, 210, 175, 200);

        g.drawLine(215, 210, 175, 200);

        

        //buat kepala

        g.drawRoundRect(145, 103, 60 , 60,60, 60);


        

        //buat mata dan mulut

        g.drawRoundRect(160, 125, 12, 10,10, 10);

        g.drawRoundRect(177, 125, 12, 10,10, 10);
        g.drawArc(145, 140, 130, 60, -20, 20);

        

      

    }

    public static void main(String[] args) {

        Frame f = new Frame("diriku");

       Percobaan gp = new Percobaan();

       f.add(gp);

        f.setSize(900, 900);

        f.setVisible(true);

    }

}
