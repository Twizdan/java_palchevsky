package tasks.kontrolnaya_polsem;

abstract class Student {
    private String name = "Карим";
    private Integer age = 19;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

}
