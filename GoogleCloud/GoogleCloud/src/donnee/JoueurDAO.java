package donnee;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.Key;
import com.google.cloud.datastore.KeyFactory;

public class JoueurDAO {
    private final Datastore baseDeDonnees;
    private final KeyFactory generateurIdJoueur;

    public JoueurDAO() {

        baseDeDonnees = DatastoreOptions.newBuilder().setProjectId("projet-capture-225623").build().getService();
        generateurIdJoueur = baseDeDonnees.newKeyFactory().setKind("capture");

    }

    public void ajouterJoueur(String nom, String poids, String naissance, int numero) {

        Key id = baseDeDonnees.allocateId(generateurIdJoueur.newKey());

        Entity nouveauJoueur = Entity.newBuilder(id)
                .set("nom", nom)
                .set("poids", poids)
                .set("naissance", naissance)
                .set("numero", numero)
                .build();

        baseDeDonnees.put(nouveauJoueur);

    }
}
