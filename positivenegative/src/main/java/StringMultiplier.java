public class StringMultiplier {
    /**
     * Returns a new string which consists of the input string repeated as many times as the multiplier.
     * @param str
     * @param multiplier
     * @return
     */
    String multiplyString(String str, int multiplier) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < multiplier; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
