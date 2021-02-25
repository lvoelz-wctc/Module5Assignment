package edu.wctc;

import java.util.Map;
import java.util.*;

public class FirstNameUtility {
    private Map<String, Integer> firstNameCodeMap;
    private Map<String, Integer> firstInitialCodeMap;
    private Map<String, Integer> middleInitialCodeMap;

    public FirstNameUtility(Map<String, Integer> firstNameCodeMap, Map<String, Integer> firstInitialCodeMap, Map<String, Integer> middleInitialCodeMap) {
        this.firstNameCodeMap = firstNameCodeMap;
        this.firstInitialCodeMap = firstInitialCodeMap;
        this.middleInitialCodeMap = middleInitialCodeMap;
        this.firstNameCodeMap.put("ALBERT", 20);
        this.firstNameCodeMap.put("ALICE", 20);
        this.firstNameCodeMap.put("ANN", 40);
        this.firstNameCodeMap.put("ANNA", 40);
        this.firstNameCodeMap.put("ANNE", 40);
        this.firstNameCodeMap.put("ANNIE", 40);
        this.firstNameCodeMap.put("ARTHUR", 40);
        this.firstNameCodeMap.put("BERNARD", 80);
        this.firstNameCodeMap.put("BETTE", 80);
        this.firstNameCodeMap.put("BETTIE", 80);
        this.firstNameCodeMap.put("BETTY", 80);
        this.firstNameCodeMap.put("CARL", 120);
        this.firstNameCodeMap.put("CATHERINE", 120);
        this.firstNameCodeMap.put("CHARLES", 140);
        this.firstNameCodeMap.put("CLARA", 140);
        this.firstNameCodeMap.put("DONALD", 180);
        this.firstNameCodeMap.put("DOROTHY", 180);
        this.firstNameCodeMap.put("EDWARD", 220);
        this.firstNameCodeMap.put("ELIZABETH", 220);
        this.firstNameCodeMap.put("FLORENCE", 260);
        this.firstNameCodeMap.put("FRANK", 260);
        this.firstNameCodeMap.put("GEORGE", 300);
        this.firstNameCodeMap.put("GRACE", 300);
        this.firstNameCodeMap.put("HAROLD", 340);
        this.firstNameCodeMap.put("HARRIET", 340);
        this.firstNameCodeMap.put("HARRY", 360);
        this.firstNameCodeMap.put("HAZEL", 360);
        this.firstNameCodeMap.put("HELEN", 380);
        this.firstNameCodeMap.put("HENRY", 380);
        this.firstNameCodeMap.put("JAMES", 440);
        this.firstNameCodeMap.put("JANE", 440);
        this.firstNameCodeMap.put("JAYNE", 440);
        this.firstNameCodeMap.put("JEAN", 460);
        this.firstNameCodeMap.put("JOAN", 480);
        this.firstNameCodeMap.put("JOHN", 460);
        this.firstNameCodeMap.put("JOSEPH", 480);
        this.firstNameCodeMap.put("MARGARET", 560);
        this.firstNameCodeMap.put("MARTIN", 560);
        this.firstNameCodeMap.put("MARVIN", 580);
        this.firstNameCodeMap.put("MARY", 580);
        this.firstNameCodeMap.put("MELVIN", 600);
        this.firstNameCodeMap.put("MILDRED", 600);
        this.firstNameCodeMap.put("PATRICIA", 680);
        this.firstNameCodeMap.put("PAUL", 680);
        this.firstNameCodeMap.put("RICHARD", 740);
        this.firstNameCodeMap.put("ROBERT", 760);
        this.firstNameCodeMap.put("RUBY", 740);
        this.firstNameCodeMap.put("RUTH", 760);
        this.firstNameCodeMap.put("THELMA", 820);
        this.firstNameCodeMap.put("THOMAS", 820);
        this.firstNameCodeMap.put("WALTER", 900);
        this.firstNameCodeMap.put("WANDA", 900);
        this.firstNameCodeMap.put("WILLIAM", 920);
        this.firstNameCodeMap.put("WILMA", 920);
        this.firstInitialCodeMap.put("A", 0);
        this.firstInitialCodeMap.put("B", 60);
        this.firstInitialCodeMap.put("C", 100);
        this.firstInitialCodeMap.put("D", 160);
        this.firstInitialCodeMap.put("E", 200);
        this.firstInitialCodeMap.put("F", 240);
        this.firstInitialCodeMap.put("G", 280);
        this.firstInitialCodeMap.put("H", 320);
        this.firstInitialCodeMap.put("I", 400);
        this.firstInitialCodeMap.put("J", 420);
        this.firstInitialCodeMap.put("K", 500);
        this.firstInitialCodeMap.put("L", 520);
        this.firstInitialCodeMap.put("M", 540);
        this.firstInitialCodeMap.put("N", 620);
        this.firstInitialCodeMap.put("O", 640);
        this.firstInitialCodeMap.put("P", 660);
        this.firstInitialCodeMap.put("Q", 700);
        this.firstInitialCodeMap.put("R", 720);
        this.firstInitialCodeMap.put("S", 780);
        this.firstInitialCodeMap.put("T", 800);
        this.firstInitialCodeMap.put("U", 840);
        this.firstInitialCodeMap.put("V", 860);
        this.firstInitialCodeMap.put("W", 880);
        this.firstInitialCodeMap.put("X", 940);
        this.firstInitialCodeMap.put("Y", 960);
        this.firstInitialCodeMap.put("Z", 980);
        this.middleInitialCodeMap.put("A", 1);
        this.middleInitialCodeMap.put("B", 2);
        this.middleInitialCodeMap.put("C", 3);
        this.middleInitialCodeMap.put("D", 4);
        this.middleInitialCodeMap.put("E", 5);
        this.middleInitialCodeMap.put("F", 6);
        this.middleInitialCodeMap.put("G", 7);
        this.middleInitialCodeMap.put("H", 8);
        this.middleInitialCodeMap.put("I", 9);
        this.middleInitialCodeMap.put("J", 10);
        this.middleInitialCodeMap.put("K", 11);
        this.middleInitialCodeMap.put("L", 12);
        this.middleInitialCodeMap.put("M", 13);
        this.middleInitialCodeMap.put("N", 14);
        this.middleInitialCodeMap.put("O", 14);
        this.middleInitialCodeMap.put("P", 15);
        this.middleInitialCodeMap.put("Q", 15);
        this.middleInitialCodeMap.put("R", 16);
        this.middleInitialCodeMap.put("S", 17);
        this.middleInitialCodeMap.put("T", 18);
        this.middleInitialCodeMap.put("U", 18);
        this.middleInitialCodeMap.put("V", 18);
        this.middleInitialCodeMap.put("W", 19);
        this.middleInitialCodeMap.put("X", 19);
        this.middleInitialCodeMap.put("Y", 19);
        this.middleInitialCodeMap.put("Z", 19);}

        public int encodeFirstName(String firstName, String middleInitial) throws MissingNameException {
        String firstInitial = String.valueOf(firstName.charAt(0));

        if (firstName == null){
            throw new MissingNameException();
        }

        if (firstNameCodeMap.containsKey(firstName)){
            return ((firstNameCodeMap.get(firstName) + middleInitialCodeMap.get(middleInitial))); // sum of firstName value + middleInitial value
        }
        else if (!firstNameCodeMap.containsKey(firstName)) {
            return ((middleInitialCodeMap.get(firstInitial) + middleInitialCodeMap.get(middleInitial)));
        }

        else {  //if (middleInitial == null)?
            return middleInitialCodeMap.get(firstInitial);
        }
        }
}

