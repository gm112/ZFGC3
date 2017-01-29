CREATE TABLE `BR_MEMBER_GROUP_NAV_TAB` (
	`NAV_TAB_ID` INT(11) NOT NULL,
	`MEMBER_GROUP_ID` INT(11) NOT NULL,
	PRIMARY KEY (`NAV_TAB_ID`, `MEMBER_GROUP_ID`),
	INDEX `FK_NAV_TAB_MEMBER_GROUP_ID` (`MEMBER_GROUP_ID`),
	CONSTRAINT `FK_NAV_TAB_ID_NAV_TAB_ID` FOREIGN KEY (`NAV_TAB_ID`) REFERENCES `NAV_TAB` (`NAV_TAB_ID`),
	CONSTRAINT `FK_NAV_TAB_MEMBER_GROUP_ID` FOREIGN KEY (`MEMBER_GROUP_ID`) REFERENCES `LKUP_MEMBER_GROUP` (`MEMBER_GROUP_ID`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

INSERT INTO `BR_MEMBER_GROUP_NAV_TAB` (`NAV_TAB_ID`, `MEMBER_GROUP_ID`) VALUES
	(0, 0),
	(1, 0),
	(4, 0),
	(0, 1),
	(1, 1),
	(2, 1),
	(3, 1),
	(4, 1),
	(5, 1),
	(6, 1),
	(0, 2),
	(1, 2),
	(2, 2),
	(3, 2),
	(4, 2),
	(5, 2),
