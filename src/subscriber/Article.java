package subscriber;

class Article {
    private int articleId;
    private String title;
    private String category;
    private String publisher;
    private String publishTime;

    public Article(int articleId, String title, String category, String publisher, String publishTime) {
        this.articleId = articleId;
        this.title = title;
        this.category = category;
        this.publisher = publisher;
        this.publishTime = publishTime;
    }

    // Getters
    public int getArticleId() { return articleId; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getPublisher() { return publisher; }
    public String getPublishTime() { return publishTime; }

    public String getArticleInfo() {
        return "[" + category + "] " + title + " by " + publisher + " at " + publishTime;
    }
}

