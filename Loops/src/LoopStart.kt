
fun main(args : Array<String>){
	
	var num1 = 1 .. 16
	var num2 = 16 downTo 1
	var num3 = 16.downTo(1)
	var num4 = 1 until 16
	// traverse the range
	for(a in num1)
		println(a)
	
	println("********************")
	
	
	//now to print them in steps
	for(a in num1 step 2)
		println(a)
	println("********************")
	
	
	//traverse in reverse
	for(a in num2)
		println(a)
	for(a in num3)
		println(a)
	
	println("********************")
	
	
	//travese in reverse by second method
	for(a in num1.reversed())
		println(a)
	
	println("********************")
	
	//now count the values
	println(num1.count())
	println(num4.count())
	println("********************")

}