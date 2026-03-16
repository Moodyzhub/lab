package model;

public enum TaskType {
    CODE(1, "Code"),
    TEST(2, "Test"),
    DESIGN(3, "Design"),
    REVIEW(4, "Review");

    private final int id;
    private final String name;

    TaskType(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public static TaskType getById(int id) {
        for (TaskType t : TaskType.values()) {
            if (t.id == id) {
                return t;
            }

        }
        return null;
    }
}
