
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set; 

public class dz {
        public static void main(String[] args) {
           Journal one = new Journal("Asus", "4", "1000", "Windows", "grey");
           Journal two = new Journal("Asus", "4", "1000", "Lin", "black");
           Journal three = new Journal("Asus", "4", "2000", "Windows", "black");
           Journal four = new Journal("Hp", "16", "1000", "Windows", "grey");
           Journal five = new Journal("Dell", "8", "1000", "Windows", "black");
           Journal six = new Journal("Dell", "4", "2000", "Linux", "black");

           Set<Journal> notebooks = new HashSet<>(List.of(one, two,
                 three, four, five, six));
     
           Map<String, String> sel = selectCriteria();
           sort(sel, notebooks);
     
        }
     
        public static String scanner() {
           Scanner scanner = new Scanner(System.in);
           String scan = scanner.nextLine();
        //    scanner.close();
           return scan;
        }
     
        public static Map<String, String> selectCriteria() {
           Map<String, String> result = new HashMap<>();
           while (true) {
              System.out.println("Вас приветствует магазин техники. Вы хотите выбрать фильтр? '1'- да, если нет введите '2'");
              String greeting = scanner();
              if (greeting.equals("2")) {
                 break;
              } else {
     
                 System.out.println(
                       "Введите необходимый фильтр: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
                 String key = scanner();
                 System.out.println("Введите значение: ");
                 String meaning = scanner();
                 result.put(key, meaning);
              }
           }
           System.out.println(result);
           return result;
     
        }
     
        public static void sort(Map<String, String> item, Set<Journal> notebooks) {
     
           Set<Journal> temp = new HashSet<>(notebooks);
           for (Journal notebook : notebooks) {
     
              for (Object pair : item.keySet()) {
     
                 if (pair.equals("1") && !notebook.FunctionName().equals(item.get(pair))) {
                    temp.remove(notebook);
                 }
                 for (Object pair1 : item.keySet()) {
     
                    if (pair1.equals("2") && !notebook.FunctionRAM().equals(item.get(pair1))) {
                       temp.remove(notebook);
     
                    }
                    for (Object pair2 : item.keySet()) {
     
                       if (pair2.equals("3") && !notebook.FunctionHDD().equals(item.get(pair2))) {
                          temp.remove(notebook);
     
                       }
                       for (Object pair3 : item.keySet()) {
     
                          if (pair3.equals("4") && !notebook.FunctionOperationSystem().equals(item.get(pair3))) {
                             temp.remove(notebook);
     
                          }
                          for (Object pair4 : item.keySet()) {
     
                             if (pair4.equals("5") && !notebook.FunctionColour().equals(item.get(pair4))) {
                                temp.remove(notebook);
     
                             }
                          }
                       }
                    }
                 }
              }
     
           }
           if (temp.isEmpty()) {
              System.out.println("Введите другой фильтр!");
           }
            else {
              System.out.println("найдены следущие характеристики: \n" + temp.toString());
           }
        }
}
     