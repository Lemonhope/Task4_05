// Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
// який повинен приймати радіус та використовуючи PI порахувати площу кола і виводить результат в консоль.
// Створити клас Main, де запустити цей метод.
package Task4_05;

import static Task4_05.MyArea.areaOfCircle;

public class Main {
    public static void main(String[] args) {
        double myRadius=12;
        areaOfCircle(myRadius);
    }
}
