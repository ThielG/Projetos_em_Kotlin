fun main(args: Array<String>) {
    println("----- Calculadora -----")
    while (true) {
        println("\n1. Adição")
        println("2. Subtração")
        println("3. Multiplicação")
        println("4. Divisão")
        println("5. Sair")
        print("\nEscolha uma operação: ")

        val escolha = readlnOrNull()?.toIntOrNull()

        when (escolha) {
            1 -> adicao()
            2 -> subtracao()
            3 -> multiplicacao()
            4 -> divisao()
            5 -> return
            else -> println("\nErro: Opção inválida, tente novamente.")
        }
    }
}

fun adicao() {
    val primeiro = numero("\nDigite o primeiro número: ")
    val segundo = numero("Digite o segundo número: ")
    val resultado = primeiro + segundo
    println("\nResultado: $resultado")
}

fun subtracao() {
    val primeiro = numero("\nDigite o primeiro número: ")
    val segundo = numero("Digite o segundo número: ")
    val resultado = primeiro - segundo
    println("\nResultado: $resultado")
}

fun multiplicacao() {
    val primeiro = numero("\nDigite o primeiro número: ")
    val segundo = numero("Digite o segundo número: ")
    val resultado = primeiro * segundo
    println("\nResultado: $resultado")
}

fun divisao() {
    val primeiro = numero("\nDigite o primeiro número: ")
    val segundo = numero("Digite o segundo número: ")

    if (segundo != 0) {
        val resultado = primeiro.toDouble() / segundo
        println("\nResultado: $resultado")
    } else {
        println("\nErro: Divisão por zero.")
    }
}

fun numero(prompt: String): Int {
    print(prompt)
    return readlnOrNull()?.toIntOrNull() ?: 0
}
