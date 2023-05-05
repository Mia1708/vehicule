insert into profil(typeProfil) values ('admin');
insert into profil(typeProfil) values ('utilisateur');

insert into genre(genre) values ('femme');
insert into genre(genre) values ('homme');

insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('ANDRIANIONY','Nanto','1992-02-14','Ambohitrarahaba','0346050961','nanto',1,2);
insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('RAKOTOBE','Mialy','1994-03-16','Sabotsy','0322456789','mialy',2,1);
insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('RIVONIAINA','Neria','1989-06-01','Imerintsiatosika','0344750948','neria',2,2);
insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('RAONIMAHARO','Sanda','1987-09-12','Analamahitsy','0345673122','sanda',2,2);
insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('ANDRINIRINA','Nanie','1990-06-12','Ilafy','0327890754','nanie',2,1);
insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('RAMONTAHARIFARA','God','1992-05-13','Andranovelona','03450012311','god',2,2);
insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('RAOLISOA','Nalia','1986-01-10','Ambohitrarahaba','0346785423','nalia',2,1);
insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('FENOMANANA','Deraina','1982-`11-`15','Ilafy','0345432144','dera',2,2);
insert into employe(nomemploye,prenomemploye,datenaissance,adresse,contact,mdp,idprofil,idgenre) values ('NIVOARISOA','Rotsy','1989-07-25','Analamahitsy','0348976533','rotsy',2,1);

insert into marque(marque) values ('Toyota');
insert into marque(marque) values ('Ford');
insert into marque(marque) values ('Chevrolet');

insert into modele(modele) values ('familiale');
insert into modele(modele) values ('pick-up');
insert into modele(modele) values ('break');

insert into type(type) values ('legere');
insert into type(type) values ('SUV');
insert into type(type) values ('camion');
insert into type(type) values ('utilitaire');

insert into vehicule(numerovehicule,idmarque,idmodele,idtype)values ('1798TAK',1,1,1);
insert into vehicule(numerovehicule,idmarque,idmodele,idtype)values ('5678TBB',1,2,3);
insert into vehicule(numerovehicule,idmarque,idmodele,idtype)values ('0013TAA',2,1,2);
insert into vehicule(numerovehicule,idmarque,idmodele,idtype)values ('1920TBG',3,3,1);
insert into vehicule(numerovehicule,idmarque,idmodele,idtype)values ('1234TVA',2,2,4);
insert into vehicule(numerovehicule,idmarque,idmodele,idtype)values ('4500TBC',3,3,4);
insert into vehicule(numerovehicule,idmarque,idmodele,idtype)values ('1167TAF',2,1,2);
insert into vehicule(numerovehicule,idmarque,idmodele,idtype)values ('0034TAJ',2,3,3);

insert into typeecheance(type) values ('Assurance');
insert into typeecheance(type) values ('Visite Technique');

insert into typemaintenance(typeMaintenance) values ('vidange');
insert into typemaintenance(typeMaintenance) values ('pneu');


