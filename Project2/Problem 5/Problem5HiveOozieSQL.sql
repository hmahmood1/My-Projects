CREATE DATABASE IF NOT EXISTS UN_POPULATION_STATS;

USE UN_POPULATION_STATS;

-- SELECT COUNTRY_NAME, COUNTRY_CODE, INDICATOR_NAME, INDICATOR_CODE,
-- Y1990, Y1991, Y1992, Y1993, Y1994, Y1995, Y1996, Y1997, Y1998, Y1999,
-- Y2000, Y2001, Y2002, Y2003, Y2004, Y2005, Y2006, Y2007, Y2008, Y2009,
-- Y2010, Y2011, Y2012, Y2013, Y2014, Y2015
-- FROM un_stats_table
-- WHERE INDICATOR_CODE = 'SH.H2O.SAFE.ZS';

-- CREATE VIEW WATER_PURITY AS 
-- SELECT COUNTRY_NAME, COUNTRY_CODE, INDICATOR_NAME, INDICATOR_CODE,
-- Y1990, Y1991, Y1992, Y1993, Y1994, Y1995, Y1996, Y1997, Y1998, Y1999,
-- Y2000, Y2001, Y2002, Y2003, Y2004, Y2005, Y2006, Y2007, Y2008, Y2009,
-- Y2010, Y2011, Y2012, Y2013, Y2014, Y2015
-- FROM un_stats_table
-- WHERE INDICATOR_CODE = 'SH.H2O.SAFE.ZS';

-- CREATE VIEW WATER_PURITY2 AS
-- SELECT COUNTRY_NAME, COUNTRY_CODE, INDICATOR_NAME, INDICATOR_CODE,
-- (CASE WHEN Y1990 = '' THEN 0 ELSE Y1990 END) AS Y1990,
-- (CASE WHEN Y2015 = '' THEN 0 ELSE Y2015 END) AS Y2015
-- FROM WATER_PURITY;

SELECT COUNTRY_NAME, COUNTRY_CODE, INDICATOR_NAME, INDICATOR_CODE,
(Y2015 - Y1990) AS WATER_PURITY_PERCENT_CHANGE
FROM WATER_PURITY2;