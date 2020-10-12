object GetSalary{

  def main(args:Array[String]):Unit = {
    println("Final Salary = " + getFinalSal(20000, 5, 5000))
    }

  def getFinalSal(salary: Double, incPer: Double, bonus: Double): Double = {
    return salary * (1 + incPer) + bonus
  }
}
