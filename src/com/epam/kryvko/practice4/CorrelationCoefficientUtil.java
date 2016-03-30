package com.epam.kryvko.practice4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ghost on 26.03.2016.
 */
public class CorrelationCoefficientUtil {

    public CorrelationResult calculate(Student st1, Student st2) {
        CorrelationResult result = new CorrelationResult();
        result.setStudent1(st1);
        result.setStudent2(st2);
        float xAvg = 0;
        float yAvg = 0;
        float sum = 0;
        float sumDx =0;
        float sumDy = 0;
        List<Matcher> matchers = getMatchers(st1.getMarks(), st2.getMarks());
        if (matchers.size() > 0) {
            for (Matcher matcher : matchers) {
                xAvg += matcher.getX();
                yAvg += matcher.getY();
            }
            xAvg /= matchers.size();
            yAvg /= matchers.size();
            for (Matcher matcher : matchers) {
                float dx = matcher.getX() - xAvg;
                float dy = matcher.getY() - yAvg;
                sum += (dx * dy);
                sumDx += dx * dx;
                sumDy += dy * dy;
            }
            result.setCoefficient( (float) (sum/Math.sqrt(sumDx*sumDy)));
        }
        else
        {
            result.setCoefficient(0.0f);
        }
        return result;
    }


    private List<Matcher> getMatchers(List<Mark> marks1, List<Mark> marks2) {
        List<Matcher> matcherList = new ArrayList<>();
        int min = marks1.size() < marks2.size() ? marks1.size() : marks2.size();
        for (int p1 = 0, p2 = 0; p1 < marks1.size() && p2 < marks2.size(); ) {
            if (marks1.get(p1).getNumber() == marks2.get(p2).getNumber()) {
                Matcher matcher = new Matcher(marks1.get(p1).getMark(), marks2.get(p2).getMark());
                matcherList.add(matcher);
                p1++;
                p2++;
            } else if (marks1.get(p1).getNumber() > marks1.get(p2).getNumber()) {
                p2++;
            } else {
                p1++;
            }
        }
        return matcherList;
    }

}
