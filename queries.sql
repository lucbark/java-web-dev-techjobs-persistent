## Part 1: Test it with SQL
--List the columns and their data types in the table
SHOW COLUMNS FROM job IN techjobs;
## Part 2: Test it with SQL
--Write a query to list the names of the employers in St. Louis City.
SELECT name FROM techjobs.employer
 WHERE location = 'St. Louis City ';
## Part 3: Test it with SQL
--Write the Sql statement to remove the job table
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE job;
SET FOREIGN_KEY_CHECKS=1;
## Part 4: Test it with SQL
SELECT skill.name, skill.description
FROM skill, job_skills, job
WHERE job_skills.skills_id = skill.id
AND job_skills.jobs_id = job.id
ORDER BY skill.name, skill.description