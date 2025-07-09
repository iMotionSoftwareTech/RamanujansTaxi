//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RamanujansTaxi {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        for (double a = 1; Math.pow(a, 3) <= n; a++) {
            for (double b = a + 1; Math.pow(a, 3) + Math.pow(b, 3) <= n; b++) {
                double sum1 = Math.pow(a, 3) + Math.pow(b, 3);
                if (sum1 > n) {
                    break;
                }
                for (double c = a +1; Math.pow(c, 3) <= sum1; c++) {
                    if (c == b) {
                        continue;
                    }
                    for (double d = c + 1; Math.pow(c, 3) + Math.pow(d, 3) <= sum1; d++) {
                        if (d == a || d == b) {
                            continue;
                        }

                        double sum2 = Math.pow(c, 3) + Math.pow(d, 3);

                        if (sum1 == sum2) {
                            System.out.println(sum1 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                        }

                    }
                }
            }
        }
    }
}