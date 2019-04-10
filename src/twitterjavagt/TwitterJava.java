/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterjavagt;
import java.io.IOException;
import javax.swing.JOptionPane;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author socamporomani
 */
public class TwitterJava {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws TwitterException, IOException {      
     NewClass obx = new NewClass();
                int opcion;
        //Menú de opciones
       
            opcion =Integer.parseInt(JOptionPane.showInputDialog(null, "Elija opción\n"
                    + "1 - Enviar tweet\n"
                    + "2 - Mostrar TimeLine\n"
                    + "3 - Buscar Tweet\n"
                    ));
            
            switch(opcion){
                case 1:
                    obx.tweet();
                    break;
                case 2:
                    obx.timeLine();
                    break;
                case 3:
                    obx.searchTweet(JOptionPane.showInputDialog(null, "Palabra a buscar"));
                    break;
              }
            
       

    }
}
