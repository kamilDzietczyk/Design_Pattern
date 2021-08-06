package com.company;

import Client.Observer;

public interface Observable {
    void Register(Observer o);
    void Unregister (Observer o);
    void Notify();
}
