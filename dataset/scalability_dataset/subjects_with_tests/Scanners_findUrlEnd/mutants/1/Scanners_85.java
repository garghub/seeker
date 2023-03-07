package org.nibor.autolink.internal;

public class Scanners {

    public static boolean isAlpha(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isAlnum(char c) {
        return isAlpha(c) || isDigit(c);
    }

    public static boolean isNonAscii(char c) {
        return c >= 0x80;
    }

    public static int findUrlEnd(CharSequence input, int beginIndex) {
        int round = 0;
        int square = 0;
        int curly = 0;
        boolean doubleQuote = false;
        boolean singleQuote = false;
        int last = -1;
        loop:
        for (int i = beginIndex; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '\u0000':
                case '\u0001':
                case '\u0002':
                case '\u0003':
                case '\u0004':
                case '\u0005':
                case '\u0006':
                case '\u0007':
                case '\u0008':
                case '\t':
                case '\n':
                case '\u000B':
                case '\f':
                case '\r':
                case '\u000E':
                case '\u000F':
                case '\u0010':
                case '\u0011':
                case '\u0012':
                case '\u0013':
                case '\u0014':
                case '\u0015':
                case '\u0016':
                case '\u0017':
                case '\u0018':
                case '\u0019':
                case '\u001A':
                case '\u001B':
                case '\u001C':
                case '\u001D':
                case '\u001E':
                case '\u001F':
                
                
                case ' ':
                case '\"':
                case '<':
                case '>':
                case '`':
                case '\u007F':
                case '\u0080':
                case '\u0081':
                case '\u0082':
                case '\u0083':
                case '\u0084':
                case '\u0085':
                case '\u0086':
                case '\u0087':
                case '\u0088':
                case '\u0089':
                case '\u008A':
                case '\u008B':
                case '\u008C':
                case '\u008D':
                case '\u008E':
                case '\u008F':
                case '\u0090':
                case '\u0091':
                case '\u0092':
                case '\u0093':
                case '\u0094':
                case '\u0095':
                case '\u0096':
                case '\u0097':
                case '\u0098':
                case '\u0099':
                case '\u009A':
                case '\u009B':
                case '\u009C':
                case '\u009D':
                case '\u009E':
                case '\u009F':
                    
                    
                    
                    
                    
                case '\u00A0': 
                case '\u2000': 
                case '\u2001': 
                case '\u2002': 
                case '\u2003': 
                case '\u2004': 
                case '\u2005': 
                case '\u2006': 
                case '\u2007': 
                case '\u2008': 
                case '\u2009': 
                case '\u200A': 
                case '\u2028': 
                case '\u2029': 
                case '\u202F': 
                case '\u205F': 
                case '\u3000': 
                    
                    
                    
                    break loop;
                case '?':
                case '!':
                case '.':
                case ',':
                case ':':
                case ';':
                    
                    break;
                case '/':
                    
                    if (last == i - 1) {
                        last = i;
                    }
                    break;
                case '(':
                    round++;
                    break;
                case ')':
                    round--;
                    if (round >= 0) {
                        last = i;
                    } else {
                        
                        break loop;
                    }
                    break;
                case '[':
                    
                    square++;
                    break;
                case ']':
                    
 
                    if (square >= 0) {
                        last = i;
                    } else {
                        
                        break loop;
                    }
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    if (curly >= 0) {
                        last = i;
                    } else {
                        
                        break loop;
                    }
                    break;
                case '\'':
                    singleQuote = !singleQuote;
                    if (!singleQuote) {
                        last = i;
                    }
                    break;
                default:
                    last = i;
            }
        }
        return last;
    }
}
