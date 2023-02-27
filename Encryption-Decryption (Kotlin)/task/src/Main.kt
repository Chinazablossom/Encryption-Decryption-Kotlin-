package encryptdecrypt

import  java.io.File

fun main(args: Array<String>) {

    try {
        val into = args[args.indexOf("-in") + 1]
        val out = args[args.indexOf("-out") + 1]
        val mode = args[args.indexOf("-mode") + 1]
        val key = args[args.indexOf("-key") + 1].toInt()
        val data = args[args.indexOf("-data") + 1]
        val alg = args[args.indexOf("-alg") + 1]
        var encrypted = ""
        var decrypted = ""

        when {
            alg == "unicode" && mode == "enc" && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in File(into).readText()) {
                    encrypted += i.encode(key)
                }
                File(out).writeText(encrypted)

            }

            alg == "unicode" && mode == "dec" && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in File(into).readText()) {
                    decrypted += i.decode(key)
                }
                File(out).writeText(decrypted)

            }

            alg == "unicode" && mode == "enc" && data.isNotEmpty() && into.isEmpty() && out.isEmpty() -> {
                for (i in data) {
                    encrypted += i.encode(key)
                }
                print(encrypted)
            }

            alg == "unicode" && mode == "dec" && data.isNotEmpty() && into.isEmpty() && out.isEmpty() -> {
                for (i in data) {
                    decrypted += i.decode(key)
                }
                print(decrypted)

            }

            alg == "unicode" && mode == "dec" && data.isNotEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                for (i in data) {
                    decrypted += i.decode(key)
                }
                print(decrypted)

            }

            alg == "unicode" && mode == "enc" && data.isNotEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                for (i in data) {
                    encrypted += i.encode(key)
                }
                print(encrypted)

            }

            alg == "unicode" && mode == "enc" && data.isNotEmpty() && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in data) {
                    encrypted += i.encode(key)
                }
                File(out).writeText(encrypted)
            }

            alg == "unicode" && mode == "enc" && data.isNotEmpty() && into.isEmpty() && out.isNotEmpty() -> {
                for (i in data) {
                    encrypted += i.encode(key)
                }
                File(out).writeText(encrypted)

            }

            alg == "unicode" && mode == "dec" && data.isNotEmpty() && into.isEmpty() && out.isNotEmpty() -> {
                for (i in data) {
                    decrypted += i.decode(key)
                }
                File(out).writeText(decrypted)

            }

            alg == "unicode" && mode == "enc" && data.isEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                File(into).forEachLine { it.forEach { print(it.encode(key)) } }

            }

            alg == "unicode" && mode == "dec" && data.isEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                File(into).forEachLine { it.forEach { print(it.decode(key)) } }

            }

            alg == "shift" && mode == "enc" && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in File(into).readText()) {
                    encrypted += i.cipherEncode(key)
                }
                File(out).writeText(encrypted)

            }

            alg == "shift" && mode == "dec" && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in File(into).readText()) {
                    decrypted += i.cipherDecode(key)
                }
                File(out).writeText(decrypted)


            }

            alg == "shift" && mode == "enc" && data.isNotEmpty() && into.isEmpty() && out.isEmpty() -> {
                for (i in data) {
                    encrypted += i.cipherEncode(key)
                }
                print(encrypted)

            }

            alg == "shift" && mode == "dec" && data.isNotEmpty() && into.isEmpty() && out.isEmpty() -> {
                for (i in data) {
                    decrypted += i.cipherDecode(key)
                }
                print(decrypted)


            }

            alg == "shift" && mode == "enc" && data.isNotEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                for (i in data) {
                    encrypted += i.cipherEncode(key)
                }
                print(encrypted)

            }

            alg == "shift" && mode == "dec" && data.isNotEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                for (i in data) {
                    decrypted += i.cipherDecode(key)
                }
                print(decrypted)
            }

            alg == "shift" && mode == "enc" && data.isNotEmpty() && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in data) {
                    encrypted += i.cipherEncode(key)
                }
                File(out).writeText(encrypted)

            }

            alg == "shift" && mode == "dec" && data.isNotEmpty() && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in data) {
                    decrypted += i.cipherDecode(key)
                }
                File(out).writeText(decrypted)
            }

            alg == "shift" && mode == "enc" && data.isNotEmpty() && into.isEmpty() && out.isNotEmpty() -> {
                for (i in data) {
                    encrypted += i.cipherEncode(key)
                }
                File(out).writeText(encrypted)

            }

            alg == "shift" && mode == "dec" && data.isNotEmpty() && into.isEmpty() && out.isNotEmpty() -> {
                for (i in data) {
                    decrypted += i.cipherDecode(key)
                }
                File(out).writeText(decrypted)
            }

            alg == "shift" && mode == "enc" && data.isEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                File(into).forEachLine { it.forEach { print(it.cipherEncode(key)) } }

            }

            alg == "shift" && mode == "dec" && data.isEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                File(into).forEachLine { it.forEach { print(it.cipherDecode(key)) } }


            }

            alg.isEmpty() && mode == "enc" && data.isNotEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                for (i in data) {
                    encrypted += i.cipherEncode(key)
                }
                print(encrypted)
            }

            alg.isEmpty() && mode == "dec" && data.isNotEmpty() && into.isNotEmpty() && out.isEmpty() -> {
                for (i in data) {
                    decrypted += i.cipherDecode(key)
                }
                print(decrypted)

            }

            alg.isEmpty() && mode == "enc" && data.isEmpty() && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in File(into).readText()) {
                    encrypted += i.cipherEncode(key)
                }
                File(out).writeText(encrypted)

            }

            alg.isEmpty() && mode == "dec" && data.isEmpty() && into.isNotEmpty() && out.isNotEmpty() -> {
                for (i in File(into).readText()) {
                    decrypted += i.cipherDecode(key)
                }
                File(out).writeText(decrypted)

            }
        }


    } catch (e: Exception) {
        println("Error")
    }

}

fun Char.encode(key: Int): Char {
    return (this.code + key).toChar()
}

fun Char.decode(key: Int): Char {
    return (this.code - key).toChar()
}

fun Char.cipherEncode(key: Int): Char {
    return when (this) {
        in 'a'..'z' -> {
            (((this.code) + (key - 97)) % 26 + 97).toChar()
        }

        in 'A'..'Z' -> {
            (((this.code) + (key - 65)) % 26 + 65).toChar()
        }

        else -> this
    }

}

fun Char.cipherDecode(key: Int): Char {
    return when (this) {
        in 'a'..'z' -> {
            (((this.code) - (key + 122)) % 26 + 122).toChar()
        }

        in 'A'..'Z' -> {
            (((this.code) - (key + 90)) % 26 + 90).toChar()
        }

        else -> this
    }
}
