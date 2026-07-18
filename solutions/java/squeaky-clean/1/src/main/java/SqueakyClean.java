class SqueakyClean {
    static String clean(String identifier) {
         StringBuilder sb = new StringBuilder();
        boolean makeUpper = false;
         for (char ch : identifier.toCharArray()) {
              switch (ch) {
                case '4': ch = 'a'; break;
                case '3': ch = 'e'; break;
                case '0': ch = 'o'; break;
                case '1': ch = 'l'; break;
                case '7': ch = 't'; break;
                default: break; // Keep character as is
            }
            if (Character.isWhitespace(ch)) {
                sb.append('_');
            } else if (Character.isISOControl(ch)) {
                sb.append("CTRL");
            } else if (ch == '-') {
                makeUpper = true;
            } else if (ch >= 'α' && ch <= 'ω') {
                // Skip lowercase Greek letters
                continue;
            } else if (Character.isLetter(ch)) {
                if (makeUpper) {
                    sb.append(Character.toUpperCase(ch));
                    makeUpper = false;
                } else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
