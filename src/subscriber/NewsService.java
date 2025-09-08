package subscriber;

import java.util.*;

class NewsService {
 private List<Source> sources = new ArrayList<>();
 private List<Article> articles = new ArrayList<>();

 // Add Source
 public void addSource(Source s) {
     sources.add(s);
 }

 // Fetch Articles (Simulated)
 public void fetchArticles() {
     articles.add(new Article(1, "AI beats humans in coding", "Tech", "TechCrunch", "10:00AM"));
     articles.add(new Article(2, "New Football League Starts", "Sports", "ESPN", "11:00AM"));
     articles.add(new Article(3, "Quantum Computing Breakthrough", "Tech", "Wired", "12:00PM"));
     articles.add(new Article(4, "Olympics 2025 Highlights", "Sports", "BBC", "01:00PM"));
 }

 // Overloading filter
 public Article[] filter(String category) {
     return articles.stream().filter(a -> a.getCategory().equalsIgnoreCase(category)).toArray(Article[]::new);
 }

 public Article[] filter(String category, String keyword) {
     return articles.stream()
             .filter(a -> a.getCategory().equalsIgnoreCase(category) && a.getTitle().contains(keyword))
             .toArray(Article[]::new);
 }

 public Article[] filterByTime(String time) {
     return articles.stream().filter(a -> a.getPublishTime().equalsIgnoreCase(time)).toArray(Article[]::new);
 }

 public List<Source> getSources() { return sources; }
 public List<Article> getArticles() { return articles; }
}

