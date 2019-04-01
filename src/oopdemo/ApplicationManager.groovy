package oopdemo

class ApplicationManager {

    static void init(){
        ExpandoMetaClass.enableGlobally()
        Person.metaClass.static.creatPerson(){ String name,int age->
            new Person(name,age)
        }
    }

}
