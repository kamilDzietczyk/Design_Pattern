package com.company;

import com.company.api.LibraryAPI;
import com.company.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIv1ToAPIv2 implements LibraryAPI {

    private LibraryAPIv2 library2;
    private User user ;

    public APIv1ToAPIv2(LibraryAPIv2 library2, User user) {
        this.library2 = library2;
        this.user = user;
    }

    @Override
    public boolean isAviable(String bookTitle) {
        return library2.numberOfAviableCopies(bookTitle)>0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return library2.dueDate(bookTitle, user.getFirstName(), user.getLastName(),user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return library2.reserve(bookTitle,user.getFirstName(),user.getLastName(),user.getDateOfBirth());
    }
}
