## Part 1: Test it with SQL
--List the columns and their data types in the table
SHOW COLUMNS FROM job IN techjobs;
## Part 2: Test it with SQL
--Write a query to list the names of the employers in St. Louis City.
SELECT name FROM techjobs.employer
 WHERE location = 'St. Louis City ';
## Part 3: Test it with SQL
--Write the Sql statement to remove the job table
DROP TABLE job
## Part 4: Test it with SQL


SELECT name, description
FROM skill
INNER JOIN job_skills ON skill.id = skills_id;

SELECT name, description
FROM skill
ORDER BY name, description;