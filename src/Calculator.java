public class Calculator {
    public int calcSum(String s) {
        int result = 0;
        if(hasAtLeastOneElement(s)) {
            for (String number : generateArrayFromString(s)) {
                result += Integer.parseInt(number);
            }
        }
        return result;
    }

    private String[] generateArrayFromString(String s) {
        return s.split(",");
    }

    private boolean hasAtLeastOneElement(String s) {
        return s.length() > 0;
    }
}
