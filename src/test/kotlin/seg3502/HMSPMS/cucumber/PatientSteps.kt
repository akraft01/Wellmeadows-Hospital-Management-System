package seg3502.HMS-PMS.cucumber.steps

import io.cucumber.java.fr.Étantdonné
import io.cucumber.java.fr.Lorsque
import io.cucumber.java.fr.Alors

class PatientSteps {

    @Étantdonné("que le réceptionniste a les informations d'un nouveau patient")
    fun le_receptionniste_a_les_informations_dun_nouveau_patient() {
        // Implémentez cette étape pour préparer les données du patient
    }

    @Lorsque("le réceptionniste enregistre le patient dans le système")
    fun le_receptionniste_enregistre_le_patient_dans_le_systeme() {
        // Implémentez cette étape pour enregistrer le patient via le PatientService
    }

    @Alors("le patient doit être ajouté avec succès et recevoir un identifiant unique")
    fun le_patient_doit_etre_ajoute_avec_succes_et_recevoir_un_identifiant_unique() {
        // Implémentez cette étape pour vérifier que le patient a été enregistré avec succès
    }

    // Répétez le processus pour AdmitPatient.feature
}

