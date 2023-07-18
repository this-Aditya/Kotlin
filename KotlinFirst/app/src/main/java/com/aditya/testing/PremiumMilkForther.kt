package com.aditya.testing

class PremiumMilkForther(
    val engine: Engine,
    val filter: Filter,
    val forthingPrograms: List<ForthingProgram>
) : MilkForther {
    override fun getMilk(): String {
        // Some complex forthing logic
        return  " Some complex logic"
    }
}


class Engine{

}

class Filter{

}

class ForthingProgram{

}