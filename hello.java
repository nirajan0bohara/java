class Hello {
    public static void main(String[] args) {
        int num = 7;
        int num1 = 8;
        long l = 54226;
        byte b = 113;
        short s = 555;

        double num2 = 3.4;
        float num3 = 2.5f;

        char c = 'k';
        boolean age = true;

        int result = num * num1;
        System.out.println(result);
        System.out.println(num3 + num2);

        if (num > 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

    }
}