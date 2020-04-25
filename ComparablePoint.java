/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter10/e18-ComparablePoint
*/ 

public int compareTo(Point2D other) {
    Point2D origin = new Point2D();
    double d1 = this.distance(origin);
    double d2 = other.distance(origin);
    if (d1 > d2) {
        return 1;
    }
    if (d1 < d2) {
        return -1;
    } else {
        return 0;
    }
}
