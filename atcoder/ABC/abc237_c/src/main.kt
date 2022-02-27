fun next() = readLine()!!

fun main(){
    val s = next()

    for (i in 0 until s.length / 2){
        if (s[i] == 'a'){
            if (s[s.length - 1 - i] != 'a'){
                println("No")
                return
            }
        }
        else{
            break
        }
    }

    var s2 = s.trim('a')

    if (s2 == s2.reversed()){
        println("Yes")
    }
    else{
        println("No")
    }
}
