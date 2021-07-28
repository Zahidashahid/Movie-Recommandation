package UI;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public class Show {
    
    Timer timer;
    Home objTry;
    ImageIcon image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background1.jpg");
    ImageIcon image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background2.jpg");
    ImageIcon image3 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background3.jpg");
    ImageIcon image4 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background4.jpg");
    ImageIcon image5 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background5.jpeg");
    ImageIcon image6 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background6.jpeg");
    ImageIcon image7 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background7.jpg");
    ImageIcon image8 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background8.jpeg");
    ImageIcon image9 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background9.jpg");
    ImageIcon image10 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background10.jpg");
    ImageIcon image11 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Logos\\background11.jpg");
    
    public Show() throws SQLException {
        objTry = new Home();
        timer = new Timer();
        timer.schedule(new RemindTask(),
	               0,        //initial delay
	               1*2000);  //subsequent rate
            
            objTry.setVisible(true);
            objTry.allTimeFamousMovie1Label.setIcon(image1);            objTry.setLocation(0, 0);

    }

    class RemindTask extends TimerTask 
    {
        @Override
        public void run() 
        {
            int count = 100;
            if(count > 10)
            {
                        Dimension maximumSize = new Dimension();
        maximumSize.height = 730;
        maximumSize.width = 1368;
            objTry.setMaximumSize(maximumSize);
            objTry.setMinimumSize(maximumSize);
            objTry.setPreferredSize(maximumSize);
                if(objTry.allTimeFamousMovie1Label.getIcon() == image1)
                    objTry.allTimeFamousMovie1Label.setIcon(image2);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image2)
                    objTry.allTimeFamousMovie1Label.setIcon(image3);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image3)
                    objTry.allTimeFamousMovie1Label.setIcon(image4);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image4)
                    objTry.allTimeFamousMovie1Label.setIcon(image5);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image5)
                    objTry.allTimeFamousMovie1Label.setIcon(image6);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image6)
                    objTry.allTimeFamousMovie1Label.setIcon(image7);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image7)
                    objTry.allTimeFamousMovie1Label.setIcon(image8);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image8)
                    objTry.allTimeFamousMovie1Label.setIcon(image9);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image9)
                    objTry.allTimeFamousMovie1Label.setIcon(image10);
                else if(objTry.allTimeFamousMovie1Label.getIcon() == image10)
                    objTry.allTimeFamousMovie1Label.setIcon(image11);
                else
                    objTry.allTimeFamousMovie1Label.setIcon(image1);
            }
            
            //objTry.logoScrollPane.setVisible(true);
            
        }
    }
    
}



