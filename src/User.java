public class User {

    private int id = 0;
    private String name = "Undefined";
    private Boolean auth = false;
    private Enum role = EUserRole.USER;

    public User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.auth = builder.auth;
        this.role = builder.role;
    }

    public User(UserBuilder builder, Enum role) {
        this.id = builder.id;
        this.name = builder.name;
        this.auth = builder.auth;
        this.role = role;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auth='" + auth + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class UserBuilder {

        private int id = 0;
        private String name = "Undefined";
        private Boolean auth = false;
        private Enum role = EUserRole.USER;

        public UserBuilder(int id, String name, Boolean auth, Enum role) {
            this.id = id;
            this.name = name;
            this.auth = auth;
            this.role = role;
        }

        public User buildAdmin() {
            return new User(this, EUserRole.ADMIN);
        }

        public User buildUser() {
            return new User(this, EUserRole.USER);
        }

        public User build() {
            return new User(this);
        }
    }
}
