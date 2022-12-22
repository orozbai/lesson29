package Task3.movies;

public class Cast {
    private final String fullName;
    private String role;

    public Cast(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return String.format("Имя %s, Роль %s", fullName, role);
    }
}
