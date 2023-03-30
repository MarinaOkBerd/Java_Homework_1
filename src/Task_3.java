
import java.util.Scanner;


public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            System.out.println("Введите математическое выражение.");
            scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            calc (task);
        } catch (Exception e) {
            System.out.println("Ошибка в ходе выполнения программы: " + e.getMessage());
        } finally {
            if (scanner != null){
              scanner.close();
            }
        }
    }
    public static void calc(String task) throws Exception {
        if (task==null || task.isEmpty()){
            throw new Exception("Строка пустая.");
        }

        if (task.trim().startsWith("-")){
            throw new Exception("Числа не могут быть отрицательные.");
        }

        String sign = "";
        if (task.contains("+")) {
            sign = "+";
        } else if (task.contains("-")) {
            sign = "-";
        } else if (task.contains("*")) {
            sign = "*";
        } else if (task.contains("/")) {
            sign = "/";
        } else {
            throw new Exception("Строка не является математической операцией.");
        }

        int signPosition = task.indexOf(sign);
        String sX = task.substring(0, signPosition).trim();
        String sY = task.substring(signPosition + 1).trim();
        if ((sX.contains(".") || sX.contains(",")) || (sY.contains(".") || sY.contains(","))){
            throw new Exception("Введено дробное число. Введите целое число.");
        }
        if (sY.contains("+") || sY.contains("-") || sY.contains("*") || sY.contains("/")){
            throw new Exception("Формат математической операции не удовлетворяет условию задения.");
        }
        int x = Integer.parseInt(sX);
        int y = Integer.parseInt(sY);
        int z = 0;
        if ("+".equals(sign)) {
            z = x + y;
        } else if ("-".equals(sign)){
            z = x - y;
        } else if ("*".equals(sign)){
            z = x * y;
        } else if ("/".equals(sign)){
            if (y==0) {
                throw new Exception("На 0 делить нельзя.");
            }    
            z = x / y;
            
        }
    System.out.println(z);    
    }   
}
 