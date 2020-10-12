object EmployeeDemo{
  class Employee(var empID: String, var empName: String, var location: String, var salary: Int) {
    
    def getEmpName(empID: String):String = {
      return this.empName
    }
    
    def incrementSalary(empID: String, salIncPct: Int): Int = {
      return (this.salary + ((this.salary / 100) * salIncPct))
    }
  }

  def main(args:Array[String]):Unit = {
    val e1 = new Employee("001","2KAbhishek","Bangalore",35000) 
    println(e1.getEmpName(e1.empID))
    println(e1.incrementSalary(e1.empID,10))
    }

}
