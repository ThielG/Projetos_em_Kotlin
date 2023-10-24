fun main() {
    val tarefas = mutableListOf<String>()

    while (true) {
        println("----- Lista de Tarefas -----")
        println("\n1. Adicionar Tarefa")
        println("2. Listar Tarefas")
        println("3. Sair")
        print("\nEscolha uma opção: ")
        val escolha = readLine()!!.toInt()

        when (escolha) {
            1 -> {
                print("Digite a tarefa: ")
                val tarefa = readLine()!!
                tarefas.add(tarefa)
                println("\nTarefa adicionada com sucesso!\n")
            }

            2 -> {
                if (tarefas.isEmpty()) {
                    println("Lista de tarefas vazia.")
                } else {
                    println("\nTarefas:\n")
                    tarefas.forEachIndexed { indice, tarefa -> println("${indice + 1}. $tarefa")
                    }
                    println("\n")
                }
            }

            3 -> {
                println("\nAplicação finalizada!\n")
                return
            } else -> println("\nOpção inválida. Tente novamente.\n")
        }
    }
}
