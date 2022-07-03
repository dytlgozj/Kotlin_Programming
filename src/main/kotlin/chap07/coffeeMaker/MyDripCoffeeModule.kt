package chap07.coffeeMaker

class MyDripCoffeeModule : CoffeeModule {
    companion object {
        val electricHeater: ElectricHeater by lazy {
            println("electricheater가 생성됩니다.")
            ElectricHeater()
        }
    }

    private val _thermosiphon: Thermosiphon by lazy {
        println("thermosiphon이 생성됩니다.")
        Thermosiphon(electricHeater)
    }

    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}
