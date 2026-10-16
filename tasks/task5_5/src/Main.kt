fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Enter two words in 'Program arguments' field")
        return
    } else {
        if (args[1] anagramOf args[0]) {
            println("${args[0]} and ${args[1]} are anagrams!")
        }
    }
}