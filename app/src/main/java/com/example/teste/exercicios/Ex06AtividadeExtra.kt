package com.example.teste.exercicios
import com.example.teste.model.Produto
import com.example.teste.util.emReais

private const val FATOR_REAJUSTE = 1000.0
private const val ADICIONAR_NOME = "Fatec "

fun reajusteParaCategoriaEletronicos2(catalogo: List<Produto>): List<Produto> =
    catalogo
        .map{ produto ->
            produto.copy(
                preco = produto.preco + FATOR_REAJUSTE,
                nome = ADICIONAR_NOME + produto.nome
            )
        }



fun executarEx062(){
    val catalogo = listOf(
        Produto("Notebook", 3000.0, "Eletrônicos"),
        Produto("Cadeira", 800.0, "Moveis"),
        Produto("Fone", 200.0, "Eletrônicos"),
    )

    reajusteParaCategoriaEletronicos2(catalogo).forEach {
        produto -> println("EX06-2 | ${produto.nome} : (${produto.preco.emReais()})")
    }

}