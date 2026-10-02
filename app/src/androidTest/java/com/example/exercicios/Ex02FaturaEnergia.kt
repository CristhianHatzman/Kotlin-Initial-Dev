package com.example.exercicios

fun calcular(consumoKwh:Double, precoKwh: Double):Double = consumoKwh * precoKwh * if (consumoKwh>150) 1.10 else 1.0

fun exeEx02(){
    val precoKwh = 0.85

    listOf(100.0,150.0,200.0).forEach { consumo ->
        val bandeira = if(consumo > 150)
    }
}