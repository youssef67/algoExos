Examen de Youssef Moudni

_____________________________________________________________________________________________________
Exercice 1
_____________________________________________________________________________________________________

Variables
    communesTableau[] en Tableau de Entiers
    cmpt, nbresCommunes, nbresVilles, VillesPourcentages en Entiers
Début
    nbresVilles <- 0
    VillesPourcentages <- 0

    nbresCommunes <- Lire("Combien y a-t-il de communes à saisir ?")
    ChangerTaille(communesTableau[nbresCommunes])
    Pour compt <- 0 à nbresCommunes - 1
        communesTableau[cmpt] <- Lire("Veuillez indiquez pour la commune n°", cmpt + 1, "Le nombre d'habitants")

        Si communesTableau[cmpt] >= 2 000 Alors 
            nbresVilles <- nbresVilles + 1
        FinSi
    FinPour

    VillesPourcentages <- Ent(nbresVilles * 100 / TailleTableau(communesTableau))

    Ecrire "Sur les ", TailleTableau(communesTableau), " communes saisies ", nbresVilles, " sont des villes,
            ainsi les villes représentent ", VillesPourcentages, " % des communes saisies."
Fin

_____________________________________________________________________________________________________
Exercice 2
_____________________________________________________________________________________________________

Variables
    TableauPrixEnKilo[10] en Tableau de Entiers
    cmpt, prixDemandeTotal, prixDemandeParArticle, kiloDemandeParArticle en Entiers
Début
    prixDemandeTotal <- 0

    TableauPrixEnKilo[0] <- 9
    TableauPrixEnKilo[1] <- 5
    TableauPrixEnKilo[2] <- 12
    TableauPrixEnKilo[3] <- 15
    TableauPrixEnKilo[4] <- 7
    TableauPrixEnKilo[5] <- 42
    TableauPrixEnKilo[6] <- 13
    TableauPrixEnKilo[7] <- 10
    TableauPrixEnKilo[8] <- 1
    TableauPrixEnKilo[9] <- 20

    Pour cmpt <- 0 a TailleTableau(TableauPrixEnKilo) - 1
        kiloDemandeParArticle <- "Indiquez le nombre en Kilogramme pour l'ingrédient secret n°", cmpt + 1, " :"
        prixDemandeParArticle <- kiloDemandeParArticle * TableauPrixEnKilo[cmpt]

        prixDemandeTotal <- prixDemandeTotal + prixDemandeParArticle
    FinPour

    Ecrire "Le prix demandé par Toto pour la fabrication d'une potion est de ", prixDemandeTotal, " Euros"
Fin
