
fun main(args : Array<String>){
	
	var str1: String ="puneet"
	var str2 : String ="puneet"
	var str3 : String = "Puneet"
	
	//same as java
	if(str1.equals(str2))
		println("same strings by method 1")
	else
		println("not same strings by method1")
	
	//now ignore case by kotlin
	if(str1.equals(str3,true))
		println("same strings by ignoring case by method 2")
	else
		println("not same strings by method 2")
	
	//new in kotlin
	if(str1 == str2)
		println("same strings by method 3")
	else
		println("not same strings by method 3")
}