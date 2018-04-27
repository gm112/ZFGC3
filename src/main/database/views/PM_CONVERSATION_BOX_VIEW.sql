CREATE OR REPLACE VIEW AS PM_CONVERSATION_BOX_VIEW AS

select C.PM_CONVERSATION_ID,
       PM.RECEIVER_ID as USERS_ID,
       PM.RECEIVER_ID,
       UR.DISPLAY_NAME AS RECEIVER_NAME,
       C.INITIATOR_ID,
       UI.DISPLAY_NAME AS INITIATOR_NAME,
       PM.PERSONAL_MESSAGE_ID,
		 PM.SUBJECT,
		 PM.MESSAGE,
		 PM.SENT_DT,
		 C.START_DT
from PM_CONVERSATION C 
join PERSONAL_MESSAGE PM on PM.PM_CONVERSATION_ID = C.PM_CONVERSATION_ID 
join users UI on UI.USERS_ID = C.INITIATOR_ID
join users UR ON UR.USERS_ID = PM.RECEIVER_ID
join BR_USER_CONVERSATION BRU ON BRU.USERS_ID = PM.RECEIVER_ID AND BRU.PM_CONVERSATION_ID = C.PM_CONVERSATION_ID
left join BR_PM_CONVERSATION_ARCHIVE A ON A.USERS_ID = PM.RECEIVER_ID AND A.PM_CONVERSATION_ID = C.PM_CONVERSATION_ID
where (PM.SENT_DT = (select max(PM2.SENT_DT) 
                      from PERSONAL_MESSAGE PM2 
							 where ((PM2.PM_CONVERSATION_ID = C.PM_CONVERSATION_ID)))) and 
		 PM.SEND_COPY_FLAG = 0 AND
		 A.PM_CONVERSATION_ID IS NULL
		 
UNION

select C.PM_CONVERSATION_ID,
       PM.SENDER_ID AS USERS_ID,
       PM.RECEIVER_ID,
       UR.DISPLAY_NAME AS RECEIVER_NAME,
       C.INITIATOR_ID,
       UI.DISPLAY_NAME AS INITIATOR_NAME,
       PM.PERSONAL_MESSAGE_ID,
		 PM.SUBJECT,
		 PM.MESSAGE,
		 PM.SENT_DT,
		 C.START_DT
from PM_CONVERSATION C 
join PERSONAL_MESSAGE PM on PM.PM_CONVERSATION_ID = C.PM_CONVERSATION_ID 
join users UI on UI.USERS_ID = C.INITIATOR_ID
join users UR ON UR.USERS_ID = PM.SENDER_ID
join BR_USER_CONVERSATION BRU ON BRU.USERS_ID = PM.sender_ID AND BRU.PM_CONVERSATION_ID = C.PM_CONVERSATION_ID
left join BR_PM_CONVERSATION_ARCHIVE A ON A.USERS_ID = PM.SENDER_ID AND A.PM_CONVERSATION_ID = C.PM_CONVERSATION_ID
where (PM.SENT_DT = (select max(PM2.SENT_DT) 
                      from PERSONAL_MESSAGE PM2 
							 where ((PM2.PM_CONVERSATION_ID = C.PM_CONVERSATION_ID)))) and 
		 PM.SEND_COPY_FLAG = 1 AND
		 A.PM_CONVERSATION_ID IS NULL