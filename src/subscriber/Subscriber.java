package subscriber;

public class Subscriber {
    private int id;
    private String name;
    private String email;
    private String preferences;
    private String plan;

    public Subscriber(int id, String name, String email, String preferences, String plan) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.preferences = preferences;
        this.plan = plan;
    }
    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPreferences() { return preferences; }
    public String getPlan() { return plan; }

    public void setPreferences(String preferences) { this.preferences = preferences; }
    public void setPlan(String plan) { this.plan = plan; }

    // Methods
    public String getSubscriberInfo() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Plan: " + plan;
    }

    public String buildDigest(Article[] articles) {
        // Default digest (basic)
        StringBuilder sb = new StringBuilder("Digest for " + name + ":\n");
        int count = 0;
        for (Article a : articles) {
            if (a.getCategory().equalsIgnoreCase(preferences)) {
                sb.append(a.getTitle()).append(" (").append(a.getPublisher()).append(")\n");
                count++;
                if (count >= 3) break; // limit for Free
            }
        }
        return sb.toString();
    }
}

