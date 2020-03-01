package com.healthycoderapp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class HealthCoderAppTest{
    private DietPlanner dietPlanner;
    private Coder coder;
    @ParameterizedTest
   @ValueSource(doubles = {87.6,90.1,80.2})
    public void should_return_true_when_diet_is_Recommended( double checkWeight){
        //given
        double weight = checkWeight;
        double height = 1.7;
        //when
        boolean output = BMICalculator.isDietRecommended(weight, height);
        //then
        assertTrue(output);
    }

    @Test
    public void should_return_false_when_diet_is_Recommended() {
        //given
        double weight = 50;
        double height = 1.9;
        //when
        boolean output = BMICalculator.isDietRecommended(weight, height);
        //then
        assertFalse(output);
    }

    @Test
    public void should_throw_arithmaticException_when_height_isZero() {
        //given
        double weight = 50;
        double height = 0;
        //when
        Executable executable = () -> BMICalculator.isDietRecommended(weight, height);
        //then
        assertThrows(ArithmeticException.class, executable);
    }

    // Multiple Assertions
    @Test
    public void should_return_worst_BMI() {
        //given
        List list = new ArrayList();
        list.add(new Coder(1.8, 60));
        list.add(new Coder(1.5, 70));
        list.add(new Coder(1.8, 92));
        //when
        Coder BMI = BMICalculator.findCoderWithWorstBMI(list);
        //then
        assertAll(
                () -> assertEquals(1.5, BMI.getHeight()),
                () -> assertEquals(70, BMI.getWeight()));
    }


    @Test
    public void should_true_if_List_is_NULL() {
        //given
        List list = new ArrayList();
        //when
        Coder BMI = BMICalculator.findCoderWithWorstBMI(list);
        //then
        assertNull(BMI);
    }


    @Test
    public void check_correct_BMI_Scores() {
        //given
        List<Coder> list = new ArrayList();
        list.add(new Coder(1.8, 60));
        list.add(new Coder(1.5, 70));
        list.add(new Coder(1.8, 92));

        //when
        double[] expected = {18.52,31.11,28.4};
        double[] actual = BMICalculator.getBMIScores(list);
        //then
        assertAll(
                () -> assertArrayEquals(expected, actual));
    }





    @BeforeEach
    void setup(){
        this.dietPlanner = new DietPlanner(20,30,50);
    }
    @Test
    void should_calculate_correctDiet_plan() {
        //given
        Coder coder = new Coder(1.82,75,26,Gender.MALE);
        DietPlan expected = new DietPlan(2202,110,73,275);
        //when
        DietPlan  actual = dietPlanner.calculateDiet(coder);
        assertAll(
                ()->assertEquals(expected.getCalories(),actual.getCalories()),
                ()->assertEquals(expected.getCarbohydrate(),actual.getCarbohydrate()),
                ()->assertEquals(expected.getFat(),actual.getFat()),
                ()->assertEquals(expected.getProtein(),actual.getProtein())
        );
    }
}