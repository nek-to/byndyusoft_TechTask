package com.function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MassSorterTest {
    @Test
    public void zeroMass_success() {  //Empty massive test
        //Given
        int[] mass = {};
        int expected = 0;
        //When
        int actual = MassSorter.func(mass);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void funcWorkWithFillMassive_success() {   //Fill the massive with data from example {4, 0, 3, 19, 492, -10, 1}
        //Given
        int[] mass = {4, 0, 3, 19, 492, -10, 1};
        int expected = -10;
        //When
        int actual = MassSorter.func(mass);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void fillMassiveWithHundMillionsData_success() {   //Fill the massive with 100 mill random data from 1 to 1000
        //Given
        int min1 = -10;
        int min2 = -40;
        int expected = -50;
        Random random = new Random();
        int[] mass = random.ints(100000000, 1, 1000).toArray();
        int[] largerMass = Arrays.copyOf(mass, mass.length + 2);
        largerMass[mass.length] = min1;
        largerMass[mass.length + 1] = min2;
        //When
        int actual = MassSorter.func(largerMass);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void nullMassiveNPException_negative() {    //Negative test where [] mass = null
        //Given
        int[] mass = null;
        //When
        Exception npe = assertThrows(NullPointerException.class, () -> {
            MassSorter.func(mass);
        });
        //Then
        assertNotNull(npe);
    }
}