
fun main(args : Array<String>){
	
	// add by calling function and getting return value
	var result = add(5,2)
	println(result)
	
	// finding max value by calling function
	result = max(10 , 20)
	println(result)
	
	// now  do same work by calling function as a expression
	println(max1(25,15))
}

fun add(a : Int, b : Int) : Int = a+b

fun max(a: Int, b: Int): Int{
	if(a>b)
		return a
	else
		return b
}

fun max1(a:Int,b:Int):Int = if(a>b) a else b