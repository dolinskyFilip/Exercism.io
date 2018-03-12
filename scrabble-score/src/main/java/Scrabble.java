class Scrabble {
    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
       String s= word.toLowerCase();
        int counter=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case  'a' :
                    counter++;
                    break;
                case  'e' :
                    counter++;
                    break;
                case  'i' :
                    counter++;
                    break;
                case  'o' :
                    counter++;
                    break;
                case  'u' :
                    counter++;
                    break;
                case  'l' :
                    counter++;
                    break;
                case  'n' :
                    counter++;
                    break;
                case  'r' :
                    counter++;
                    break;
                case  's' :
                    counter++;
                    break;
                case  't' :
                    counter++;
                    break;
                case  'd' :
                    counter+=2;
                    break;
                case  'g' :
                    counter+=2;
                    break;
                case  'b' :
                    counter+=3;
                    break;
                case  'c' :
                    counter+=3;
                    break;
                case  'm' :
                    counter+=3;
                    break;
                case  'p' :
                    counter+=3;
                    break;
                case  'f' :
                    counter+=4;
                    break;
                case  'h' :
                    counter+=4;
                    break;
                case  'v' :
                    counter+=4;
                    break;
                case  'w' :
                    counter+=4;
                    break;
                case  'y' :
                    counter+=4;
                    break;
                case  'k' :
                    counter+=5;
                    break;
                case  'j' :
                    counter+=8;
                    break;
                case  'x' :
                    counter+=8;
                    break;
                case  'q' :
                    counter+=10;
                    break;
                case  'z' :
                    counter+=10;
                    break;

            }
        }
        return counter;
    }

}
