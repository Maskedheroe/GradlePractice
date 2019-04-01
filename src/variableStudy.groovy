import oopdemo.Person

/*
int a = 10
println a.class
*/

//
//def str = "string"
//println str.center(11,"a")  //以a填充至11个字符，优先填充后面，若长度小于原字符长度，则不变
/*

def clouser = { String str -> println "Hello ${str}" }
clouser("A")
clouser.call("A")*/

/*
int a = 10

int fun(int number) {
    int result = 1
    1.upto(number, { num -> result *= num })  //num就是1 就是个引用 增加到100
    return result
}

println fun(a)
*/

Person person = new Person("F", 21)
person.metaClass.sex = "female"
person.metaClass.finder() {
    println age + " " + name + " " + sex
}
person.finder()
