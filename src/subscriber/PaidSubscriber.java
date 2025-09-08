package subscriber;
public class PaidSubscriber extends Subscriber {
	public PaidSubscriber(int id, String name, String email, String preferences) {
		super(id, name, email, preferences,"PAID");
		// TODO Auto-generated constructor stub
	}

// Overriding digest: No limit
@Override
public String buildDigest(Article[] articles) {
    StringBuilder sb = new StringBuilder("Premium Digest for " + getName() + ":\n");
    for (Article a : articles) {
        if (a.getCategory().equalsIgnoreCase(getPreferences())) {
            sb.append(a.getTitle()).append(" (").append(a.getPublisher()).append(")\n");
        }
    }
    return sb.toString();
}
}

