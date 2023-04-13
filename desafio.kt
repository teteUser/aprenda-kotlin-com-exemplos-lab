// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val name: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        for(u in usuarios) inscritos.add(u)        
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val conteudos = mutableListOf(ConteudoEducacional("Java Básico", 480, Nivel.BASICO),
                                  ConteudoEducacional("Java POO", 180, Nivel.INTERMEDIARIO), 
                                  ConteudoEducacional("Spring Boot", 240, Nivel.INTERMEDIARIO), 
                                  ConteudoEducacional("Kafka", 120, Nivel.AVANCADO))
    
    val javaCompleto = Formacao("Java Completo", conteudos)
    
    javaCompleto.matricular(Usuario("Pedro"), Usuario("Tiago"), Usuario("João"))
    
    println("Nome da formação exemplo: ${javaCompleto.nome}")
    print("Conteúdos da formação exemplo: ${javaCompleto.conteudos}")
    println("\nInscritos na formação ${javaCompleto.nome}: ${javaCompleto.inscritos}")
}