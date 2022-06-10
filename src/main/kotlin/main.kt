fun quadrado() {

    print("Insira o lado 1: ")
    val lado1 = readLine()
    print("Insira o lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {

        val l1 = lado1.toInt()
        val l2 = lado2.toInt()

        if (l1 == l2) {
            println("Quadrado")
        } else {
            println("Não é quadrado")
        }
    }


}

fun triangulo() {

    print("Insira o lado 1: ")
    val lado1 = readLine()
    print("Insira o lado 2: ")
    val lado2 = readLine()
    print("Insira o lado 3: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {

        val l1 = lado1.toInt()
        val l2 = lado2.toInt()
        val l3 = lado3.toInt()

        if (l1 == l2 && l2 == l3) {

            println("Triângulo equilátero")
        } else

            println("Não é equilátero")

    } else
        println("Valor inválido")

}

fun portaria() {

    print("Qual sua idade? ")
    val idade = readLine()

    // ***Validação de idade***

    if (idade != null && idade != "") {

        if (idade.toInt() < 18) {

            println("Menor não entra.")
            return
        }
    }
    print("Qual o convite? ")
    var convite = readLine()

    // ***Validação de convite***

    if (convite != null && convite != "") {
        convite = convite.lowercase()

        if (convite == "comum" || convite == "premium" || convite == "luxo") {

            print("Qual o código do convite? ")
            var codigo = readLine()

            //***Validaçaõ de código do convite***

            if (codigo != null && codigo != "") {
                codigo = codigo.lowercase()

                if (convite == "comum" && codigo == "xt") {

                    println("Tudo certo, welcome!")
                } else if (convite == "premium" || convite == "luxo" && codigo == "xl") {

                    println("Tudo certo, welcome!")
                } else {

                    println("Convite inválido")
                }
            }


        } else {
            println("Convite inválido")
        }
    }

}

fun main() {

//    quadrado()
//    triangulo()
    portaria()
}