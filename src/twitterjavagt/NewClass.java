/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterjavagt;

import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author socamporomani
 */
public class NewClass {

    
    /**
     *Esto envía tuits
     * @throws TwitterException
     */
    public void tweet() throws TwitterException {
        String latestStatus = JOptionPane.showInputDialog(null, "Escribe el Tweet");
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus(latestStatus);
        JOptionPane.showMessageDialog(null,"El Tweet [ " + status.getText() + " ] se ha enviado.");
    }


    /**
     *Muestra el Timeline a traves de una lista.
     * @throws TwitterException
     */
    public void timeLine() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText() + "\n");
        }
    }


    /**
     *Busca tuits con lo que coincida con lo insertado rn el query
     * @param busqueda mensaje que va a buscar en los tweets
     * @throws TwitterException
     */
    public void searchTweet(String busqueda) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query(busqueda);
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText()+"\n");
        }
    }
}

