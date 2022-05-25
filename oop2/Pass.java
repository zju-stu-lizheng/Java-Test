class School {
    int line;

    School(int _line) {
        line = _line;
    }

    public void setLine(int _line) {
        line = _line;
    }

    public int getLine() {
        return line;
    }
}

class Student {
    String name;
    String id;
    int total;
    int sports;

    Student(String _name, String _id, int _total, int _sports) {
        name = _name;
        id = _id;
        total = _total;
        sports = _sports;
    }

    public int getTotal() {
        return total;
    }

    public int getSports() {
        return sports;
    }

    public String getMessage() {
        return id + " " + name + " " + total + " " + sports;
    }
}

public class Pass { // 注意划线部分(1)和(2)需要补充完整
    public static void status(Student stu, School sch) {
        if (stu.getTotal() > sch.getLine() || (stu.getTotal() > 300 && stu.getSports() > 96))
            System.out.println(stu.getMessage() + "  被录取");
        else
            System.out.println(stu.getMessage() + "  没有被录取");
    }

    public static void main(String[] args) {
        School sch1 = new School(350);
        Student stu1 = new Student("李成", "2009001", 320, 98);
        Student stu2 = new Student("张名", "2009012", 386, 90);
        Student stu3 = new Student("黄影", "2009322", 345, 95);
        status(stu1, sch1);
        status(stu2, sch1);
        status(stu3, sch1);
    }
}