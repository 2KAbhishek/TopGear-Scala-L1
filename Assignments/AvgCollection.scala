object AvgCollection{
  class Employee(var EmpName: String, var Loc: String, var Salary: Float)

  def main(args:Array[String]):Unit = {
    val e1 = new Employee("Ramesh","BDC",55000)
    val e2 = new Employee("Janaki", "CDC", 45000)
    val e3 = new Employee("Kailash", "BDC", 60000)
    val e4   = new Employee("Lijo","CDC",51000)
    val empList : List[Employee] = List(e1, e2, e3, e4)
    println("Average = " + avg(empList))
    }

  def avg(empList: List[Employee]): Double = {
    var sum : Double = 0.0
    empList.foreach(sum += _.Salary)
    return sum / empList.length
  }
}
