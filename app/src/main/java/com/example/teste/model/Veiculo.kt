package com.example.teste.model

open class Veiculo(
    val placa: String,
    val taxaDiaria: Double,
) {
    open fun calcularAluguel(dias: Int): Double = dias * taxaDiaria
}

class Carro(
    placa: String,
    taxaDiaria: Double,
) : Veiculo(placa, taxaDiaria) {
}

class Caminhao(
    placa: String,
    taxaDiaria: Double,
    val tonelagem: Double,
    val taxaPorPeso: Double,
) : Veiculo(placa, taxaDiaria) {
    override fun calcularAluguel(dias: Int): Double {
        return super.calcularAluguel(dias) + (tonelagem*taxaPorPeso)
    }
}