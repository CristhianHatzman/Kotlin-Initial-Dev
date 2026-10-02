package com.example.teste.exercicios

import com.example.teste.util.emReais

private const val FATOR_LIQUIDO = 0.89 //100% - 11% = 89%
private const val PATAMAR_MINIMO = 2000.0

fun filtrarSalarios(salariosBrutos:List<Double>):List<Double>{
    return salariosBrutos
        .map{bruto->bruto * FATOR_LIQUIDO}
        .filter{liquido -> liquido > PATAMAR_MINIMO}
}

fun executarEx05(){
    val salariosBrutos = listOf(1500.0, 2000.0, 2500.0, 3000.0, 5000.0)
    val liquidosAprovados = filtrarSalarios(salariosBrutos)


    println("EX05 | Salários líquidos acima de ${PATAMAR_MINIMO.emReais()}")

    liquidosAprovados.forEach { liquido ->
        println("EX05 | Salário liquido ${liquido.emReais()}")
    }
}