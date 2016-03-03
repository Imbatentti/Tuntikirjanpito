CREATE TABLE KAYTTAJAT (
kayttaja_id int NOT NULL AUTO_INCREMENT,
kayttajatunnus varchar(50) NOT NULL,
email varchar(50) NOT NULL,
etunimi varchar(50) NOT NULL,
sukunimi varchar(50) NOT NULL,
salasana varchar(500) NOT NULL,
PRIMARY KEY (kayttaja_id)
);
ALTER TABLE KAYTTAJAT AUTO_INCREMENT=1;

CREATE TABLE TUNNIT (
tunti_id int NOT NULL AUTO_INCREMENT,
tuntien_maara DECIMAL(5,2) NOT NULL,
paivamaara TIMESTAMP NULL,
kuvaus varchar(1000),
kayttaja_id int NOT NULL,
PRIMARY KEY (tunti_id),
FOREIGN KEY (kayttaja_id) REFERENCES KAYTTAJAT(kayttaja_id)
);
ALTER TABLE TUNNIT AUTO_INCREMENT=1;