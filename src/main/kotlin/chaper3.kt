
// 키워드 함수명 (파러미터명: 파라미터타입) : 리턴타입 으로 정의됨
// 파라미터는 항상 타입을 지정해야한다.
fun wideCircle(r : Double) : Double{
    // r +=1; 코틀린에서 함수 파라미터는 불변. 바꿀 수 없다...!
    return 3.14*r*r
}

// 다만 배열의 경우 주소값(참조)만 복사하므로, 배열 안의 값은 함수 안에서 바꿀 수 잇따.
fun increment(a: IntArray) : Int{
    return ++a[0];
}

// 반환타입도 명시해야한다. 다만 void인 경우 Unit 타입으로 명시하지 않아도 됨.
fun prompt(name: String) : Unit{
    println("unit" + name)
}

// 반환타입도 명시해야한다.
// 다만 void인 경우 Unit 타입으로 명시하지 않아도 됨.
fun prompt2(name: String){
    println("unit" + name)
}

// 식이 본문힌 함수도 값 추론 가능하므로 반환타입 생략 가능
private fun prompt3(r : Double) = r*r

// 디폴트 값이 정해진 함수
fun defaultTest(a: Int = 10){
    println(a);
}

// 인자 개수가 정해지지 않은 함수, 배열도 받을 수 있음.
fun varargTest(vararg items:Int ){
    items.sort();
    println(items.contentToString());
}

fun change(vararg items:IntArray){
   items[0][1] = 1
}

fun main() {
    println("Asd")
    println(wideCircle(4.0))

    val a = intArrayOf(1,2,3);
    println(increment(a)); // 배열 안 값이 바뀜
    println(a.contentToString())
    prompt("adf")
    prompt2("def")
    println(prompt3(123.2))


    // 파라미터의 이름을 명시해서 인자를 호출할 수 있다. = 이름 기반 인자
    // 자바나 씨언어 처럼 위치기반 인자도 가능
    var b = 2.3;
    println(prompt3(r = b))
    defaultTest();

    varargTest(1,7,2,4)

    // 배열을 넣을 땐 스프레드 연산자 *를 넘기면 된다.
    val numbers = intArrayOf(6,2,4)
    varargTest(*numbers)
    //  스프레드는 배열을 복사하여, 원본 원소는 그대로임!
    println(numbers.contentToString())

    val numbers2 = intArrayOf(2,5,3)
    change(numbers2)
    println(numbers2.contentToString())

    val a1= 10
    val a2 = 20
    println( if (a1>a2) a1 else a2 )

    // 범위 진행 연산
    val chars = 'a'..'h'
    var chars2 = IntArray(5);
    chars2[2] = 1

    var num = 3

    // 저 범위에 num이 있니? in은 끝값 포함
    println(num in 10..99)
    println(chars2.contentToString());

    // until은 끝값 미포함
    println(5 in 1 until 10);

    // 아래로 내려감
    println(5 in 10 downTo 1)

    // 간격 지정 가능
    //1..12 set 3이면 1 4 7 10...
    println(15 downTo 9 step 2) //2간격

    //for

    val afor = IntArray(10){it*it}
    var sum = 0

    for(x in afor){ // 범위 연산자랑 같이 쓸 수 있다.
        sum += x;
    }
    println(sum)

    val forArray = IntArray(10){it}
    for(i in 0..forArray.lastIndex){
        println(forArray[i])
    }

    // 예외 던지기
    var numE = 0;
    var s:String = "asdfabsdfa"
    //if(s.length !in 1..4) throw java.lang.NumberFormatException("범위를 벗어났수다")

    // 예외 처리
    try {
        var a12 = readLine()!!.toInt()
        println(a12) // 실패하면 여기 안거치고 바로 catch로 감
    }catch (e:java.lang.NumberFormatException){
        println("넘어감")
    }
}
