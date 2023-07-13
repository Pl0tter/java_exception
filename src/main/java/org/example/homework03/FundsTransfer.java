package org.example.homework03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Вы разрабатываете систему банковских транзакций. Необходимо написать программу,
 * которая позволяет пользователям осуществлять переводы средств со своего банковского счета на другие счета.
 * Однако, в системе существуют некоторые ограничения и возможные ошибки, которые нужно обрабатывать.
 */
public class FundsTransfer {
    static double[] deposits = {10000, 0};

    public static void main(String[] args) {
        try {
            double amount = getAmount("Введите сумму перевода: ");
            transfer(amount, deposits);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число");
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static double getAmount(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void transfer(double amount, double[] deposits) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0)
            throw new InvalidAmountException("Сумма перевода отрицательная или равна нулю");
        else if (amount > deposits[0]) {
            throw new InsufficientFundsException("На балансе недостаточно средств для перевода");
        } else {
            System.out.println("Баланс до: " + Arrays.toString(deposits));
            deposits[0] = deposits[0] - amount;
            deposits[1] = deposits[1] + amount;
            System.out.println("Баланс после: " + Arrays.toString(deposits));
        }
    }

    static class InvalidAmountException extends Exception {
        public InvalidAmountException(String message) {
            super(message);
        }
    }

    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}