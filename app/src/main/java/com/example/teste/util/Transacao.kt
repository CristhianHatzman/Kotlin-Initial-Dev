package com.example.teste.util

data class Transacao (
    val id:Int,
    val descricao: String,
    val valor: Double,
    var novoValor: Double = 0.0
){
    fun aplicarCashback(valor: Double){
        novoValor = valor * 1.02
        println("Registro original de $valor e novo registro com $novoValor")
    }
}
