-- 코드를 입력하세요
SELECT YEAR(SALES_DATE) YEAR, MONTH(SALES_DATE) MONTH, GENDER, COUNT(DISTINCT A.USER_ID) AS USERS
FROM ONLINE_SALE A
JOIN USER_INFO U ON A.USER_ID = U.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER
ORDER BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER
