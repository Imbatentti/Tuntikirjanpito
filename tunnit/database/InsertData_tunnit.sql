INSERT INTO KAYTTAJAT (kayttajatunnus, email, enabled, etunimi, sukunimi, salasana)
VALUES ('Raikka', 'rainer.uppala@myy.haaga-helia.fi', 1, 'Rainer', 'Uppala', 'tunnit1');

INSERT INTO KAYTTAJAT (kayttajatunnus, email, enabled, etunimi, sukunimi, salasana)
VALUES ('Juha', 'juha.vanhamaki@myy.haaga-helia.fi', 1, 'Juha', 'Vanhamäki', 'tunnit2');

INSERT INTO KAYTTAJAT (kayttajatunnus, email, enabled, etunimi, sukunimi, salasana)
VALUES ('Jani', 'jani.tapaninen@myy.haaga-helia.fi', 1, 'Jani', 'Tapaninen', 'tunnit3');

INSERT INTO KAYTTAJAT (kayttajatunnus, email, enabled, etunimi, sukunimi, salasana)
VALUES ('Joni', 'joni.lundgren@myy.haaga-helia.fi', 1, 'Joni', 'Lundgren', 'tunnit4');

INSERT INTO KAYTTAJAT (kayttajatunnus, email, enabled, etunimi, sukunimi, salasana)
VALUES ('Testi', 'testi.asd@myy.haaga-helia.fi',1, 'Testi', 'Mies', '8d4be08f08a436f06c1f3aedfb112856082edf81f729b6820ede750db5ef923c962146dcb0b8475c');

INSERT INTO OIKEUDET(oikeudet_id, rooli)
VALUES (1,'kayttaja'), (2,'admin');

INSERT INTO KAYTTAJAOIKEUDET(id, kayttajan_id, oikeus_id)
VALUES (1,1,1),(2,1,2),(3,2,1),(4,2,2),(5,3,1),(6,3,2),(7,4,1),(8,4,2),(9,5,1);
