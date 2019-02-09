create table Address
(
  ID         int auto_increment,
  country    VARCHAR(256) not null,
  city       VARCHAR(256) not null,
  post_index int          null,
  price      int          null,
    primary key (ID)
);

create table People
(
  ID        int auto_increment,
  age       int          not null,
  name      VARCHAR(256) not null,
  last_name VARCHAR(256) not null,
  salary    int          not null,
    primary key (ID)
);

INSERT INTO `homework`.`Address`
  (`country`, `city`, `post_index`, `price`)
VALUES ('Ukraine', 'Kiev', 12444211, 1000000);

INSERT INTO `homework`.`People`
  (`age`, `name`, `last_name`, `salary`)
VALUES (33, 'Mike', 'White', 30000);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (22, 'Dima', 'Bruno', 25325);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (34, 'Lina', 'Su', 53232);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (77, 'Mike', 'Kirov', 57464);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (18, 'Lena', 'Mukolova', 9335);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (55, 'Kiril', 'Yanov', 34532);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (88, 'Rinat', 'Kunicin', 34521);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (44, 'Marcus', 'Chu', 347654);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (98, 'Piter', 'Jacson', 57434);
INSERT INTO `homework`.`People` (`age`, `name`, `last_name`, `salary`)
VALUES (25, 'Mona', 'Light', 3946);

INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Ukraine', 'Odessa', 43523, 52324);
INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Ukraine', 'Kiev', 35423, 676675);
INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Ukraine', 'Dnipro', 4534352, 5675765);
INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Ukraine', 'Dnipro', 7866876, 6576);
INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Ukraine', 'Odessa', 7868766, 5765);
INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Russia', 'Moscow', 65564, 65775);
INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Russia', 'Piter', 87877, 5765765);
INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Russia', 'Moscow', 67565, 56757);
INSERT INTO `homework`.`Address` (`country`, `city`, `post_index`, `price`)
VALUES ('Russia', 'Riga', 57576876, 897889);


INSERT INTO `homework`.`Address`
  (`ID`, `country`, `city`, `post_index`, `price`)
VALUES (22, 'Angola', 'Luanda', 432234, 532332);
INSERT INTO `homework`.`Address`
  (`ID`, `country`, `city`, `post_index`, `price`)
VALUES (23, 'Algeria', 'Algiers', null, 243223);

INSERT INTO `homework`.`People` (`ID`, `age`, `name`, `last_name`, `salary`)
VALUES (44, 44, 'Kuto', 'Ruba', 54223);
INSERT INTO `homework`.`People` (`ID`, `age`, `name`, `last_name`, `salary`)
VALUES (45, 54, 'Nastia', 'Mira', 34321);


SELECT name,last_name,Address.post_index from People left join  Address on People.ID = Address.Id;
SELECT * from Address left join People on Address.id=People.ID;

select * from People inner join Address on People.ID=Address.ID;
select * from Address inner join People on Address.ID=People.ID;