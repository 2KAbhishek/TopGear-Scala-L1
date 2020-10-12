object GetSalaryDef{

  def main(args:Array[String]):Unit = {
    println("Final Salary = " + getFinalSalDef(20000))
    println("Final Salary = " + getFinalSalDef(20000, 0.06, 3000))
    }

  def getFinalSalDef(salary: Double, incPer: Double = 0.05, bonus: Double = 5000): Double = {
    return salary * (1 + incPer) + bonus
  }
}
