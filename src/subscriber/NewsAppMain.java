package subscriber;

public class NewsAppMain {
    public static void main(String[] args) {
        NewsService service = new NewsService();

        // Add sources
        service.addSource(new Source(1, "TechCrunch", "Tech", 4.5));
        service.addSource(new Source(2, "ESPN", "Sports", 4.0));
        service.addSource(new Source(3, "Wired", "Tech", 4.8));
        service.addSource(new Source(4, "BBC", "Sports", 4.7));

        // Fetch simulated articles
        service.fetchArticles();

        // Subscribers (Polymorphism with List)
        Subscriber s1 = new FreeSubscriber(101, "Alice", "alice@mail.com", "Tech");
        Subscriber s2 = new PaidSubscriber(102, "Bob", "bob@mail.com", "Sports");
        Subscriber s3 = new PaidSubscriber(103, "Charlie", "charlie@mail.com", "Tech");


        Article[] techArticles = service.filter("Tech");
        Article[] sportsArticles = service.filter("Sports");

        // Generate Digests
        System.out.println(s1.buildDigest(techArticles));
        System.out.println(s2.buildDigest(sportsArticles));
        System.out.println(s3.buildDigest(techArticles));

        // Print Source Reports
        System.out.println("\n--- Source Trust Reports ---");
        for (Source src : service.getSources()) {
            System.out.println(src.getSourceInfo());
        }
    }
}
