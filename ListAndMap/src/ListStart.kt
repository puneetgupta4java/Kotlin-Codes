
fun main(args : Array<String>){
	 
	var	nums = listOf(1,2,3,4)
			
	// normal iteration
	for(i in nums){
		println(i)
	}
	
	println("************************")
	
	//iteration with index
	for((i,e) in nums.withIndex()){
		println("$i : $e")
	}
}