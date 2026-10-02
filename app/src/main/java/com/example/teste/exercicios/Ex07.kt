package com.example.teste.exercicios

import com.example.teste.util.Transacao

private const val FATOR_CASHBACK = 1.02

fun aplicarCashback(transacao: Transacao): Transacao{
    return transacao.copy(
        valor = transacao.valor * FATOR_CASHBACK
    )
}

fun executarEx07(){
    val compraFreitas = Transacao(
        1,
        "Coxinha",
        100.0
    )
    val comCashback =  aplicarCashback(transacao = compraFreitas)
    println("EX07 | Valor original ${compraFreitas.valor}")
    println("EX07 | Valor com cashback ${comCashback.valor}")

    val copiacompraFreitas = Transacao(
        1,
        "Coxinha",
        100.0
    )

    println("EX07 | Dois registros do mesmo conteúdo são iguais? ${ compraFreitas == copiacompraFreitas }")
    println("EX07 | São os mesmos objetos em memória? " +
            "${ compraFreitas === copiacompraFreitas }")

}