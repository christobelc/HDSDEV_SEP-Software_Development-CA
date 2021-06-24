package SentenceEncoder;

public class SentenceEncoder {

    // Encapulated internal data
    private String sentence;
    private String encodedSentence;

    // Dont really use the defualt constructor in this app....
    public SentenceEncoder() {
    }

    public SentenceEncoder(String sentence) {
        this.sentence = sentence;
    }

    // ----------Setters and Getters-------------
    // if the deafult constructor is used we can pass a sentence using this setter
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    // return the encoded sentence
    public String getEncodedSentence() {
        return encodedSentence;
    }

    // ------------Methods of SentenceEncoder---------

    public void encodeSentence() {

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sentence.length(); i++) {
            // if there is a space ' ' add '*' to sb
            if (sentence.charAt(i) == ' ') {
                sb.append('*');
                // if there is a '.' add '!' to sb
            } else if (sentence.charAt(i) == '.') {
                sb.append('!');
                // Because string starts at 0 we use (i+1) to find the 6th character in
                // intervals
                // mulitple of 6 add '?'
            } else if ((i + 1) % 6 == 0) {
                sb.append('?');
                // every other character add to the sb
            } else {
                sb.append(sentence.charAt(i));
            }
        }
        encodedSentence = sb.toString();
    }

}
