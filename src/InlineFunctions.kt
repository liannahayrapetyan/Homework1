
inline fun calculate(a: Int, b: Int, operation:(Int, Int)->Int): Int {
    // operation:(Int, Int)->Int)- օբյեկտ չի դառնում
    return a + b
}

inline fun calculate(a: Int, b: Int): Int {
    return a + b
}

// crossinline - performance benefit exists (meaning that function class is not created, but you still can't  local)
// inline function - in case of "inline calculate", a+b is directly copied here
/*

1․ բայթ կոդը շատանում է,
2․ private-ին հասանելիություն չունի,
3․ public-ին հասանելիություն ունի,
4. noinline operation:(Int, Int)->Int) - լյամբդա չենք կարող փոխանցել եթե inline է
*/

fun main(args: Array<String>) {
    // val result = calculate(10,20,{a, b -> a+b})
    val result = calculate(10, 20)
    println(result)
}