fun main() {
    var soma: Int = 0

    for (i in 3 .. 500 step 3){
        if(i%2==i){
            println(i)
            soma+=i
        }
    }
           print(soma)

}
