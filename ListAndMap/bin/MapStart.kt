import java.util.TreeMap

fun main(args : Array<String>){
	
	var Aliens = TreeMap<String,Int>()
	
	Aliens["puneet"] = 400
	Aliens["abhay"] = 300
	Aliens["shubham"] = 350
	
	for((name,marks) in Aliens){
		println("$name : $marks")
	}
	
}