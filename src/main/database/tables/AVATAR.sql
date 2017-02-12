CREATE TABLE `AVATAR` (
	`AVATAR_ID` INT(11) NOT NULL AUTO_INCREMENT,
	`AVATAR_FILENAME` VARCHAR(256) NULL DEFAULT NULL,
	`AVATAR_URL` VARCHAR(256) NULL DEFAULT NULL,
	`AVATAR_GALLERY_ID` INT(11) NULL DEFAULT NULL,
	`AVATAR_TYPE_ID` INT(11) NOT NULL,
	PRIMARY KEY (`AVATAR_ID`),
	INDEX `FK_AVATAR_AVATAR_GALLERY_ID` (`AVATAR_GALLERY_ID`),
	INDEX `FK_AVATAR_AVATAR_TYPE_ID` (`AVATAR_TYPE_ID`),
	CONSTRAINT `FK_AVATAR_AVATAR_TYPE_ID` FOREIGN KEY (`AVATAR_TYPE_ID`) REFERENCES `LKUP_AVATAR_TYPE` (`AVATAR_TYPE_ID`),
	CONSTRAINT `FK_AVATAR_AVATAR_GALLERY_ID` FOREIGN KEY (`AVATAR_GALLERY_ID`) REFERENCES `LKUP_AVATAR_GALLERY` (`AVATAR_GALLERY_ID`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=3
;
