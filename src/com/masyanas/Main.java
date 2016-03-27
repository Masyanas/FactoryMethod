package com.masyanas;

import com.masyanas.factory.PersonFactory;
import com.masyanas.model.person.Person;

public class Main
{
    public static void main(String[] args)
    {
        Person m = PersonFactory.makePerson("male", "John");
        Person f = PersonFactory.makePerson("female", "Rebecca");
    }
}
