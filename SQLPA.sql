 /* CREATE TABLE Usuario
(
	IDUser		int not null identity,
	Name		varchar(200) not null,
	BirthDate	datetime not null,
	Gender		varchar(1),
	Email		varchar(200) not null,
	UserName	varchar(20) not null,
	Password	varchar(20) not null,
	Allergies	varchar(100),

	CONSTRAINT PKIDUser PRIMARY KEY (IDUser)

)

CREATE TABLE Medicamentos
(
	IDMed			int not null identity,
	MedName			varchar(50) not null,
	DescriptionM	varchar(225) not null,
	
	CONSTRAINT PKIDMed PRIMARY KEY (IDMed)
)

CREATE TABLE Farmacias
(
	IDPharm		int not null identity,
	Addres		varchar(50) not null,
	State		varchar(2) not null,
	DescriptionM	varchar(225),

	CONSTRAINT PKIDPharm PRIMARY KEY (IDPharm)
)


CREATE TABLE RatingsPharm
(
	IDPharm	int not null identity,
	Rating	int not null,
	IDUser	int not null,

	CONSTRAINT PKIDPharmF PRIMARY KEY (IDPharm),
	CONSTRAINT FKIDUserF FOREIGN KEY(IDUser) REFERENCES Usuario(IDUser)
)

CREATE TABLE RatingsMed
(
	IDMed	int not null identity,
	Rating	int not null,
	IDUser	int not null,

	CONSTRAINT FKIDMedM FOREIGN KEY(IDMed) REFERENCES Medicamentos(IDMed),
	CONSTRAINT FKIDUserM FOREIGN KEY(IDUser) REFERENCES Usuario(IDUser)
)

*/

SELECT * FROM Usuario
SELECT * FROM Medicamentos
SELECT * FROM RatingsPharm
SELECT * FROM RatingsMed
SELECT * FROM Farmacias

INSERT INTO Medicamentos
VALUES 
	('Dorflex','DORES MUSCULARES'),
	('Buscofem','CÓLICAS MENSTRUAIS'),
	('ACETATO DE MEDROXIPROGESTERONA 150MG','ANTICONCEPÇÃO'),
	('ALENDRONATO DE SÓDIO 70MG','OSTEOPOROSE'),
	('ATENOLOL 25MG','HIPERTENSÃO (PRESSÃO ALTA)'),
	('BROMETO DE IPRATRÓPIO 0,02MG','ASMA'),
	('BROMETO DE IPRATRÓPIO 0,25MG','ASMA'),
	('BUDESONIDA 32MCG','RINITE'),
	('CAPTOPRIL 25MG ','HIPERTENSÃO (PRESSÃO ALTA)'),
	('CARBIDOPA 25MG + LEVODOPA 250MG','PARKINSON'),
	('CLORIDRATO DE BENSERAZIDA 25MG + LEVODOPA 100MG','PARKINSON'),
	('CLORIDRATO DE METFORMINA 500MG','DIABETES'),
	('MALEATO DE TIMOLOL 2,5MG','GLAUCOMA'),
	('SINVASTATINA 10MG','DISLIPDEMIA (COLESTEROL ALTO)')
