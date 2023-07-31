
public class Main {
    public static void main(String[] args) {
        int[] mass = {10, 8, 6, 4, 32, 4, 6};
        int min = mass[0]; // Инициализируем min значением первого элемента массива

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > min) {
                min = mass[i]; // Если текущий элемент меньше min, обновляем min
            }
        }

        System.out.println(min); // Выведет наименьший элемент: 4


    }}
