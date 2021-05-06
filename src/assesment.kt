fun main() {
var detail=introduction("Hellen",19)
    println(detail)
println(juiceDispenser(5))
    println(juiceDispenser(7))
    println(juiceDispenser(16))
var namesArray= arrayOf("Florence","Gift","Sheillah","Wato","Shallon")
multiply()
    sum()
    divide()
   println (Human("gIFT",23,6))


}
fun introduction(Name:String,age:Int){
    print("My name is $Name And am 19 years old ")
}
fun juiceDispenser(age:Int){
    if (age<=6){
        println("serve students a glass of milk")
    }else if(age>6 && age<15){
        print("serve students a bottle of Fanta")
    }
    else{
        println("serve the remaining lot coca cola")
    }
}
fun names(names:String):String{

    fun oddNames(names:Array<String>):Int {
        var counter = 0
        for (name in names) {
            if (name.length > 4) {
            }
            }
            return counter
    }}

    fun sum() {
        var num1 = 3
        var num2 = 5

        var totalsum = num1 + num1
        println(totalsum)
    }
        fun multiply() {
            var num1 = 3
            var num2 = 5

            println(num1 % num2)}
    fun divide(){
        var num1 = 9
        var num2 = 3
    var modulus=num1%num2
    println(modulus)
    }

// no3
class Human(name:String,age:Int,weight:Int){
fun foodWeight(){
    println("I am eating $ {foodWeight} kgs of food")
}


}
//no8








