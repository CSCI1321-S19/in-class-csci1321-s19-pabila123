package basics

class Entity (
  private var x: Double = 0.0,
  private var y: Double = 0.0
){
  private var width = 1.0
  private var height = 1.0
  
  def intersects(e: Entity): Boolean = {
    var overlapX = (x - e.x).abs < (width + e.width)/2
    var overlapY = (y - e.y).abs < (height + e.height)/2
    overlapX && overlapY
  }
}

object Entity {
  def main(args: Array[String]): Unit = {
    val e1 = new Entity(0,0)
    val e2 = new Entity(0,0)
    println(e1.intersects(e2))
    val e3 = new Entity(10,0)
    println(e1.intersects(e3))
  }
}