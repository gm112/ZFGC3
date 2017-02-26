CREATE TABLE `LKUP_NOTIFICATION_FREQUENCY` (
	`NOTIFICATION_FREQUENCY_ID` INT(11) NOT NULL AUTO_INCREMENT,
	`NOTIFICATION_FREQUENCY_DESC` VARCHAR(10) NOT NULL,
	PRIMARY KEY (`NOTIFICATION_FREQUENCY_ID`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=4;

INSERT INTO `LKUP_NOTIFICATION_FREQUENCY` (`NOTIFICATION_FREQUENCY_ID`, `NOTIFICATION_FREQUENCY_DESC`) VALUES
	(0, 'Never'),
	(1, 'Daily'),
	(2, 'Weekly');