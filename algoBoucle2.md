

Variables

notation, accident, age, en numerique

permisMoinsDeAns, anciennetePlusDe5ans en boolean



Debut



notation <- 2

age <- Lire("Quel est votre age ?")

permisMoinsDeAns <- Lire("Avez-vous le permis depuis moins de 2 ans ?")

nbrAccident <- Lire("Merci de préciser le nombre d'accident(s)")

anciennetePlusDe5ans<- Lire("Etes vous client depuis plus de 5 ans ?")



notation <- notation + nbrAccident  



Si (age < 25)

​	notation <- + 1

Si (permisMoinsDe2Ans)

​	notation <- + 1





Si notation <= 4

​	Si anciennete > 5

​		notation <- -1

​	FinSi



​	Si (notation = 1)

​		Ecrire "tarif bleu"

​	SinonSi (notation = 2)

​		Ecrire "tarif vert"

​	SinonSi (notation = 3)

​		Ecrire "tarif orange"

​	SinonSi (notation = 4)

​		Ecrire "tarif rouge"

Else 

​	Ecrire "refus"

Fin



---------------------------------



Variables

jour, mois annee en numerique

anneeBissextile en numerique



Debut

 jour <- Lire("Quel est le jour ?")

mois <- Lire("Quel est le mois ?")

mois <- Lire("Quel est l'année ?")



Si (annee est divisible par 4 )

​	Si (annee PAS divisible par 100 ET annee divisible par 400)

​		anneeBissextile <- 29

​	SinonSi (annee divisible par 100 ET annee PAS divisible par 400)

​		anneebissextile <- 28

​	FinSi

Sinon 

​	anneebissextile <- 28

FinSi



Si (mois = 2 ET jour <= anneebissextile ) Alors

​	Ecrire "date valide"

SinonSi (mois = 4 OU mois = 6 OU mois = 9 OU mois = 11 OU mois = 12 ET jour <= 30)

​	Ecrire "date valide"

SinonSi (mois =1  OU mois = 3 OU mois = 5 OU mois = 7 OU mois = 8 OU mois = 10 OU mois = 12 ET jour <= 31 ET jour >=1)

​	Ecrire "date valide "

Sinon

​	Ecrire "date invalide"

​	

FinSi

​	



Fin 