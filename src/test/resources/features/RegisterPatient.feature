# language: fr
Fonctionnalité: Enregistrement des patients

  Scénario: Enregistrement d'un nouveau patient
    Étant donné que le réceptionniste a les informations d'un nouveau patient
    Lorsque le réceptionniste enregistre le patient dans le système
    Alors le patient doit être ajouté avec succès et recevoir un identifiant unique
