# language: fr
Fonctionnalité: Admission des patients

  Scénario: Admission d'un patient dans l'hôpital
    Étant donné que le réceptionniste a l'identifiant d'un patient enregistré
    Et que le patient n'est pas déjà admis
    Lorsque le réceptionniste admet le patient dans un service
    Alors le patient doit être admis avec succès
