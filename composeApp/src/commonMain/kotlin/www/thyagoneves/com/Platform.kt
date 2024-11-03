package www.thyagoneves.com

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform