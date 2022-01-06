
CREATE TABLE client
(
id INT primary key, nom varchar(50), prenom varchar(50), nss varchar(50) , adresse varchar(50), tel varchar(50),
 permis varchar(50));


CREATE TABLE facture
 (id INT primary key, nom varchar(50), prenom varchar(50), adresse varchar(50),
  
  permis varchar(50),
  etat varchar(50));


CREATE TABLE vendeur
(
  id INT primary key,
  nom varchar(50),
  prenom varchar(50),
  statut varchar(50),
  login varchar(50),
  passe varchar(50));


CREATE TABLE vehicule
(
  id INT primary key,
  marque varchar(50),
  modele varchar(50),
  numero_meneralogique varchar(50),
  kilometrage varchar(50),
  prix varchar(50),
  statut varchar(50));
CREATE TABLE bon(

IdClient varchar(50),
IdVehicule varchar(50),
prix varchar(50),
durée varchar(50));