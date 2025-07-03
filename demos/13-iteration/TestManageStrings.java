public class TestManageStrings {
    public static void main(String[] args) {
        String test = "Una Prueba";
        String reverse = ManageStrings.reverseString2(test);
        String removed = ManageStrings.removeFirstLast(test);
        String noSpaces = ManageStrings.removeSpaces(test);
        System.out.println("Original: " + test);
        System.out.println("Reverse: " + reverse);
        System.out.println("Recortado: " + removed);
        System.out.println("Sin espacios " + noSpaces);
    }

}
