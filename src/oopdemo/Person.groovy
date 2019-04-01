package oopdemo

class Person {

    String name

    Integer age

    Person(String name, Integer age) {
        this.name = name
        this.age = age
    }

    def show(){
        println name + age
    }
}
