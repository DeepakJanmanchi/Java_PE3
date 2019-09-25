class CreateException {

    public static void main(String args[]) {
        int result = 0;
        int size = 3;
        int negSize = -1;
        int[] arr = null;

        for (int i = 0; i < 3; i++)
            try {

                result = arr[0];


                arr = new int[negSize];

                arr = new int[size];
                result = arr[size];                                    // Generates an ArrayIndexOutOfBoundsException.

            } catch (NullPointerException e) {                                  // Catch the NullPointerException:
                System.out.println("\nNullPointerException Exception caught. " +
                        "Message in NullPointerException is:\n" +
                        "\n" + e + "\n");

            } catch (NegativeArraySizeException e) {                            // Catch the NegativeArraySizeException:
                System.out.println("\nNegativeArraySizeException Exception caught. " +
                        "Message in NegativeArraySizeException is:\n" +
                        "\n" + e + "\n");

            } catch (ArrayIndexOutOfBoundsException e) {                        // Catch the ArrayIndexOutOfBoundsException:
                System.out.println("\nArrayIndexOutOfBoundsException Exception caught. " +
                        "Message in ArrayIndexOutOfBoundsException is:\n" +
                        "\n" + e + "\n");

            }
    }
}
