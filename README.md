# ICE-2024

Funktionelle krav

Der er følgende krav til systemet:

Der skal være en startmenu, hvor brugeren kan vælge mellem at:
Oprette sig som bruger: Brugernavn, kode og tilføje adresse i forhold til bestillingen og leveringen til orderen.
Derefter har brugerne mulighed for at logge ind med brugernavn og kode.

Der skal være en hovedmenu (i tekst), hvor brugeren kan vælge mellem at:
Søge efter en specifik restaurant (navnet på restauranten).
Søge efter kategori, f.eks. indisk, thai osv., eller drikkevarer som bubbletea, kaffe, milkshake osv.
Se sin liste over ordre man har placeret/tidligere bestilling og igangværende bestillinger.
Brugeren skal kunne tilføje og fjerne mad under bestillingen og følge med i hvad bestillingen er undervejs, eks. en vis bestilling eller afslut og forsæt til kassen.
Brugeren skal kunne bestille efter specifik mad eller drikkevarer. Herunder søge pizza og få alle restauranter frem som har pizza på menukortet.
Efter brugeren har fået de forskellige valg, skal man kunne gå ind og bestille noget mad, drikke, eller dessert.

Når brugeren har fortaget sig en bestilling, skal der være en nedtælling til hvornår maden kommer.

Brugernes login-oplysninger (brugernavn,password og adressen) skal gemmes i en fil, så de kan indlæses når programmet startes op igen.
Der skal være fornuftig håndtering af fejl. Hvis der opstår fejl i programmet skal de håndteres passende steder, og brugeren skal informeres, hvis det er relevant. Overvej hvem fejlen skal kommunikeres til. En IOException (som kan opstå, når man læser ind fra en fil) vil fx gøre, at programmet fra brugerens synspunkt ikke virker. Hvordan formidler vi til brugeren, at der er opstået en fejl? eks. ( "Forkert login oplysninger"), ("Der opstod en fejl prøv igen")

Data:
lave en funktion, som kan indlæse data fra filerne og fylde nogle ArrayLists med mad, drikkevarer, dessert, menukort og deres resturanter.

Nice-to-have:
At kunne gå ind i sin tidligere bestilling og genbestille den samme ordre.
Leveringspris på bestillingen.
Brugeren kan rate sin bestilling.
Brugeren skal kunne filtrere efter leveringspris og rating.
Randomize rabatuddeling --> nogle restauranter kan have rabat.
Prøv lykken til rabat eller random mad.
