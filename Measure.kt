fun main(){
    //store conversion values 
    val kmToMi = 0.621371
    print("Enter value: ")

        var stringInput = readLine()
    //toDouble converts the Int to Decimal
    val numericValue= stringInput!!.toDouble()
    
    print("Enter unit of measurement (km or mi)")
    val unitOfMeasurement = readLine()

    var result: Double = 0.0
 
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