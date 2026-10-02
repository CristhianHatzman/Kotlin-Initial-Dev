package com.example.cashback

class Transacao (
    val id:Int,
    val valor: Double,
    val descricao: String,
    var novoValor: Double = 0.0
){
    fun aplicarCashback(valor: Double){
        novoValor = valor * 1.02
        println("Registro original de $valor e novo registro com $novoValor")
    }
}
