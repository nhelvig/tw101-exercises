package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float numberOfRectangles = 0;
        float sumOfAreas = 0;
        for (Rectangle rectangle : rectangles) {
            sumOfAreas += rectangle.area();
            numberOfRectangles += 1;
        }

        float averageArea = sumOfAreas / numberOfRectangles;
        return averageArea;
    }
}
