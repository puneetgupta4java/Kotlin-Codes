
fun main(args : Array<String>){
	
	var myname = AlienClass()
	val mine = AlienClass()
	
	myname.name = "puneet"
	println("heyy , i'm " + myname.name)
	mine.name = "gupta"
	println("i'm a " + mine.name)
	myname = AlienClass()
	
	println("now , i'm "+ myname.name)
	println("as val keyword is final we cannot assign it a value again")
	
}