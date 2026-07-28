# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Department d JOIN Employee e ON  d.id = e.departmentId JOIN (
    SELECT departmentId , MAX(salary) AS maxSalary FROM Employee GROUP BY departmentId
) m ON e.departmentId = m.departmentId WHERE e.salary = m.maxSalary;