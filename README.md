Užduotis 1.3 Bibliotekos panaudojimas.

Man buvo paskirta kolegės https://github.com/lauratumaite/UnitTests1 biblioteka.
Biblioteka sukurta tikrai labai patogi, neteko "laužyti" galvos kaip padaryti, kad validuotų, ačiū kolegei.
Biblioteka yra packaguose - implementation, model package -  CountryPhone ir Validator klasėse.


Apie programa:

Pats app'sas sukurtas naudojantis Spring Boot (pirmą kartą teko naudoti).
norint pridėti žmogų reikia eiti į http://localhost:8080/add-person, kur yra front-end sukurtas tiems laukams: vardo, pavardės, numerio, el. pašto, adreso ir slaptažodžio.
Jeigu užpildoma tinkamai (viršuje nurodyti kokie duomenys tikrai tinka) - išmeta duomenų bazės lentele front-end kur galima Update/Delete taip pat pridėti naują.
Jeigu ne - išmeta error page.
Testai yra sukurti test aplankaluose.
Visą data galima pamatyti http://localhost:8080/list-users

(Nesu labai geras Javos žinojimas tikiuosi visas pajungimas bus geras...). Tikiuosi neblogai, kad ne pull requestu, bent jau man taip gavosi patogiau.
