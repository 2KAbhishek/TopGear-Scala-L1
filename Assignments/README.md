# Exercises

1. Create a function to compute final salary using the following formula.

   finalSalary = salary \* ( 1 + incrementPercent) + bonus

   where salary, incrementPercent, bonus are input arguments

2. Modify the above function to apply default valued for below input parameters:

   incrementPercent = 0.05

   bonus = 5000

3. Store the following list of values using appropriate collections.

   EmpName,Loc,Salary

   Ramesh,BDC,55000

   Janaki,CDC,45000

   Kailash,BDC,60000

   Lijo,CDC,51000

   Create a function which accepts the collection as input and returns average salary

4. Create a employee class to create employee records using following class variables and methods:

   Variables:

   empID String

   empName String

   location String

   salary Int

   Methods:

   getEmpName(empID)

   incrementSalary(empID, salIncPct) ->> returns salary post increment

   Create a default constructor to generate employee records with all 4 variables.

5. In the above employee class, create an auxiliary constructor which allows creating employee instances with no location assigned.

6. Create a companion object for above employee class with following method

   getEmployeeLocation(locID)

   returns location using the below HashMap

   location(BDC) = Bangalore

   location(CDC) = Chennai

   location(HDC) = Hyderabad

   location(Others) = Unknown
