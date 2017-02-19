CREATE TABLE `BR_USERS_FORUM_SUBSCRIPTION` (
	`USERS_ID` INT(11) NOT NULL,
	`FORUM_ID` SMALLINT(5) UNSIGNED NOT NULL,
	`SEND_PM_FLAG` BIT(1) NOT NULL,
	`SEND_EMAIL_FLAG` BIT(1) NOT NULL,
	PRIMARY KEY (`USERS_ID`, `FORUM_ID`),
	INDEX `FK_USERS_FORUM_SUB_FORUM_ID` (`FORUM_ID`),
	CONSTRAINT `FK_USERS_FORUM_SUB_FORUM_ID` FOREIGN KEY (`FORUM_ID`) REFERENCES `FORUM` (`FORUM_ID`),
	CONSTRAINT `FK_USERS_FORUM_SUB_USERS_ID` FOREIGN KEY (`USERS_ID`) REFERENCES `users` (`USERS_ID`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
