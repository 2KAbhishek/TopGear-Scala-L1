object EmployeeAux{
  val defLoc = "None"
  class Employee(var empID: String, var empName: String, var location: String, var salary: Int) {
    
    def this(empID: String, empName: String, salary: Int) = {
      this(empID, empName, defLoc, salary)
    }
    
    def getEmpName(empID: String):String = {
      return this.empName
    }
    
    def incrementSalary(empID: String, salIncPct: Int): Int = {
      return (this.salary + ((this.salary / 100) * salIncPct))
    }
  }

  def main(args:Array[String]):Unit = {
    val e1 = new Employee("001","2KAbhishek",55000) 
    println(e1.getEmpName(e1.empID))
    println(e1.incrementSalary(e1.empID,10))
    }

}
