package org.example.model.BancoDados;

public class BankException extends RuntimeException {
    public BankException(String message) {
        System.out.println(message);
    }
}
