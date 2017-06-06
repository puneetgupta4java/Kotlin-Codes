
fun main(args : Array<String>){
	
	var num : Int = 2
	
	// normal statement
	when(num){
		1 -> println("one")
		2 -> println("two")
		else -> println("give proper input")
	}
	
	//as a expression
	
	var str = when(num){
		1 -> "one"
		2 -> "two"
		else -> "proper input required"
	}
	println(str)
}