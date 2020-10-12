import scala.collection.mutable.HashMap 
object EmployeeCompanion{

  val locMap: HashMap[String,String] = HashMap("BDC"->"Bangalore", "CDC"->"Chennai",
                                               "HDC"->"Hyderabad", "Others"->"Unknown")
  
  def main(args:Array[String]):Unit = {
    println(getEmployeeLocation("BDC"))
    }
  
  def getEmployeeLocation(locID:String): String = {
    return locMap(locID)
  }

}
