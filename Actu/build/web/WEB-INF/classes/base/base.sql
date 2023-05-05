create database vehicule;
create role vehicule login password 'vehicule';
alter database vehicule owner to vehicule;

create table profil(
id serial primary key,
typeProfil varchar(255)
);

create table genre(
id serial primary key,
genre varchar(255)
);

create sequence s_employe;
create table employe(
id serial primary key,
numemploye varchar(13) DEFAULT ('NUM'|| lpad(nextval('s_employe')::text, 10, '0')),
nomemploye varchar(255),
datenaissance date,
adresse varchar(255),
contact varchar(255),
mdp varchar(255),
idprofil int,
idgenre int,
prenomemploye varchar(255)
);
alter table employe add foreign key(idprofil) references profil(id);
alter table employe add foreign key(idgenre) references genre(id);


create table marque(
id serial primary key,
marque varchar(255)
);

create table modele(
id serial primary key,
modele varchar(255)
);

create table type(
id serial primary key,
type varchar(255)
);

create table vehicule(
id serial primary key,
numerovehicule varchar(255),
idmarque int,
idmodele int,
idtype int
);
alter table vehicule add foreign key(idmarque) references marque(id);
alter table vehicule add foreign key(idmodele) references modele(id);
alter table vehicule add foreign key(idtype) references type(id);

create table trajet(
id serial primary key,
idemploye int,
idvehicule int,
datedepart date,
heuredepart time,
datearrivee date,
heurearrivee time,
lieu varchar(255),
montantcarburant double precision,
quantitecarburant double precision,
motif text,
moyennekilometrage double precision
);
alter table trajet add foreign key(idemploye) references employe(id);
alter table trajet add foreign key(idvehicule) references vehicule(id);

create table typeecheance(
id serial primary key,
type varchar(255)
);


create table ajoutcheance(
id serial primary key,
idvehicule int,
idemploye int,
datepaiement date,
dateexpiration date,
montant double precision,
idtypeecheance int
);
alter table ajoutcheance add foreign key(idvehicule) references vehicule(id);
alter table ajoutcheance add foreign key(idemploye) references employe(id);
alter table ajoutcheance add foreign key(idtypeecheance) references typeecheance(id);

create table vehiculeindisponible(
id serial primary key,
date date,
idvehicule int,
idemploye int,
etat int
);
alter table vehiculeindisponible add foreign key(idvehicule) references vehicule(id);
alter table vehiculeindisponible add foreign key(idemploye) references employe(id);

create table typemaintenance(
id serial primary key,
typeMaintenance varchar(255)
);

create table maintenancevehicule(
id serial primary key,
idvehicule int,
idtypemaintenance int,
limitekilometrage double precision
);
alter table maintenancevehicule add foreign key(idvehicule) references vehicule(id);
alter table maintenancevehicule add foreign key(idtypemaintenance) references typemaintenance(id);

create or replace view v_vehiculeecheance as
select ajoutcheance.*,
       vehicule.numerovehicule,vehicule.idmarque,vehicule.idmodele,vehicule.idtype,
       marque.marque,
       modele.modele,
       type.type,
       employe.numemploye,employe.nomemploye,employe.idgenre,employe.idprofil,
       genre.genre
from ajoutcheance
join vehicule on vehicule.id = ajoutcheance.idvehicule
join employe on employe.id = ajoutcheance.idemploye
join marque on marque.id= vehicule.idmarque
join modele on modele.id = vehicule.idmodele
join type on type.id = vehicule.idtype
join genre on genre.id=employe.idgenre;

create or replace view vehiculetrajet as
select trajet.*,
       vehicule.numerovehicule,vehicule.idmarque,vehicule.idmodele,vehicule.idtype,
       marque.marque,
       modele.modele,
       type.type,
       employe.numemploye,employe.nomemploye,employe.idgenre,
       genre.genre
from trajet
join vehicule on vehicule.id = trajet.idvehicule
join marque on marque.id= vehicule.idmarque
join modele on modele.id = vehicule.idmodele
join type on type.id = vehicule.idtype
join employe on employe.id=trajet.idemploye
join genre on genre.id=employe.idgenre;






