package com.example.teste.model

class AlunoNormal (
    var nome:String,
    var idade:Int
){
    fun apresentar(){
        println("Olá, meu nome $nome e tenho $idade anos.")
    }
}