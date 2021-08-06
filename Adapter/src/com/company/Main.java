package com.company;

import com.company.api.LibraryAPIv2;
import com.company.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {

        User u = new User("xyz","abcde","54649203512");
        LibraryAPIv2 apiv2 = new LibraryAPIv2Impl();
        APIv1ToAPIv2 apiAdapter = new APIv1ToAPIv2(apiv2,u);
        BookConnector conn = new BookConnector(u,apiAdapter);
        conn.checkAviability("xyz");
    }
}
