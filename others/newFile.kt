class newProgram{
    fun isAnagram(s: String, t: String): Boolean {
     for (i in s) {
        if(i in t == false)
            return false;
    return true;

     }   
    }
    fun main(args: Array<String>) {
        val input1 = "anagram";
        val input2 = "nagaram";
        println("${input1} and ${input2} are anagrams: ${isAnagram(input1, input2)}");
    }
}