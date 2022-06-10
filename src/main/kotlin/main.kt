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

    portaria()
}