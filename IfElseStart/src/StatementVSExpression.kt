
fun main(args : Array<String>){
	
	var num1 : Int = 4
	var num2 : Int = 7
	var result : Int = 0
	
	//as seen in java too
	
	if(num1 > num2)
		result = num1
	else
		result = num2
	
	println(result)
	
	//new in kotlin
	
	result = if(num1 > num2)
					num1
				else
					num2
	
	println(result)
}