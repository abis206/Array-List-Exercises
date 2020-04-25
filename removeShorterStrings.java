/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter10/e14-removeShorterStrings
*/

public static void removeShorterStrings(ArrayList < String > list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() > list.get(i + 1).length()) {
                list.remove(i + 1);
            } else {
                list.remove(i);
            }

        }
