public class RepeatedString {
    static long repeatedString(String s, long n) {
        // if I remove all the 'a', the number of 'a' in the original is the length of the orig - the new without 'a'
        long numberOfAInOriginalString = (long) s.length() - s.replace("a", "").length();

        // in the sample abaabaabaa looks like this
        // aba | aba \ aba\ a
        // in which the first three sections are repeating so the number of 'a' equals to count(a) * bucket count
        // bucket = length / length(aba)
        // plus the part of the remaining string
        long partIndex = n % s.length();
        String lastString = s.substring(0, (int) partIndex);
        long numberOfAInLastString = (long) lastString.length() - lastString.replace("a", "").length();

        return (n / s.length()) * numberOfAInOriginalString + numberOfAInLastString;
    }
}
