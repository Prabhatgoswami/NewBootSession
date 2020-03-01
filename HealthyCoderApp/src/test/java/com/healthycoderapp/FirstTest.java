package com.healthycoderapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstTest {
private First first = new First();
    List<BigDecimal> decimalValue = new ArrayList();
    @ParameterizedTest
    @ValueSource(strings = {"bob","lol"})
    public void should_return_true_isPallindrome( String checkString){
        //given
    String str = checkString;
        //when
        boolean output = first.isPallindrome(str);
        //then
        assertTrue(output);
    }

    @Test
    public void should_return_false_isNotPallindrome(){
        //given
        String str = "Miracle";
        //when
        boolean output = first.isPallindrome(str);
        //then
        assertFalse(output);
    }

    @Test
    public void should_Throws_RuntimeException_Calculate_Average(){
        //given
      List<BigDecimal> decimal = new ArrayList<>();
        //when
        Executable executable = () -> first.calculateAverage(decimal);
        //then
        assertThrows(RuntimeException.class, executable);
    }


    @Test
    public void should_Calculate_Corect_Average(){
        //given
        decimalValue.add(new BigDecimal(1));
        decimalValue.add(new BigDecimal(2));
        decimalValue.add(new BigDecimal(3));
        decimalValue.add(new BigDecimal(4));
        decimalValue.add(new BigDecimal(5));
        //when
        BigDecimal actual = first.calculateAverage(decimalValue);
        BigDecimal expected = new BigDecimal(3);
        //then
        assertEquals(expected,actual);
    }

    @Test
    public void should_Filter_Even_Corectly(){
        //given
       List<Integer> actual = new ArrayList<>(Arrays.asList(3,4,5,6,8,10));
        //when
        actual = first.filterEvenElements(actual);
        List<Integer> expected = new ArrayList(Arrays.asList(3,5));
        //then
        assertEquals(expected,actual);
    }

    @Test
    public void should_return_correct_string() {
        //given
  String str = "Big Daddy";
  String rpStr = "Small";
  String substr= "Big";

        //when
        String expected = "Small Daddy";
        String actual = first.replaceSubString(str,substr,rpStr);
        //then
        assertEquals(expected,actual);
    }

    @Test
    public void try_to_use_null_replacement_string() {
        //given
        String str = "Big Daddy";
        String rpStr = null;
        String substr= "Big";

        //when
        String expected = "Big Daddy";
        String actual = first.replaceSubString(str,substr,rpStr);
        //then
        assertEquals(expected,actual);
    }



}