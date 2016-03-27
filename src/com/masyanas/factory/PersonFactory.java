package com.masyanas.factory;

import com.masyanas.model.person.Person;
import com.masyanas.model.person.female.Female;
import com.masyanas.model.person.male.Male;

public class PersonFactory
{
    public static Person makePerson(String gender, String name)
    {
        if (gender.equals("male"))
        {
            return new Male(name);
        }
        else
        {
            return new Female(name);
        }
    }
}
