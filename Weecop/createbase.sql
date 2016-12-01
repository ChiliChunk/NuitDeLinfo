drop table if exists ACHETER;
drop table if exists PARTICIPANT;
drop table if exists PERSONNE;
drop table if exists ACHAT;
drop table if exists PROJET;



create table PROJET
(
	IDPROJET  decimal(3),
	NOMPROJET varchar(30),
	constraint PK_PROJET primary key (IDPROJET)
);

create table ACHAT
(
	IDACHAT  decimal(3),
	NOMACHAT varchar(30),
	IDPROJET decimal(3),
	constraint PK_ACHAT      	primary key (IDACHAT),
	constraint FK_ACHAT_PROJET 	foreign key (IDPROJET) references PROJET(IDPROJET)
);

create table PERSONNE
(
	IDPERSONNE  decimal(3),
	NOM  		varchar(30),
	SOLDE     	float(30),
	IDPROJET 	decimal(3),
	constraint PK_PERSONNE       primary key (IDPERSONNE),
	constraint FK_PERSONNE_ACHAT foreign key (IDPROJET) references PROJET(IDPROJET)
);

create table PARTICIPANT
(
	IDACHAT  	decimal(3),
	IDPERSONNE  decimal(3),
	POIDS 		decimal(3),
	constraint PK_PARTICIPANT        	primary key (IDACHAT,IDPERSONNE,POIDS),
	constraint FK_PARTICIPANT_ACHAT   	foreign key (IDACHAT) 	 references ACHAT (IDACHAT),
	constraint FK_PARTICIPANT_PERSONNE  foreign key (IDPERSONNE) references PERSONNE (IDPERSONNE)
);

create table ACHETER
(
	IDACHAT  	decimal(3),
	IDPERSONNE  decimal(3),
	VALEUR 		float(30),
	constraint PK_ACHETER        	primary key (IDACHAT,IDPERSONNE,VALEUR),
	constraint FK_ACHETER_ACHAT   	foreign key (IDACHAT) 	 references ACHAT (IDACHAT),
	constraint FK_ACHETER_PERSONNE  foreign key (IDPERSONNE) references PERSONNE (IDPERSONNE)
);