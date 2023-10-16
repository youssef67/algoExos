nombre en numerique

Début

​ nombre <- Lire("Veuillez indiquer  un nombre entre 1 et 3")

​ TantQue nombre < 1 ET nombre > 3

​  nombre <- "Nombre erroné, merci d'indiquer un nombre entre 1 et 3"

​ FinTantQue

​ Ecrire -> "Le chiffre est " && nombre

Fin

3.2

Variables

nombre en numérique

Début

​ nombre <- Lire("Veuillez indiquer un nombre entre 10 et 20")

​ TantQue nombre <10 ET nombre > 20

​  SI nombre < 10

​   nombre <- Lire("Plus grand !")

​  FinSI

​  Si nombre > 20

​   nombre <- Lire("Plus petit !")

​  FinSi

​ FinTantQue

​ Ecrire "Le chiffre est " && nombre

Fin

3.3

Variables

nombreDepart, nbrFin en numérique

Début

​ nombreDepart <- Lire("Veuillez indiquer un nombre")

​ nbrFin <- nombreDepart + 10

​ TantQue nombreDepart < nbrFin

​  NombreDepart <- nombreDepart + 1

​  Ecrire "Voici le nombre " && nombreDepart

​ FinTantQue

Fin

3.4

Variables

​ nombreDebut en numérique

Début

​ nombreDebut <- Lire("Veuillez indiquer un nombre")

​ Pour nombreDebut <- nombreDebut  à nombreDepart + 9

​  nombreDebut <- nombreDebut + 1

​  Ecrire "nombre " && nombreDebut

​ FinPour

Fin

-----------------------------------------------------------------------------

3.5

Variables

nbr, multiplicateur en numerique

Debut

​ nbr <- Lire("Veuillez indiquer un nombre")

​ Pour multiplicateur <- 1 à 10

​  Ecrire -> nbr && " *" && multiplicateur && " = " && (nbr* multiplicateur)

​ FinPour

Fin

3.6

Variables

nbr, somme en numerique

Debut

​ nbr <- Lire("Indiquez un nombre de départ")

​ somme <- 0

​ Pour compte <- 1 à nbr

​  somme <- somme + compte

​ FinPour

​ Ecrire "somme = " && somme

Fin

3.8

Variables

nbr, max, position en numerique

Debut

​ max <- 0

​ position <- 1

​ Pour compte <- 1 à 20

​  nbr <- Lire("Entrez le nombre " && compte)

​  Si (nbr > max)

​   max <- nbr

​   position <- compte

​  FinSi

​ FinPour

​ Ecrire "Le plus grand de ces nombre est : " && max

​ Ecrire "C'était le nombre numéro : " && position  

Fin

3.9

Variables

nbr, max, position en numerique

Debut

​ max <- 0

​ position <- 0

​

​ Repeter

​  nbr <- Lire("Entrez un nombre")

​  Si (nbr > max ) Alors

​   max <- nbr

​   position <- position + 1

​  FinSi

​ Jusque nbr = 0

​ Si position = 0

​  Ecrire "Aucun nombre supérieur à 0 n'a était saisi"

​ Sinon

​  Ecrire "Le plus grand de ces nombre est : " && max

​  Ecrire "C'était le nombre numéro : " && position

​ FinSi

Fin

3.10

Variables

​ prix, somme, sommeClient, diffSommeEtSommeClient en numerique

​ nbrDix, nbrCinq, nbrUn en numerique

Debut

​ somme <- 0

​ nbrDix <- 0

​ nbrCinq <- 0

​ nbrUn <- 0

​ Repeter

​  prix <- Lire("Quel est le prix du produit")

​  somme <- somme + prix

​ Jusque prix = 0

​

​ sommeClient <- Lire("Quel somme vous donnez")

​ diffSommeEtSommeClient <- sommeClient - somme

​ TantQue diffSommeEtSommeClient >= 10

​  diffSommeEtSommeClient <- diffSommeEtSommeClient  - 10

​  nbrDix <- nbrDix + 1

​ FinTantQue

​ TantQue diffSommeEtSommeClient >= 5

​  diffSommeEtSommeClient <- diffSommeEtSommeClient - 5

​  nbrCinq <- nbrCinq + 1

​ FinTantQue

​ TantQue diffSommeEtSommeClient  >= 1

​  diffSommeEtSommeClient <- diffSommeEtSommeClient - 1

​  nbrUn <- nbrUn + 1

​ FinTantQue

​ Ecrire "10 E : " && nbrDix && " 5 E : " nbrCinq && " 1 E " && nbrUn

Fin
