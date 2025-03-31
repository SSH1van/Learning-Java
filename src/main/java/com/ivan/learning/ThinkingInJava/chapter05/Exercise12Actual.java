package com.ivan.learning.ThinkingInJava.chapter05;

// Современная реализация через интерфейс AutoCloseable и конструкцию try-with-resources

public class Exercise12Actual {
    private static class Tank implements AutoCloseable {
        private int volume = 0;

        public void fillIn() { volume++; }
        public void fillOut() {
            if (volume > 0) volume--;
            else System.out.println("Невозможно опустошить ёмкость. Ёмкость уже пуста!");
        }

        public void showVolume() { System.out.printf("Текущий объём ёмкости: %d%n", volume); }

        @Override
        public void close() {
            if (volume != 0) {
                System.out.println("Перед очисткой объекта необходимо опустошить ёмкость!");
                volume = 0;
                System.out.println("Ёмкость опустошена");
                showVolume();
            }
        }
    }

    public static void main(String[] args) {
        try (Tank tank = new Tank()) {
            tank.showVolume();

            tank.fillOut();
            tank.showVolume();

            tank.fillIn();
            tank.showVolume();

            tank.fillIn();
            tank.showVolume();
        }
    }
}
