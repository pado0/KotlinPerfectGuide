import java.util.*

fun main() {
   println("hello kotlin world")

   // 불변변수 타입 추론
//   val a = readLine()!!.toInt() // cin , scanf
//   val b = readLine()!!.toInt()
//   println(a+b)

   // 불변변수 타입 명시
   val n: Int = 100
   val text: String = "hello"
   println(text)

   // 불변변수 초기화 나중에
   val x:Int
   x = 123 // 문자가 오면 오류

   // 가변변수
   var sum = 1000;
   sum ++;
   println(sum)

   // 정수타입
   var hundLong = 100L;
   println(hundLong)

   // 부동소수점
   println(Float.MAX_VALUE)

   // 문자열
   val hello_String = "hwllo world"
   println(hello_String)

   // 문자열 템플릿
   val name = readLine()
   println("hello, $name! Today is ${Date()}")

   // 배열 정의하기
   val a = emptyArray<String>()

   // 배열의 크기 알 수 있을 때
   val b = arrayOf("asdf", "Asdf")
   val c = arrayOf(1,4,5)

   val si = 3
   val squares = Array(si){(it+1)*(it+1)} // 중괄호 안은 람다식. 크기가 3인 배열의 크기에 iteration 하면서 자동으로 크기를 증가시키는 it를 사용하여 제곱수를 리턴하는 배열 생성
   println(squares[0])

   //promt3 private라서 호출못함
   // println(prompt3(2.3));
}