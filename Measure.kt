/*
fun main(){
    //store conversion values 
    val kmToMi = 0.621371
    print("Enter value: ")

        var stringInput = readLine()
    //toDouble converts the Int to Decimal
    val numericValue= stringInput!!.toDouble()
    
    print("Enter unit of measurement (km or mi)")
    val unitOfMeasurement = readLine()

    var result: Double
 
    if (unitOfMeasurement == "km"){
        result = numericValue * kmToMi
        print("$numericValue in $unitOfMeasurement is $result in miles")
    } else if (unitOfMeasurement == "mi"){
        result = numericValue / kmToMi
        print("$numericValue in $unitOfMeasurement is $result in km")
    } else ( 
        print("$numericValue in $unitOfMeasurement is an unaccepted value")
    )
    
}
*/

/*//Conversion of inches to cm
fun main(){
    //store conversion values 
    val inToCm = 2.54
    print("Enter value: ")

        var stringInput = readLine()
    //toDouble converts the Int to Decimal
    val numericValue= stringInput!!.toDouble()
    
    print("Enter unit of measurement (in or cm)")
    val unitOfMeasurement = readLine()

    var result: Double
 
    if (unitOfMeasurement == "in"){
        result = numericValue * inToCm
        print("$numericValue in $unitOfMeasurement is $result in cm")
    } else if (unitOfMeasurement == "cm"){
        result = numericValue / inToCm
        print("$numericValue in $unitOfMeasurement is $result in in")
    } else ( 
        print("$numericValue in $unitOfMeasurement is an unaccepted value")
    )
    
}

*/
/*//kg to pounds using when
fun main(){
    //store conversion values 
    val kgToLb = 2.2
    print("Enter value: ")

        var stringInput = readLine()
    //toDouble converts the Int to Decimal
    val numericValue= stringInput!!.toDouble()
    
    print("Enter unit of measurement (kg or lb)")
    val unitOfMeasurement = readLine()

    var result: Double
 
    val  = when (unitOfMeasurement) {
        "kg" = print("$numericValue is ${numericValue * kgToLb} Pounds")
        else print ("$numericValue is ${numericValue / kgToLb} kg")
    }
        
    
}*/ 

fun main() {
    val kgToLb = 2.2
    print("Enter value: ")
    var stringInput = readLine()
    val numericValue= stringInput!!.toDouble()


    print("Enter either kg or lb")
    val operator = readLine()

    when (operator) {
        "kg" -> print("$numericValue is ${numericValue*kgToLb} Pounds")
        "lb" -> print("$numericValue is ${numericValue/kgToLb} Kg")
        
        else -> print("$operator is invalid")
    }
}