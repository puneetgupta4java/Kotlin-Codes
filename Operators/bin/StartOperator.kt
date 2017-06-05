
fun main(args : Array<String>){
	
	var num1 : Int = 4
	var num2 : Int = 7
	
	println(num1 + num2)
	println(num1 - num2)
	
	var result = num1 + num2
	
	println(result)
	
	println("the sum of $num1 and $num2 is " + result)
	
	var makeobj = Alien()
	makeobj.name = "puneet"
	
	println("my name is : ${makeobj.name}");
	
}