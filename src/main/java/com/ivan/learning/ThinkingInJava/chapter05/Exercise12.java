package com.ivan.learning.ThinkingInJava.chapter05;

// Класс Tank с возможностью наполнения и опустошения ёмкости, перед очисткой объекта, необходимо опустошить ёмкость

public class Exercise12 {
    private static class Tank {
        private int volume = 0;

        public void fillIn() { volume++; }

        public void fillOut() {
            if (volume > 0) volume--;
            else System.out.println("Невозможно опустошить ёмкость. Ёмкость уже пуста!");
        }

        public void showVolume() {
            System.out.printf("Текущий объём ёмкости: %d%n", volume);
        }

        protected void finalize() {
            if (volume != 0) {
                System.out.println("Перед очисткой объекта необходимо опустошить ёмкость!");
                volume = 0;
                System.out.println("Ёмкость опустошена");
                showVolume();
            }
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.showVolume();

        tank.fillOut();
        tank.showVolume();

        tank.fillIn();
        tank.showVolume();

        tank.fillIn();
        tank.showVolume();

        tank = null;
        System.gc();
    }
}
