import kotlin.math.pow

open class Point(_cordinatx:Double,_cordinaty: Double)
{
    var cordinatx:Double = 2.0
    var cordinaty:Double = 4.0

    init {
        cordinatx =_cordinatx
        cordinaty =_cordinaty
    }
}

open class ColoredPoint (_color:String, _cordinatX:Double, _cordinatY: Double): Point(_cordinatX, _cordinatY)
{
    var color: String
  init {
      color =_color
  }

}

open class Lines(_firstPoint:Point, _secondPoint:Point)
{
    var firstPoint: Point
    var secondPoint: Point
    init {
        firstPoint=_firstPoint
        secondPoint=_secondPoint
    }
}

open class LineColor(_color:String, _firstPoint:Double, _secondPoint: Double):Lines(_firstPoint, _secondPoint)
{
var color: String
    init {
        color = _color
    }
}

open class Poligon(_point1:Point, _point2:Point, _point3:Point, _point4:Point,)
{
    var point1: Point
    var point2: Point
    var point3: Point
    var point4: Point
    init {
        point1 = _point1
        point2 = _point2
        point3 = _point3
        point4 = _point4
    }
}

private  fun MathLength(): Double
{
    return  Math.sqrt((secondPoint.cordinaty - firstpoint.cordinatx).pow(2)+(secondPoint.cordinaty - firstpoint.cordinatx))
}


fun main(args: Array<String>) {

}