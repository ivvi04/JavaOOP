package ru.lakeevda.lesson6.Documents;

import lombok.Getter;

import java.util.UUID;

public class Document {
    @Getter
    private UUID id;
    @Getter
    private String number;
    @Getter
    private String text;

    public Document(String number, String text) {
        this.id = UUID.randomUUID();
        this.number = number;
        this.text = text;
    }
}
