select `U`.`USERS_ID` AS `USERS_ID`,
       `U`.`LOGIN_NAME` AS `LOGIN_NAME`,
		 `U`.`DISPLAY_NAME` AS `DISPLAY_NAME`,
		 `U`.`PRIMARY_IP` AS `PRIMARY_IP`,
		 `U`.`PRIMARY_MEMBER_GROUP_ID` AS `PRIMARY_MEMBER_GROUP_ID`,
		 `U`.`DATE_REGISTERED` AS `DATE_REGISTERED`,
		 `U`.`EMAIL_ADDRESS` AS `EMAIL_ADDRESS`,
		 `U`.`LAST_LOGIN` AS `LAST_LOGIN`,
		 `U`.`PERSONAL_TEXT` AS `PERSONAL_TEXT`,
		 `U`.`GENDER_ID` AS `GENDER`,
		 `U`.`BIRTH_DATE` AS `BIRTH_DATE`,
		 `U`.`USER_TITLE` AS `USER_TITLE`,
		 `U`.`HIDE_EMAIL_FLAG` AS `HIDE_EMAIL_FLAG`,
		 `U`.`HIDE_AGE_FLAG` AS `HIDE_AGE_FLAG`,
		 `U`.`HIDE_GENDER_FLAG` AS `HIDE_GENDER_FLAG`,
		 `U`.`HIDE_BIRTH_DATE_FLAG` AS `HIDE_BIRTH_DATE_FLAG`,
		 `U`.`TIME_OFFSET` AS `TIME_OFFSET`,
		 `T`.`TIME_ZONE` AS `TIME_ZONE`,
		 U.SKYPE,
		 U.AIM,
		 U.YIM,
		 U.GTALK,
		 U.STEAM,
		 U.NNID,
		 U.XBOX_LIVE,
		 U.PSN,
		 U.HIDE_SKYPE_FLAG,
		 U.HIDE_AIM_FLAG,
		 U.HIDE_YIM_FLAG,
		 U.HIDE_GTALK_FLAG,
		 U.HIDE_STEAM_FLAG,
		 U.HIDE_NNID_FLAG,
		 U.HIDE_XBOX_LIVE_FLAG,
		 U.HIDE_PSN_FLAG,
		 A.AVATAR_ID,
		 A.AVATAR_FILENAME,
		 A.AVATAR_URL,
		 A.AVATAR_GALLERY_ID,
		 A.AVATAR_TYPE_ID,
		 AG.AVATAR_FILE_PATH,
		 U.CUSTOM_TITLE,
		 U.LOCATION,
		 U.WEBSITE_TITLE,
		 U.WEBSITE_URL,
		 N.NOTIFICATION_SETTINGS_ID,
		 N.AUTO_SUBSCRIBE_FLAG,
		 N.SEND_POST_IN_EMAIL_FLAG,
		 N.INSTANT_FLAG,
		 N.ONLY_FIRST_FLAG,
		 N.REPLIES_FLAG,
		 N.MODERATION_FLAG,
		 N.ONLY_ME_FLAG,
		 N.KARMA_EMAIL_FLAG,
		 N.KARMA_PM_FLAG,
		 N.TAGGED_EMAIL_FLAG,
		 N.TAGGED_PM_FLAG,
		 N.PM_EMAIL_FLAG,
		 N.FREQUENCY_ID,
		 N.REPLIES_TO_ME_FLAG,
		 N.POSTED_IN_FLAG,
		 P.PERSONAL_MESSAGING_SETTINGS_ID,
		 P.DISPLAY_SETTING_ID,
		 P.RECENT_AT_TOP_FLAG,
		 P.RECEIVE_FROM_ID,
		 P.NOTIFY_FREQUENCY_ID,
		 P.SAVE_TO_SENT_FLAG
		 from `users` `U` 
		 LEFT JOIN `AVATAR` `A` on`A`.`AVATAR_ID` = `U`.`AVATAR_ID`
		 LEFT JOIN LKUP_AVATAR_GALLERY AG ON AG.AVATAR_GALLERY_ID = A.AVATAR_GALLERY_ID
		 JOIN NOTIFICATION_SETTINGS N ON N.USERS_ID = U.USERS_ID
		 JOIN PERSONAL_MESSAGING_SETTINGS P ON P.USERS_ID = U.USERS_ID
		 join `LKUP_MEMBER_GROUP` `G` on `U`.`PRIMARY_MEMBER_GROUP_ID` = `G`.`MEMBER_GROUP_ID`
		 join `LKUP_TIMEZONES` `T` on `T`.`LKUP_TIMEZONES_ID` = `U`.`TIME_OFFSET`