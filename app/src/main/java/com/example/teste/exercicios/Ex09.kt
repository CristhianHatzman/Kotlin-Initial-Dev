package com.example.teste.exercicios

import com.example.teste.model.Caminhao
import com.example.teste.model.Carro
import com.example.teste.model.Veiculo
import com.example.teste.util.emReais

fun executarEx09(){
    val diasLocacao = 5

    val frota:List<Veiculo> = listOf(
        Carro(placa = "CAR-1C23", taxaDiaria = 120.0),
        Caminhao(placa = "CAM-4C56", taxaDiaria = 300.0, tonelagem = 8.0, taxaPorPeso = 50.0)
    )

    frota.forEach { veiculo ->
        println("EX09 | ${veiculo.placa} -> ${veiculo.calcularAluguel(diasLocacao).emReais()}")
    }
}