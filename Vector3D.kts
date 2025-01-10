// notes: x, y, and z represent one vector's x y and z cords, while a, b, and c represent the other's.
// x and a are a coord pair, so are y and b and z and c.

class Vector3D(val Double x, val Double y, val Double z){
    // returns the x coord
   fun getX(): Double{
    return x
   }
   // returns the y coord
   fun getY(): Double{
    return y
   }
   // returns the z coord
   fun getZ(): Double{
    return z
   }
    // puts the coords into a formatted String, with two decimal places
   fun toString(val Double x, val Double y, val Double z): String{
    return ("(" + String.format("%.2f", x) + " " + String.format("%.2f", y) + " " + ("%.2f", z) + ")")
   }
    // returns the magnitude of a vector (the square root of each coord squared and added together)
   fun getMagnitude(val Double x, val Double y, val Double z): Double{
    return (sqrt(x*x + y*y + z*z))
   }
    // returns the normalized vector (each coord divided by the magnitude)
   fun normalize(val Double x, val Double y, val Double z): String{
    val Double newX = x/getMagnitude(x,y,z)
    val Double newY = y/getMagnitude(x,y,z)
    val Double newZ = z/getMagnitude(x,y,z)
    return (toString(newX, newY, newZ))
   }
    // adds two vectors together
   fun add(val Double a, val Double b, val Double c, val Double x, val Double y, val Double z): String{
    val Double sumX = a + x 
    val Double sumY = b + y 
    val Double sumZ = c + z 
    return (toString(sumX, sumY, sumZ))
   }
    // multiplies a vector by a predetermined multiplier
   fun multiply(val Double x, val Double y, val Double z, val Double mult): String{
    val Double multX = x * mult 
    val Double multY = y * mult 
    val Double multZ = z * mult 
    return (toString(multX, multY, multZ))
   }
    // does the dot product of two vectors (multipying each coord pair then adding them)
   fun dotProduct(val Double a, val Double b, val Double c, val Double x, val Double y, val Double z): Double{
    return (a*x + b*y + c*z)
   }
    // finds the angle between two vectors (vector a * vector b divided by their magnitude)
   fun angleBetween(val Double a, val Double b, val Double c, val Double x, val Double y, val Double z): Double{
    val Double xAndA = x * a 
    val Double yAndB = y * b 
    val Double zAndC = z * c 
    val Double angleBetween = (Vector3D(xAndA, yAndB, zAndC))/(getMagnitude(a,b,c)*getMagnitude(x,y,z)))
    return angleBetween
   }

    // returns the cross product of each coord pair (x and a, y and b, z and c)
   fun crossProduct(val Double a, val Double b, val Double c, val Double x, val Double y, val Double z): String{
    val Double crossProdx = y * c - z * b
    val Double crossPrody = z * a - x * c
    val Double crossProdz = x * b - y * a
    return (toString(crossProdx, crossPrody, crossProdz))
   }
}