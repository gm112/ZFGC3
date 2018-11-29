select `U`.`USERS_ID` AS `USERS_ID`,
       `U`.`LOGIN_NAME` AS `LOGIN_NAME`,
		 `U`.`DISPLAY_NAME` AS `DISPLAY_NAME`,
		 `U`.`PRIMARY_IP` AS `PRIMARY_IP`,
		 `U`.`PRIMARY_MEMBER_GROUP_ID` AS `PRIMARY_MEMBER_GROUP_ID`,
		 `U`.`DATE_REGISTERED` AS `DATE_REGISTERED`,
		 `E`.`EMAIL_ADDRESS` AS `EMAIL_ADDRESS`,
		  E.EMAIL_ADDRESS_ID AS EMAIL_ADDRESS_ID,
		 `U`.`LAST_LOGIN` AS `LAST_LOGIN`,
		 `I`.`PERSONAL_TEXT` AS `PERSONAL_TEXT`,
		 `I`.`GENDER_ID` AS `GENDER_ID`,
		 `I`.`BIRTH_DATE` AS `BIRTH_DATE`,
		 `U`.`USER_TITLE` AS `USER_TITLE`,
		 `S`.`HIDE_EMAIL_FLAG` AS `HIDE_EMAIL_FLAG`,
		 `S`.`HIDE_GENDER_FLAG` AS `HIDE_GENDER_FLAG`,
		 `S`.`HIDE_BIRTH_DATE_FLAG` AS `HIDE_BIRTH_DATE_FLAG`,
		  S.USER_SECURITY_SETTINGS_ID,
		 `U`.`TIME_OFFSET` AS `TIME_OFFSET`,
		 `T`.`TIME_ZONE` AS `TIME_ZONE`,
		 I.SIGNATURE,
		 C.SKYPE,
		 C.GTALK,
		 C.STEAM,
		 C.NNID,
		 C.XBOX_LIVE,
		 C.PSN,
		 C.USER_CONTACT_SETTINGS_ID,
		 S.HIDE_SKYPE_FLAG,
		 S.HIDE_GTALK_FLAG,
		 S.HIDE_STEAM_FLAG,
		 S.HIDE_NNID_FLAG,
		 S.HIDE_XBOX_LIVE_FLAG,
		 S.HIDE_PSN_FLAG,
		 A.AVATAR_ID,
		 A.AVATAR_FILENAME,
		 A.AVATAR_URL,
		 A.AVATAR_GALLERY_ID,
		 A.AVATAR_TYPE_ID,
		 AG.AVATAR_FILE_PATH,
		 I.CUSTOM_TITLE,
		 I.LOCATION,
		 I.WEBSITE_TITLE,
		 I.WEBSITE_URL,
		 I.USER_PERSONAL_INFO_ID,
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
		 JOIN USER_CONTACT_SETTINGS C ON C.USERS_ID = U.USERS_ID 
		 JOIN USER_SECURITY_SETTINGS S ON S.USERS_ID = U.USERS_ID
		 JOIN USER_PERSONAL_INFO I ON I.USERS_ID = U.USERS_ID
		 JOIN EMAIL_ADDRESS E ON E.EMAIL_ADDRESS_ID = C.EMAIL_ADDRESS_ID
		 join `LKUP_MEMBER_GROUP` `G` on `U`.`PRIMARY_MEMBER_GROUP_ID` = `G`.`MEMBER_GROUP_ID`
		 join `LKUP_TIMEZONES` `T` on `T`.`LKUP_TIMEZONES_ID` = `U`.`TIME_OFFSET`