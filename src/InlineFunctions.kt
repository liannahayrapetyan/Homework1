
inline fun calculate(a: Int, b: Int, operation:(Int, Int)->Int): Int {
    // operation:(Int, Int)->Int)- օբյեկտ չի դառնում
    return a + b
}

inline fun calculate(a: Int, b: Int): Int {
    return a + b
}


// inline function - in case of "inline calculate", a+b is directl
/*

1․ բայթ կոդը շատանում է,
2․ private-ին հասանելիություն չունի,
3․ public-ին հասանելիություն ունի,
4. noinline operation:(Int, Int)->Int) - այն ունենաք
*/

fun main(args: Array<String>) {
    // val result = calculate(10,20,{a, b -> a+b})
    val result = calculate(10, 20)
    println(result)
}