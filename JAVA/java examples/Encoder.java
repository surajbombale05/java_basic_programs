class Encoder {

    String encode(char c) {
        if (c == 'A') {
            return "**";
        }
        if (c == 'B') {
            return "##";
        }
        if (c == 'C') {
            return "$$$";
        }
        return null;
    }

    public static void main(String args[]) {
        Encoder e = new Encoder();
        String output = e.encode('A');
        System.out.print(output);
        output = e.encode('B');
        System.out.print(output);
        output = e.encode('C');
        System.out.print(output);
        output = e.encode('C');
        System.out.print(output);
        output = e.encode('M');
        if (output.equals(null)) {
        } else {
            System.out.print(output);
        }

    }
}