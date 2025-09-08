package subscriber;

class FreeSubscriber extends Subscriber {
    public FreeSubscriber(int id, String name, String email, String preferences) {
        super(id, name, email, preferences, "FREE");
    }

    // Overriding digest: Limit to 2 articles
    @Override
    public String buildDigest(Article[] articles) {
        StringBuilder sb = new StringBuilder("Free Digest for " + getName() + ":\n");
        int count = 0;
        for (Article a : articles) {
            if (a.getCategory().equalsIgnoreCase(getPreferences())) {
                sb.append(a.getTitle()).append(" (").append(a.getPublisher()).append(")\n");
                count++;
                if (count >= 2) break;
            }
        }
        return sb.toString();
    }
}
        