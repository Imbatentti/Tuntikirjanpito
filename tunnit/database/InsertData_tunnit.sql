INSERT INTO KAYTTAJAT (kayttajatunnus, email, etunimi, sukunimi, salasana)
VALUES ('Raikka', 'rainer.uppala@myy.haaga-helia.fi', 'Rainer', 'Uppala', 'tunnit1');

INSERT INTO KAYTTAJAT (kayttajatunnus, email, etunimi, sukunimi, salasana)
VALUES ('Juha', 'juha.vanhamaki@myy.haaga-helia.fi', 'Juha', 'Vanhamäki', 'tunnit2');

INSERT INTO KAYTTAJAT (kayttajatunnus, email, etunimi, sukunimi, salasana)
VALUES ('Jani', 'jani.tapaninen@myy.haaga-helia.fi', 'Jani', 'Tapaninen', 'tunnit3');

INSERT INTO KAYTTAJAT (kayttajatunnus, email, etunimi, sukunimi, salasana)
VALUES ('Joni', 'joni.lundgren@myy.haaga-helia.fi', 'Joni', 'Lundgren', 'tunnit4');

INSERT INTO KAYTTAJAT (kayttajatunnus, email, etunimi, sukunimi, salasana)
VALUES ('Testi', 'testi.asd@myy.haaga-helia.fi', 'Testi', 'Mies', 'testimies');

INSERT INTO OIKEUDET(oikeudet_id, rooli)
VALUES (1,'kayttaja'), (2,'admin');

INSERT INTO KAYTTAJAOIKEUDET(id, kayttajan_id, oikeus_id)
VALUES (1,1,2),(2,2,2),(3,3,2),(4,4,2),(5,5,1);
