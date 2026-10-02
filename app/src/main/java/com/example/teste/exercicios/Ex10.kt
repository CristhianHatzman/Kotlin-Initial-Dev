package com.example.teste.exercicios

import com.example.teste.util.emReais

interface Remuneravel {
    val nome: String

    fun calcularPagamentoDoMes(): Double
}

class Mensalista(
    override val nome: String,
    private val salarioFixo: Double
) : Remuneravel {
    override fun calcularPagamentoDoMes(): Double = salarioFixo
}

class Freelancer(
    override val nome: String,
    private val horasTrabalhadas: Double,
    private val valorHora: Double,
) : Remuneravel {
    override fun calcularPagamentoDoMes(): Double = horasTrabalhadas * valorHora
}

fun imprimirDemostrativo(colaborador: Remuneravel){
    println("EX10 | ${colaborador.nome}: ${colaborador.calcularPagamentoDoMes().emReais()}")
}

fun executarEx10() {
    val folha: List<Remuneravel> = listOf(
        Mensalista(nome = "Ana (mensalist)", salarioFixo = 4500.0),
        Freelancer(nome = "Bruno (Freelancer)", horasTrabalhadas = 80.0, valorHora = 75.0)
    )

    folha.forEach { colaborador -> imprimirDemostrativo(colaborador) }

    val totalFolha = folha.sumOf {colaborador -> colaborador.calcularPagamentoDoMes()}

    println("EX10 | Total da Folha: ${totalFolha.emReais()}")

}