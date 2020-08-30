fun main() {
    var myAnimal = Animal()
    myAnimal.makeNoise()
    myAnimal.eat()
    myAnimal.roam()
    myAnimal.sleep()
    var myHippo = Hippo()
    myHippo.makeNoise()
    myHippo.eat()
    var myFeline = Feline()
    myFeline.roam()
    var myLion = Lion()
    myLion.makeNoise()
    myLion.eat()
    var myCanine = Canine()
    myCanine.roam()
    var myWolf = Wolf()
    myWolf.makeNoise()
    myWolf.eat()
}
open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println(" สัตว์กำลังส่งเสีงร้อง ")
    }
    open fun eat() {
        println(" สัตว์กำลังกิน ")
    }
    open fun roam() {
        println(" สัตว์กำลังเดิน ")
    }
    open fun sleep() {
        println(" สัตว์กำลังนอน ")
    }
}
class Hippo : Animal(){
    override val image: String
        get() = "hippo.jpg"
    override val food: String
        get() = "หญ้า"
    override val habitat : String
        get() = "น้ำ"
    override fun makeNoise() {
        println ("ฮิปโป กำลังส่งเสียงร้อง ฮิปโป ฮิบ ฮิบ")
    }
    override fun eat() {
        println ("ฮิปโป กำลังกิน $food")
    }
}
open class Feline : Animal() {
    override fun roam() {
        println("คลาส feline กำลังปีนต้นไม้")
    }
}
class Lion : Animal(){
    override val image: String
        get() = "Lion.jpg"
    override val food: String
        get() = "เนื้อ"
    override val habitat : String
        get() = "ในป่า"
    override fun makeNoise() {
        println ("เสือ กำลังส่งเสียงร้อง ")
    }
    override fun eat() {
        println ("เสือ กำลังกิน $food")
    }
}
open class Canine : Animal(){
    override fun roam() {
        println("คลาส Canine เดินบนพื้นได้เท่านั้น")
    }
}
class Wolf : Canine() {
    override val food = "เพดดีกรี"
    override val habitat = "ถ้ำ"
    override val image = "wolf.jpg"
    override fun makeNoise() {
        println("ร้องคำรามแบบหมาป่า")
    }
    override fun eat() {
        println("หมาป่ากิน $food")
    }
}