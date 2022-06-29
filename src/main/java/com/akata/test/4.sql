create table etudiant(
    nom varchar(100),
    prenom varchar (200) not null,
    age TINYINT(100) not null,
    numero_imatriculation INT AUTO_INCREMENT NOT NULL,
    PRIMARY KEY (numero_imatriculation)
);

CREATE TABLE matiere(
    code_matiere varchar(10) NOT NULL,
    nom VARCHAR(150) NOT NULL,
    coefficient INT,
    PRIMARY KEY (code_matiere)
);

CREATE TABLE note(
    numero_imatriculation INT,
    code_matiere  varchar(10),
    valeur INT NOT NULL,
    CONSTRAINT FK_etudiant FOREIGN KEY (numero_imatriculation)
        REFERENCES etudiant(numero_imatriculation),
    CONSTRAINT FK_matiere FOREIGN KEY (code_matiere)
        REFERENCES matiere(code_matiere)
);