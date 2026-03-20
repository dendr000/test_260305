SELECT NAME
     , EMAIL
     , SUBSTR(SUBSTR(email,INSTR(email,'@')+1),1
     , INSTR(SUBSTR(email,INSTR(email,'@')+1),'.',-1)-1) "DOMAIN"
  FROM professor
 WHERE EMAIL IS NOT NULL;
