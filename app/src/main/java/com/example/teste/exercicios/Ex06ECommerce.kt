package com.example.teste.exercicios
import com.example.teste.model.Produto
import com.example.teste.util.emReais

private const val CATEGORIA_ALVO = "Eletrônicos"
private const val FATOR_REAJUSTE = 1.05

fun reajusteParaCategoriaEletronicos(catalogo: List<Produto>): List<Produto> =
    catalogo
        .filter {produto -> produto.categoria == CATEGORIA_ALVO}
        .map{ eletronico ->
            eletronico.copy(
                preco = eletronico.preco * FATOR_REAJUSTE
            )
        }



fun executarEx06(){
    val catalogo = listOf(
        Produto("Notebook", 3000.0, "Eletrônicos"),
        Produto("Cadeira", 800.0, "Moveis"),
        Produto("Fone", 200.0, "Eletrônicos"),
    )

    reajusteParaCategoriaEletronicos(catalogo).forEach {
        produto -> println("EX06 | ${produto.nome} (${produto.categoria}) (${produto.preco.emReais()})")
    }

}