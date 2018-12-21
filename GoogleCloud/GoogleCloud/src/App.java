import com.google.cloud.Timestamp;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.Key;
import com.google.cloud.datastore.KeyFactory;

import donnee.JoueurDAO;
public class App {
    public static void main(String[] args) {

        JoueurDAO accesseur = new JoueurDAO();

        accesseur.ajouterJoueur("Alec", "60 Kg", "4 mai 1998", 10);

    }
}
