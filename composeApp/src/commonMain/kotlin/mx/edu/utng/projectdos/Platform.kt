package mx.edu.utng.projectdos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform