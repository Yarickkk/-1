public class zav1 {
    public static void main(String[] args) {
        // Перевіряємо, чи передав користувач хоч щось
        if (args.length == 0) {
            System.out.println("Привіт! Ви не передали жодного аргументу. Спробуйте ще раз.");
            return;
        }

        System.out.println("Ось список ваших аргументів:");
        
        // Проходимо циклом по масиву рядків args
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент [" + i + "]: " + args[i]);
        }
    }
}
