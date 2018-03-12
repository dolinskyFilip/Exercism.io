class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException();
        }

    }

    int getHammingDistance() {
        int hammingDistance = 0;

        for (int i = 0; i < leftStrand.length(); i++) {

            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }
        return hammingDistance;
    }

}
