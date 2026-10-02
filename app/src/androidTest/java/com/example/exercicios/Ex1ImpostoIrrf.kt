package com.example.exercicios

import com.example.teste.util.emReais

private const val TETO_ISENCAO = 2259.20
private const val TETO_FAIXA_INTERMEDIARIA = 2826.65

fun calcularIrff(salarioBruto: Double?): Double{
    val salario = salarioBruto?: 0.0
    val aliquota = when{
        salario <= TETO_ISENCAO -> 0.0
        salario <= TETO_FAIXA_INTERMEDIARIA -> 7.5
        else -> 15.0
    }

    return salario * (aliquota/100)
}

fun executarEx01(){
    val casosDeTest:List<Double?> = listOf(2000.0, 2500.0, 5.000, null)

    casosDeTest.forEach { salarioBruto ->
        val entrada = salarioBruto?.emReais() ?: "Null"
        println("Salário Bruno $entrada -> IRFF ${calcularIrff(salarioBruto).emReais()}")
    }
}